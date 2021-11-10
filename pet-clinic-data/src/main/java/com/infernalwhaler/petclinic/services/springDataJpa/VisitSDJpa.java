package com.infernalwhaler.petclinic.services.springDataJpa;

import com.infernalwhaler.petclinic.model.Visit;
import com.infernalwhaler.petclinic.repositories.VisitRepository;
import com.infernalwhaler.petclinic.services.VisitService;
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
public class VisitSDJpa implements VisitService {

    private final VisitRepository visitRepository;


    @Autowired
    public VisitSDJpa(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }


    @Override
    public Set<Visit> findAll() {
        final Set<Visit> visits = new HashSet<>();
        visitRepository.findAll()
                .forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(final Long id) {
        return visitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Visit with ID: '" + id + "' Found"));
    }

    @Override
    public Visit save(final Visit visit) {
        return save(visit);
    }

    @Override
    public void delete(final Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(final Long id) {
        visitRepository.deleteById(id);
    }
}
