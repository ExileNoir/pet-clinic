package com.infernalwhaler.petclinic.bootstrap;

import com.infernalwhaler.petclinic.model.*;
import com.infernalwhaler.petclinic.services.OwnerService;
import com.infernalwhaler.petclinic.services.PetTypeService;
import com.infernalwhaler.petclinic.services.SpecialityService;
import com.infernalwhaler.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import static java.lang.System.out;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 29/10/2021
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }


    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        final PetType dog = getPetType("Dog");
        final PetType savedDogPetType = petTypeService.save(dog);

        final PetType cat = getPetType("Cat");
        final PetType savedCatPetType = petTypeService.save(cat);

        out.println("Loaded PetTypes...");

        final Speciality radiology = getSpeciality("Radiology");
        final Speciality savedRadiology = specialityService.save(radiology);

        final Speciality surgery = getSpeciality("Surgery");
        final Speciality savedSurgery = specialityService.save(surgery);

        final Speciality dentistry = getSpeciality("Dentistry");
        final Speciality savedDentistry = specialityService.save(dentistry);

        out.println("Loaded Specialities");

        final Owner owner01 =
                getOwner("Michael", "Weston", "123 Brickerel", "Miami", "123456");
        createPet(savedDogPetType, owner01, "Rosco");

        ownerService.save(owner01);

        final Owner owner02 =
                getOwner("Fiona", "Glennane", "123 Mulholland D", "Miami", "987456");
        createPet(savedCatPetType, owner02, "Felix");

        ownerService.save(owner02);

        out.println("Loaded Owners...");

        final Vet vet01 = getVet("Sam", "Axe", savedRadiology);
        vetService.save(vet01);
        final Vet vet02 = getVet("Jessie", "Porter", savedSurgery);
        vetService.save(vet02);

        out.println("Loaded Vets...");
    }

    private Speciality getSpeciality(final String specialityType) {
        final Speciality speciality = new Speciality();
        speciality.setDescription(specialityType);
        return speciality;
    }

    private void createPet(final PetType savedDogPetType, final Owner owner01, String rosco) {
        final Pet mikesDog = new Pet();
        mikesDog.setPetType(savedDogPetType);
        mikesDog.setOwner(owner01);
        mikesDog.setBirthDate(LocalDate.now());
        mikesDog.setName(rosco);
        owner01.getPets().add(mikesDog);
    }

    private Owner getOwner(final String firstName, final String lastName,
                           final String address, final String city, final String telephone) {
        final Owner owner = new Owner();
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        owner.setAddress(address);
        owner.setCity(city);
        owner.setTelephone(telephone);
        return owner;
    }

    private Vet getVet(final String firstName, final String lastName, final Speciality speciality) {
        final Vet vet = new Vet();
        vet.setFirstName(firstName);
        vet.setLastName(lastName);
        vet.getSpecialities().add(speciality);
        return vet;
    }

    private PetType getPetType(final String type) {
        final PetType dog = new PetType();
        dog.setName(type);
        return dog;
    }
}
