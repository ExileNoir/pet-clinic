package com.infernalwhaler.petclinic.model;

/**
 * Simple JavaBean domain object representing a Pet Type.
 *
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public class PetType extends BaseEntity {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
