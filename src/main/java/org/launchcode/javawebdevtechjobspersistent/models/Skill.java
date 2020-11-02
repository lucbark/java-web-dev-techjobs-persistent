package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "You forgot to add a description of skill(s)...")
    private String fullDescription;

    public Skill (String fullDescriptionOfSkill) {
        this.fullDescription = fullDescriptionOfSkill;
    }

    public Skill (){}

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }
}