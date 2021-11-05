package com.infernalwhaler.petclinic.model;

import java.util.Set;

/**
 * Simple JavaBean domain object representing an Owner
 *
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
