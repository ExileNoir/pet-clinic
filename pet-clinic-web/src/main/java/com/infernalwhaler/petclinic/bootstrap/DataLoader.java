package com.infernalwhaler.petclinic.bootstrap;

import com.infernalwhaler.petclinic.model.Owner;
import com.infernalwhaler.petclinic.model.Vet;
import com.infernalwhaler.petclinic.services.OwnerService;
import com.infernalwhaler.petclinic.services.VetService;
import com.infernalwhaler.petclinic.services.map.OwnerMapService;
import com.infernalwhaler.petclinic.services.map.VetMapService;
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

    @Autowired
    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        final Owner owner01 = new Owner();
        owner01.setId(1L);
        owner01.setFirstName("Michael");
        owner01.setLastName("Weston");
        ownerService.save(owner01);

        final Owner owner02 = new Owner();
        owner02.setId(2L);
        owner02.setFirstName("Fiona");
        owner02.setLastName("Glennane");
        ownerService.save(owner02);

        out.println("Loaded Owners...");

        final Vet vet01 = new Vet();
        vet01.setId(1L);
        vet01.setFirstName("Sam");
        vet01.setLastName("Axe");
        vetService.save(vet01);

        final Vet vet02 = new Vet();
        vet02.setId(2L);
        vet02.setFirstName("Jessie");
        vet02.setLastName("Porter");
        vetService.save(vet02);

        out.println("Loaded Vets...");
    }
}
