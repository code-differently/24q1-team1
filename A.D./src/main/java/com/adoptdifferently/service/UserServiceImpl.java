package com.adoptdifferently.service;

import java.util.Set;

import com.adoptdifferently.model.CatListing;
import com.adoptdifferently.model.User;

public class  UserServiceImpl implements UserService {

    @Override
    public boolean registerUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerUser'");
    }

    @Override
    public boolean authenticateUser(String email, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'authenticateUser'");
    }

    @Override
    public boolean updateUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public boolean deleteUser(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public User getUserById(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public boolean addCatListingToUser(long userId, CatListing catListing) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCatListingToUser'");
    }

    @Override
    public void removeCatListingFromUser(long userId, CatListing catListing) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeCatListingFromUser'");
    }

    @Override
    public Set<CatListing> getAllCatListingsForUser(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCatListingsForUser'");
    }

    @Override
    public boolean createUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public boolean updateCatListing(long userId, long catListingId, CatListing catListing) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCatListing'");
    }

    @Override
    public boolean deleteCatListing(long userId, long catListingId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCatListing'");
    }
    
}
