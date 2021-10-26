package com.infernalwhaler.petclinic.services;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 25/10/2021
 */

public interface CrudService<T, ID>{

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
