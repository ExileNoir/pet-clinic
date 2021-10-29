package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.BaseEntity;

import java.util.*;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 25/10/2021
 */

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(final ID id) {
        return map.get(id);
    }

    T save(final T object) {
        if (Objects.nonNull(object)) {
            if (Objects.isNull(object.getId())) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be NULL");
        }
        return object;
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }

    void deleteById(final ID id) {
        map.remove(id);
    }

    void delete(final T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
