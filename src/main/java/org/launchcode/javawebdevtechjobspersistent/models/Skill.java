package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "You forgot to add a description of skill(s)...")
    private String description; //Part 2 Models add a field for a longer description

    @ManyToMany( mappedBy = "skills")
    @NotNull(message = "Please put something... Anything!")
    private List<Job> jobs = new ArrayList<>();

    public Skill (String fullDescriptionOfSkill) {
        this.description = fullDescriptionOfSkill;
    }
    //Skill.jobs portion
    public Skill(@NotBlank(message = "You forgot to add a description of skill(s)...") String description, List<Job> jobs) {
        this.description = description;
        this.jobs = jobs;
    }


    public void addJobs(Job job) {
        this.jobs.add(job);
    }
    public Skill (){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}