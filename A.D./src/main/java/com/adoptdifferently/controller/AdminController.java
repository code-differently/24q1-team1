package com.adoptdifferently.controller;
 
import com.adoptdifferently.model.Admin;
import com.adoptdifferently.model.User;
import com.adoptdifferently.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
public class AdminController {
 
    @Autowired
    private AdminService adminservice;
 
    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("admin", new Admin());
        return "admin";
    }
 
    @PostMapping("/admin")
    public String admin(@ModelAttribute("admin") Admin admin) {
 
        return "admin";
    }
 
    @PostMapping("/adminlogin")
    public String adminlogin(@ModelAttribute("admin") Admin admin, Model model) {
 
        if (adminservice.loginadmin(admin)) {
            return "adminhome";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "admin";
        }
    }
 
    @GetMapping("/adminhome")
    public String adminhome() {
 
        return "adminhome";
    }
}