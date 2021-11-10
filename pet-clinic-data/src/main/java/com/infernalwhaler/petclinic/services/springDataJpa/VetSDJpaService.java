package com.infernalwhaler.petclinic.services.springDataJpa;

import com.infernalwhaler.petclinic.model.Vet;
import com.infernalwhaler.petclinic.repositories.VetRepository;
import com.infernalwhaler.petclinic.services.VetService;
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
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;


    @Autowired
    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }


    @Override
    public Set<Vet> findAll() {
        final Set<Vet> vets = new HashSet<>();
        vetRepository.findAll()
                .forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(final Long id) {
        return vetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No vet with ID: '" + id + "' Found"));
    }

    @Override
    public Vet save(final Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(final Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(final Long id) {
        vetRepository.deleteById(id);
    }
}
