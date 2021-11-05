package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.PetType;
import com.infernalwhaler.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 5/11/2021
 */

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(final PetType petType) {
        return super.save(petType);
    }

    @Override
    public void delete(final PetType petType) {
        super.delete(petType);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }
}
