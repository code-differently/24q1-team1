package com.adoptdifferently.service;

import com.adoptdifferently.model.CatListing;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public interface CatListingService{

static List<CatListing> getAllCatListings() {
    throw new UnsupportedOperationException("Unimplemented method 'getAllCatListings'");
}

CatListing getCatListingById(long id);

boolean deleteCatListingById(long id);

boolean updateCatListing(CatListing updatedCatListing);

boolean removeCatListingById(long id);

boolean addCatListing(CatListing newCatListing);

boolean retrieveCatListingById(long id);
}
