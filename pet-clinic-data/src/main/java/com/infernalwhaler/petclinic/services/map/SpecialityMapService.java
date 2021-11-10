package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.Speciality;
import com.infernalwhaler.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 8/11/2021
 */

@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(final Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public void delete(final Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }
}
