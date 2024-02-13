package com.nrx.task.controller;


import com.nrx.task.entity.TaskCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {


    @GetMapping(value="/register")
    public String getExample(Model model){
        TaskCreator taskCreator = new TaskCreator();
        model.addAttribute("name", "Nafiz");
        model.addAttribute("taskCreator", taskCreator);
        return "register";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("taskCreator") TaskCreator taskCreator) {
        // Process the submitted data
        System.out.println("Submitted data: " + taskCreator.getName());

        // Redirect to another page or return a response
        return "redirect:/success";
    }

}
