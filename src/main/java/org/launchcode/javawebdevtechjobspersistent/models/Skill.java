package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "You forgot to add a description of skill(s)...")
    private String description;

    public Skill (String fullDescriptionOfSkill) {
        this.description = fullDescriptionOfSkill;
    }

    public Skill (){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String fullDescription) {
        this.description = fullDescription;
    }
}