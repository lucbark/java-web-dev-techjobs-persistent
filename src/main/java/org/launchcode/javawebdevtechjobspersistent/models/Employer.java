package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Where is it?") //Part 2 Models Step 1 location field and annotations
    @Size(min = 1, max = 255, message = "Location name can be between 1 and 255 characters.")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id") //2 Use the OneToMany and JoinColumn annotations to declare relationship
    // between the data tables
    private List<Job> jobs = new ArrayList<>(); //add jobs and initialize it to an empty Arraylist

    public List<Job> getJobs() {
        return jobs;
    }

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
