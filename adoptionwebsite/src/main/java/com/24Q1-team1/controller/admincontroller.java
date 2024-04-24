package com.24Q1_team1.controller;

import com.24Q1_team1.model.Admin;
import com.24Q1_team1.model.User;
import com.24Q1_team1.service.AdminService;
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
        model.addAttribute("admin", new admin());
        return "admin";
    }
}