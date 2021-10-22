package com.infernalwhaler.petclinic.model;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public class PetType extends BaseEntity {

    private String name;

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
