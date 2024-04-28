package com.adoptdifferently.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adoptdifferently.service.ExternalAPIService;

@RestController
public class ExternalAPIController {

    @Autowired
    private ExternalAPIService externalAPIService;

    @GetMapping("/adoption-centers")
    public String getAllAdoptionCenters(@RequestParam(required = false) String query,
                                        @RequestParam(required = false) String field,
                                        @RequestParam(required = false) String sort) {
        return externalAPIService.getAllAdoptionCenters(query, field, sort);
    }
}

