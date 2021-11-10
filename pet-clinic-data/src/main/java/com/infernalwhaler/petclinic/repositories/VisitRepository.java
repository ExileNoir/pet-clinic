package com.infernalwhaler.petclinic.repositories;

import com.infernalwhaler.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 10/11/2021
 */

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
