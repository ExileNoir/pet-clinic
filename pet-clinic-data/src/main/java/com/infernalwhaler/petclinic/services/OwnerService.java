package com.infernalwhaler.petclinic.services;

import com.infernalwhaler.petclinic.model.Owner;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public interface OwnerService {

    Owner findByLastName(final String lastName);

    Owner findById(final Long id);

    Owner save(final Owner owner);

    Set<Owner> findAll();
}
