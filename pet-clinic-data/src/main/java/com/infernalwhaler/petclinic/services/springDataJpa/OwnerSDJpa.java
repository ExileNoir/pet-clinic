package com.infernalwhaler.petclinic.services.springDataJpa;

import com.infernalwhaler.petclinic.model.Owner;
import com.infernalwhaler.petclinic.repositories.OwnerRepository;
import com.infernalwhaler.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 10/11/2021
 */

@Service
@Profile("springdatajpa")
public class OwnerSDJpa implements OwnerService {

    private final OwnerRepository ownerRepository;


    @Autowired
    public OwnerSDJpa(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    @Override
    public Owner findByLastName(final String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        final Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll()
                .forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(final Long id) {
        return ownerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No owner with ID: '" + id + "' found"));
    }

    @Override
    public Owner save(final Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(final Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(final Long id) {
        ownerRepository.deleteById(id);
    }
}
