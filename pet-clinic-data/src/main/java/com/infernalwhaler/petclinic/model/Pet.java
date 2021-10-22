package com.infernalwhaler.petclinic.model;

import java.time.LocalDate;

/**
 * Simple JavaBean domain object representing a Pet
 *
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public Pet() {
    }

    public Pet(PetType petType, Owner owner, LocalDate birthDate) {
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
