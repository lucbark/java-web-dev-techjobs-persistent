package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Job extends AbstractEntity{ // Update job model

//    @Id 1
//    @GeneratedValue
//    private int id;
//
//   private String name;

    @ManyToOne //3
    @NotNull(message = "This is important stuff that cannot be left blank")
    private Employer employer; //2 I may have many employer in Employer category

    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
