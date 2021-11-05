package com.infernalwhaler.petclinic.model;

/**
 * Simple JavaBean domain object representing a Speciality.
 *
 * @author sDeseure
 * @project pet-clinic
 * @date 5/11/2021
 */

public class Speciality extends BaseEntity {

    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
