package com.infernalwhaler.petclinic.services.map;

import com.infernalwhaler.petclinic.model.Visit;
import com.infernalwhaler.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 10/11/2021
 */

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(final Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(final Visit visit) {
        if (Objects.isNull(visit.getPet())
                || Objects.isNull(visit.getPet().getOwner())
                || Objects.isNull(visit.getPet().getId())
                || Objects.isNull(visit.getPet().getOwner().getId())) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(final Visit visit) {
        super.delete(visit);
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }
}
