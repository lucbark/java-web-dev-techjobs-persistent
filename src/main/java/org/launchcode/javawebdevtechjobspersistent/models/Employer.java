package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {


    private String location;

    @NotBlank(message = "Where is it?")
    public Employer(String location){
        this.location = location;
    }



    public Employer() {}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
