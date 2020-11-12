package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Job extends AbstractEntity{ // Update job model

//    @Id 1
//    @GeneratedValue
//    private int id;
//
//   private String name;

    @ManyToOne //3 Add a many to one annotation on the field employer
    //@NotNull(message = "This is important stuff that cannot be left blank")
    private Employer employer; //2 Replace the type of the field employer to be of type Employer

    //private String skills;
    @ManyToMany
    //@NotNull(message = "Please put something... Anything!")
    private List<Skill> skills = new ArrayList<>(); //Part4 update Job model class


    public Job(@NotNull(message = "This is important stuff that cannot be left blank") Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Job() {
    }

    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }

    //    public Job(Employer anEmployer, List<Skill> someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }



    // Getters and setters.

//    public String getName() { 1
//        return name;
//    }

//    public void setName(String name) { 1
//        this.name = name;
//    }


    public Employer getEmployer() { //2
        return employer;
    }

    public void setEmployer(Employer employer) { //2
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
