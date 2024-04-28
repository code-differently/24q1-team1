package com.adoptdifferently.controller;

import com.adoptdifferently.model.Admin;
import com.adoptdifferently.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("admin", new Admin("", "", null));

        return "admin";
    }

    @PostMapping("/admin")
    public String createAdmin(@ModelAttribute("admin") Admin admin) {
        // Logic to save admin details (if needed)
        return "admin";
    }

    @PostMapping("/adminlogin")
    public String adminlogin(@ModelAttribute("admin") Admin admin, Model model) {
        if (adminService.isAdmin(admin)) {
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
