package com.infernalwhaler.petclinic.services.springDataJpa;

import com.infernalwhaler.petclinic.model.PetType;
import com.infernalwhaler.petclinic.repositories.PetTypeRepository;
import com.infernalwhaler.petclinic.services.PetTypeService;
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
public class PetTypeSDJpa implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    @Autowired
    public PetTypeSDJpa(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        final Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll()
                .forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(final Long id) {
        return petTypeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("No Pet Type with ID: '"+id+"' Found"));
    }

    @Override
    public PetType save(final PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(final PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(final Long id) {
        petTypeRepository.deleteById(id);
    }
}
