package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.launchcode.javawebdevtechjobspersistent.models.data.EmployerRepository;
import org.launchcode.javawebdevtechjobspersistent.models.data.JobRepository;
import org.launchcode.javawebdevtechjobspersistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController {

    @Autowired
    private EmployerRepository employerRepository; //1 Add a field employerRepository annotated with @Autowired

    @Autowired
    private SkillRepository skillRepository; // Seems like I would want to add this as well as a jobRepository

    @Autowired
    private JobRepository jobRepository;






    @RequestMapping("")
    public String index(Model model) {

        model.addAttribute("title", "My Jobs");
        model.addAttribute("jobs", jobRepository.findAll()); //add the "jobs" attribute key (mapping to the jobRepository.findAll() value).

        return "index";
    }

    @GetMapping("add")
    public String displayAddJobForm(Model model) {
        //model.addAttribute("title", "Add Job");
        model.addAttribute(new Job());
        model.addAttribute("skills", skillRepository.findAll());
        model.addAttribute("employers", employerRepository.findAll());//2 Variables match templates/add variable name
        //I do not need job repository since I am adding a new job.
        return "add";
    }



    @PostMapping("add") //Part 4 HomeController Again @RequestParam List<Integer> skills
    public String processAddJobForm(@ModelAttribute @Valid Job newJob,
                                    Errors errors, Model model, @RequestParam int employerId,
                                    @RequestParam(defaultValue = "0") List<Integer> skills) {
        //only redirect if name is blank and employer/skill is selected.

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Jobs");
            model.addAttribute("skills", skillRepository.findAll());
            model.addAttribute("employers", employerRepository.findAll());
            return "add";
        }

        // use employerId to select employer object



        Employer employer = employerRepository.findById(employerId).orElse(new Employer());
        newJob.setEmployer(employer);
//
//
//        //Part4 Then, to get the skills data from a list of ids (rather than a single id as we did with
//        // employer), use the CrudRepository method .findAllById(ids).
       List<Skill> skillObjs = (List<Skill>) skillRepository.findAllById(skills); //skills comes from the parameter
     newJob.setSkills(skillObjs);

        jobRepository.save(newJob);

        return "redirect:";
    }

    @GetMapping("view/{jobId}")
    public String displayViewJob(Model model, @PathVariable int jobId) {

        return "view";
    }


}
