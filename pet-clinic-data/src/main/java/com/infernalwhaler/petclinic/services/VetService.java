package com.infernalwhaler.petclinic.services;

import com.infernalwhaler.petclinic.model.Vet;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public interface VetService {

    Vet findById(final Long id);

    Vet save(final Vet vet);

    Set<Vet> findAll();
}
