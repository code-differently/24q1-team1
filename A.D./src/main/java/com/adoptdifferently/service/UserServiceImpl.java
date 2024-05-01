package com.adoptdifferently.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Set;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.adoptdifferently.model.CatListing;
import com.adoptdifferently.model.User;
import com.adoptdifferently.repository.UserRepository;

public class  UserServiceImpl implements UserService {

    @Override
    public boolean registerUser(User user) {
        if(user != null && user.isValid()) {   
        }
            return true;
    }

    @SuppressWarnings("unused")
    private boolean isUserRegistered(User user) {
        if(isUserRegistered(user)) {
            return false;
        } else {
            return true;
        }
        
    }

    @Override
    public boolean authenticateUser(String email, String password) {
       User user = UserRepository.findByEmail(email);

       if(user == null) {
           return false;
       } 
       // Verify if the provided password matches the stored password hash
       if(!user.getPassword().equals(password)) {
           return false;
       }

       return true;
     
    }
   
    
     
    

    @Override
    public boolean updateUser(User user) {
        User existingUser = UserRepository.findById(user.getUserId());
    
    // If no user is found with the provided user ID, return false
    if (existingUser == null) {
        return false; // Unable to update user: user not found
    }
    
    // Update the existing user information with the values from the provided user object
    existingUser.setName(user.getName());
    existingUser.setEmail(user.getEmail());
    existingUser.setPhoneNumber(user.getPhoneNumber());
    existingUser.setPassword(user.getPassword());
    existingUser.setCountry(user.getCountry());
    existingUser.setCity(user.getCity());
    existingUser.setPostcode(user.getPostcode());
    
    // Save the updated user information back to the database
    UserRepository.save(existingUser);
    
    return true; // User update successful
    }
       
    @Override
    public boolean deleteUser(long userId) {
       User userToDelete = UserRepository.findById(userId);
       if (userToDelete == null) {
           return false;
       }
       UserRepository.delete(userToDelete);
       return true;
    }

    @Override
    public User getUserById(long userId) {
        User user = UserRepository.findById(userId);
        if(user == null) {
            throw new UsernameNotFoundException("User not found with ID: " + userId);
        }

        return user;
    }

    @Override
    public boolean addCatListingToUser(long userId, CatListing catListing) {
        User user = UserRepository.findById(userId);

        // Check if the user exists
        if (user == null) {
            try {
                throw new UserPrincipalNotFoundException("User not found with ID: " + userId);
            } catch (UserPrincipalNotFoundException e) {
                
                e.printStackTrace();
            }
        }
    
        // Add the cat listing to the user's profile
        user.addCatListing(catListing);
    
        // Save the updated user details to the database or external service
        UserRepository.save(user);
    
        return true; 
    }

    @Override
    public void removeCatListingFromUser(long userId, CatListing catListing) {
        User user = UserRepository.findById(userId);

        // Check if the user exists
        if (user == null) {
            try {
                throw new UserPrincipalNotFoundException("User not found with ID: " + userId);
            } catch (UserPrincipalNotFoundException e) {
                
                e.printStackTrace();
            }
        }
    
        // Add the cat listing to the user's profile
        user.removeCatListing(catListing);
    
        // Save the updated user details to the database or external service
        UserRepository.save(user);
    
        return; 
    }

    @Override
    public Set<CatListing> getAllCatListingsForUser(long userId) {
        User user = UserRepository.findById(userId);
        if(user == null) {
            try {
                throw new UserPrincipalNotFoundException("User not found with ID: " + userId);
            } catch (UserPrincipalNotFoundException e) {
                
                e.printStackTrace();
            }
        }
        return user.getCatListings();
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

    @Override
    public boolean createUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

}
    

