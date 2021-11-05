package com.infernalwhaler.petclinic.model;

import java.util.Set;

/**
 * Simple JavaBean domain object representing a Vet
 *
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public class Vet extends Owner {

    private Set<Speciality> specialities;


    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
