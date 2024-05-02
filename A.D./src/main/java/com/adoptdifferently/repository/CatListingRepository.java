package com.adoptdifferently.repository;

import com.adoptdifferently.model.CatListing;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class CatListingRepository {

    private final static Map<Long, CatListing> catListings = new HashMap<>();
    private long nextId = 1;

    public List<CatListing> getAllCatListings() {
        return new ArrayList<>(catListings.values());
    }

    public CatListing getCatListingById(long id) {
        return catListings.get(id);
    }

    public boolean deleteCatListingById(long id) {
        return catListings.remove(id) != null;
    }

    public boolean updateCatListing(CatListing updatedCatListing) {
        if (catListings.containsKey(updatedCatListing.getId())) {
            catListings.put(updatedCatListing.getId(), updatedCatListing);
            return true;
        }
        return false;
    }

    public boolean addCatListing(CatListing newCatListing) {
        if (newCatListing.getId() == 0) {
            newCatListing.setId(nextId++);
        }
        catListings.put(newCatListing.getId(), newCatListing);
        return true;
    }

    public boolean retrieveCatListingById(long id) {
        return catListings.containsKey(id);
    }

    public static List<CatListing> findAll() {
        return new ArrayList<>(catListings.values());
    }

    public static boolean existsById(long id) {
        return CatListingRepository.existsById(id);
    }
    

    public static void save(CatListing updatedCatListing) {
        CatListingRepository.save(updatedCatListing);
    }
    

    public static Optional<CatListing> findById(long id) {
        return CatListingRepository.findById(id); 
    }
    
}
