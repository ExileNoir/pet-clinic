package com.infernalwhaler.petclinic.services;

import com.infernalwhaler.petclinic.model.Owner;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(final String lastName);
}
