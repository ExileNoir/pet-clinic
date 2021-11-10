package com.infernalwhaler.petclinic.services.springDataJpa;

import com.infernalwhaler.petclinic.model.Pet;
import com.infernalwhaler.petclinic.repositories.PetRepository;
import com.infernalwhaler.petclinic.services.PetService;
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
public class PetSDJpa implements PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetSDJpa(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    @Override
    public Set<Pet> findAll() {
        final Set<Pet> pets = new HashSet<>();
        petRepository.findAll()
                .forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(final Long id) {
        return petRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Pet with ID: '" + id + "' Found"));
    }

    @Override
    public Pet save(final Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(final Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(final Long id) {
        petRepository.deleteById(id);
    }
}
