package com.example.springmvcdemo.controller;

import com.example.springmvcdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    // Define a handler method to display the initial form
    // This method will be accessed using the following URL:
    // http://localhost:8080/student/showForm

    @GetMapping("/showForm")
    public String showForm(Model model) {
        // Create a new Student object
        Student student = new Student();

        // Add student object to the model
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("systems", systems);
        return "student-form";
    }

    // Define a handler method to process the HTML form
    // This method will be accessed using the following URL:
    // http://localhost:8080/student/processForm
    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        // Log the input data
        System.out.println("Student: "
                + student.getFirstName() + " " + student.getLastName() + " " + student.getCountry());

        return "student-confirmation";
    }

}

