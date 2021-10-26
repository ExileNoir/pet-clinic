package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 25/10/2021
 */

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected  Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(final ID id) {
        return map.get(id);
    }

    T save(final ID id, final T object) {
        map.put(id, object);

        return object;
    }

    void deleteById(final ID id) {
        map.remove(id);
    }

    void delete(final T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
