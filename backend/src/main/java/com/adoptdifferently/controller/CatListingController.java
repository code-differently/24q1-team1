package com.adoptdifferently.controller;

import com.adoptdifferently.model.CatListing;
import com.adoptdifferently.service.CatListingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catlistings")
public class CatListingController {

    private final CatListingService catListingService;

    public CatListingController(CatListingService catListingService) {
        this.catListingService = catListingService;
    }

    @GetMapping
    public ResponseEntity<List<CatListing>> getAllCatListings() {
        List<CatListing> catListings = CatListingService.getAllCatListings();
        return new ResponseEntity<>(catListings, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatListing> getCatListingById(@PathVariable("id") long id) {
        CatListing catListing = catListingService.getCatListingById(id);
        return new ResponseEntity<>(catListing, catListing != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<CatListing> addCatListing(@RequestBody CatListing newCatListing) {
        boolean added = catListingService.addCatListing(newCatListing);
        return added ? new ResponseEntity<>(newCatListing, HttpStatus.CREATED) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCatListing(@PathVariable("id") long id, @RequestBody CatListing updatedCatListing) {
        updatedCatListing.setId(id); // Ensure ID consistency
        boolean updated = catListingService.updateCatListing(updatedCatListing);
        return updated ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCatListing(@PathVariable("id") long id) {
        boolean deleted = catListingService.deleteCatListingById(id);
        return deleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
