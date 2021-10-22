package com.infernalwhaler.petclinic.model;

/**
 * Simple JavaBean domain object representing a Person.
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public class Person {

    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
