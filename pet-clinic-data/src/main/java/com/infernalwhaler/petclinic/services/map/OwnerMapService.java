package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.Owner;
import com.infernalwhaler.petclinic.services.OwnerService;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 25/10/2021
 */

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(final Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(final Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(final String lastName) {
        return null;
    }
}
