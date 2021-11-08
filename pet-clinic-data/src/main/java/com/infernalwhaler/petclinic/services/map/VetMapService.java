package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.Speciality;
import com.infernalwhaler.petclinic.model.Vet;
import com.infernalwhaler.petclinic.services.SpecialityService;
import com.infernalwhaler.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 26/10/2021
 */

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    @Autowired
    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(final Vet vet) {
        if (!vet.getSpecialities().isEmpty()) {
            vet.getSpecialities().forEach(speciality -> {
                if (Objects.isNull(speciality.getId())) {
                    final Speciality savedSpecialty = specialityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public void delete(final Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(final Long id) {
        deleteById(id);
    }
}
