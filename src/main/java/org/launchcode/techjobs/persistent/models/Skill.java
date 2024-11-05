package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 255, message = "Description must be less than 255 characters.")
    private String description;

    public Skill() {
    }

    public Skill(String description) {
        this.description = description;
    }

    public @Size(max = 255, message = "Description must be less than 255 characters.") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 255, message = "Description must be less than 255 characters.") String description) {
        this.description = description;
    }
}
