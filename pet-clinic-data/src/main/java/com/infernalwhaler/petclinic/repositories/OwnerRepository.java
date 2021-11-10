package com.infernalwhaler.petclinic.repositories;

import com.infernalwhaler.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 10/11/2021
 */

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
