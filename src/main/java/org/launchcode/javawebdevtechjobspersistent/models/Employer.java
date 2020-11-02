package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Where is it?")
    @Size(min = 1, max = 255, message = "Location name can be between 1 and 255 characters.")
    private String location;


    public Employer(String employerLocation){
        this.location = employerLocation;
    }



    public Employer() {}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
