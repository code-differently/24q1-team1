package com.adoptdifferently.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adoptdifferently.model.CatListing;
import com.adoptdifferently.repository.CatListingRepository;

@Service
public class CatListingServiceImpl implements CatListingService {

    @Autowired
    private CatListingRepository catListingRepository;

    @Override
    public CatListing getCatListingById(long id) {
        Optional<CatListing> optionalCatListing = catListingRepository.findById(id);
        return optionalCatListing.orElse(null);
    }

    @Override
    public boolean deleteCatListingById(long id) {
        if (catListingRepository.existsById(id)) {
            catListingRepository.deleteCatListingById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCatListing(CatListing updatedCatListing) {
        if (catListingRepository.existsById(updatedCatListing.getId())) {
            catListingRepository.save(updatedCatListing);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeCatListingById(long id) {
        if (catListingRepository.existsById(id)) {
            catListingRepository.deleteCatListingById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean addCatListing(CatListing newCatListing) {
        catListingRepository.save(newCatListing);
        return true;
    }

    @Override
    public boolean retrieveCatListingById(long id) {
        return catListingRepository.existsById(id);
    }
}
