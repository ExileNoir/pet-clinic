package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.Vet;
import com.infernalwhaler.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 26/10/2021
 */

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(final Vet vet) {
        return super.save(vet);
    }

    @Override
    public void delete(final Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(final Long id) {
        deleteById(id);
    }
}
