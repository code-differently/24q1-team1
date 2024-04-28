package com.adoptdifferently.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIService {

    private static final String ADOPTION_CENTERS_ENDPOINT = "https://api.adoptapet.me/ac";
    private static final String PET_SPECIES_BREEDS_ENDPOINT = "https://api.adoptapet.me/sb";
    private static final String ADOPTABLE_PETS_ENDPOINT = "https://api.adoptapet.me/ap";
    private static final String SITEWIDE_SEARCH_ENDPOINT = "https://api.adoptapet.me/search";

    private final RestTemplate restTemplate;

    public ExternalAPIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getAllAdoptionCenters(String query, String field, String sort) {
        String url = ADOPTION_CENTERS_ENDPOINT + "?q=" + query + "&" + field + "&sort=" + sort;
        return restTemplate.getForObject(url, String.class);
    }

    public String getAdoptionCenterById(String id) {
        String url = ADOPTION_CENTERS_ENDPOINT + "/" + id;
        return restTemplate.getForObject(url, String.class);
    }

    public String getAllPetSpeciesAndBreeds(String q, String field, String sort) {
        String url = PET_SPECIES_BREEDS_ENDPOINT + "?q=" + q + "&" + field + "&sort=" + sort;
        return restTemplate.getForObject(url, String.class);
    }

    public String getPetSpeciesAndBreedById(String id) {
        String url = PET_SPECIES_BREEDS_ENDPOINT + "/" + id;
        return restTemplate.getForObject(url, String.class);
    }

    public String getAllAdoptablePets(String q, String field, String sort) {
        String url = ADOPTABLE_PETS_ENDPOINT + "?q=" + q + "&" + field + "&sort=" + sort;
        return restTemplate.getForObject(url, String.class);
    }

    public String getAdoptablePetById(String id) {
        String url = ADOPTABLE_PETS_ENDPOINT + "/" + id;
        return restTemplate.getForObject(url, String.class);
    }

    public String sitewideSearch(String q) {
        String url = SITEWIDE_SEARCH_ENDPOINT + "?q=" + q;
        return restTemplate.getForObject(url, String.class);
    }
}
