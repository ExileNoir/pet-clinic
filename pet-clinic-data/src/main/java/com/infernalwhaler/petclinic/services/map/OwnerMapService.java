package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.Owner;
import com.infernalwhaler.petclinic.model.Pet;
import com.infernalwhaler.petclinic.services.OwnerService;
import com.infernalwhaler.petclinic.services.PetService;
import com.infernalwhaler.petclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 25/10/2021
 */

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    @Autowired
    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(final Owner owner) {
        if (Objects.nonNull(owner)) {
            if (Objects.nonNull(owner.getPets())) {
                owner.getPets().forEach(pet -> {
                    if (Objects.nonNull(pet.getPetType())) {
                        if (Objects.isNull(pet.getPetType().getId())) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is Required!");
                    }

                    if (Objects.isNull(pet.getId())) {
                        final Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(owner);
        } else {
            return null;
        }
    }

    @Override
    public void delete(final Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(final String lastName) {
        return null;
    }
}
