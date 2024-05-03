package com.adoptdifferently.service;

import java.util.Set;
import com.adoptdifferently.model.CatListing;
import com.adoptdifferently.model.User;

public interface UserService {
    // User management methods
    boolean registerUser(User user);

    boolean authenticateUser(String email, String password);

    boolean updateUser(User user);

    boolean deleteUser(long userId);

    User getUserById(long userId);

    // CatListing management methods
    boolean addCatListingToUser(long userId, CatListing catListing);

    void removeCatListingFromUser(long userId, CatListing catListing);
    
    Set<CatListing> getAllCatListingsForUser(long userId);

    boolean createUser(User user);

    boolean updateCatListing(long userId, long catListingId, CatListing catListing);

    boolean deleteCatListing(long userId, long catListingId);
}
