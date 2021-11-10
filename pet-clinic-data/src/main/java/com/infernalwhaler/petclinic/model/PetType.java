package com.infernalwhaler.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object representing a Pet Type.
 *
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
