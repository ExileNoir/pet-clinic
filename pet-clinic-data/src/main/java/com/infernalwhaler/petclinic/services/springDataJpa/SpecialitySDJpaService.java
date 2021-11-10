package com.infernalwhaler.petclinic.services.springDataJpa;

import com.infernalwhaler.petclinic.model.Speciality;
import com.infernalwhaler.petclinic.repositories.SpecialityRepository;
import com.infernalwhaler.petclinic.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 10/11/2021
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;


    @Autowired
    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }


    @Override
    public Set<Speciality> findAll() {
        final Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll()
                .forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(final Long id) {
        return specialityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Speciality with ID: '" + id + "' Found"));
    }

    @Override
    public Speciality save(final Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(final Speciality speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteById(final Long id) {
        specialityRepository.deleteById(id);
    }
}
