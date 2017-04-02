package com.application.controllers;

import com.application.model.Student;
import com.application.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ud on 29/3/17.
 */
@Controller
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public String newRegistration(ModelMap model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "enroll";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveRegistration(@Valid Student student, BindingResult result, ModelMap model){

        if(result.hasErrors()) {
            return "enroll";
        }
        studentService.saveEmployee(student);
        model.addAttribute("success", "Dear "+ student.getFirstName()+" , your Registration completed successfully");
        return "sucess";
    }

    @ModelAttribute("sections")
    public List<String> initializeSections() {

        List<String> sections = new ArrayList<String>();
        sections.add("Graduate");
        sections.add("Post Graduate");
        sections.add("Research");
        return sections;
    }

    @ModelAttribute("subjects")
    public List<String> initializeSubjects() {

        List<String> subjects = new ArrayList<String>();
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Life Science");
        subjects.add("Political Science");
        subjects.add("Computer Science");
        subjects.add("Mathmatics");
        return subjects;
    }

    @ModelAttribute("countries")
    public List<String> initiazeCountry(){
        List<String> subjects = new ArrayList<String>();
        subjects.add("India");
        subjects.add("Japan");
        subjects.add("KOlkata");
        return subjects;
    }
}
