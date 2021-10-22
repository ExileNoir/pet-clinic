package com.infernalwhaler.petclinic.services;

import com.infernalwhaler.petclinic.model.Pet;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public interface PetService {

    Pet findById(final Long id);

    Pet save(final Pet pet);

    Set<Pet> findAll();
}
