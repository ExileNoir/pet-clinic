package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.Pet;
import com.infernalwhaler.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 26/10/2021
 */

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(final Pet pet) {
        return super.save(pet);
    }

    @Override
    public void delete(final Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }
}
