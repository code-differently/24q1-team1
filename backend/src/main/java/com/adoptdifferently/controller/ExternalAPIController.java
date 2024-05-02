package com.adoptdifferently.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/adoption-center/{id}")
    public String getAdoptionCenterById(@PathVariable String id) {
    return externalAPIService.getAdoptionCenterById(id);
}

@GetMapping("/pet-species-breeds")
public String getAllPetSpeciesAndBreeds(@RequestParam(required = false) String q,
                                        @RequestParam(required = false) String field,
                                        @RequestParam(required = false) String sort) {
    return externalAPIService.getAllPetSpeciesAndBreeds(q, field, sort);
}

@GetMapping("/pet-species-breed/{id}")
public String getPetSpeciesAndBreedById(@PathVariable String id) {
    return externalAPIService.getPetSpeciesAndBreedById(id);
}

@GetMapping("/adoptable-pets")
public String getAllAdoptablePets(@RequestParam(required = false) String q,
                                  @RequestParam(required = false) String field,
                                  @RequestParam(required = false) String sort) {
    return externalAPIService.getAllAdoptablePets(q, field, sort);
}

@GetMapping("/adoptable-pet/{id}")
public String getAdoptablePetById(@PathVariable String id) {
    return externalAPIService.getAdoptablePetById(id);
}

@GetMapping("/sitewide-search")
public String sitewideSearch(@RequestParam String q) {
    return externalAPIService.sitewideSearch(q);
}

}

