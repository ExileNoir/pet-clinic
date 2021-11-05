package com.infernalwhaler.petclinic.bootstrap;

import com.infernalwhaler.petclinic.model.Owner;
import com.infernalwhaler.petclinic.model.PetType;
import com.infernalwhaler.petclinic.model.Vet;
import com.infernalwhaler.petclinic.services.OwnerService;
import com.infernalwhaler.petclinic.services.PetTypeService;
import com.infernalwhaler.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {
        final Owner owner01 = getOwner("Michael", "Weston");
        ownerService.save(owner01);
        final Owner owner02 = getOwner("Fiona", "Glennane");
        ownerService.save(owner02);

        out.println("Loaded Owners...");

        final Vet vet01 = getVet("Sam", "Axe");
        vetService.save(vet01);
        final Vet vet02 = getVet("Jessie", "Porter");
        vetService.save(vet02);

        out.println("Loaded Vets...");

        final PetType dog = getPetType("Dog");
        final PetType savedDogPetType = petTypeService.save(dog);

        final PetType cat = getPetType("Cat");
        final PetType savedCatPetType = petTypeService.save(cat);

        out.println("Loaded PetTypes...");
    }

    private Owner getOwner(final String firstName, final String lastName) {
        final Owner owner01 = new Owner();
        owner01.setFirstName(firstName);
        owner01.setLastName(lastName);
        return owner01;
    }

    private Vet getVet(final String firstName, final String lastName) {
        final Vet vet01 = new Vet();
        vet01.setFirstName(firstName);
        vet01.setLastName(lastName);
        return vet01;
    }

    private PetType getPetType(final String type) {
        final PetType dog = new PetType();
        dog.setName(type);
        return dog;
    }
}
