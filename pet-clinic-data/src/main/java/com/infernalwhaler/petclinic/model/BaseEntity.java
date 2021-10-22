package com.infernalwhaler.petclinic.model;

import java.io.Serializable;

/**
 * @author sDeseure
 * @project pet-clinic
 * @date 22/10/2021
 */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
