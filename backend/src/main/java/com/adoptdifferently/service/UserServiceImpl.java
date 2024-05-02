package com.adoptdifferently.service;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import com.adoptdifferently.model.CatListing;
import com.adoptdifferently.model.User;
import com.adoptdifferently.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private final CatListing userRepository;

    public UserServiceImpl(CatListing userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean registerUser(User user) {
        if (user != null && user.isValid()) {
            // Additional logic for registering the user
            return true;
        }
        return false;
    }

    @Override
    public boolean authenticateUser(String email, String password) {
        User user = UserRepository.findById();
        return user != null && user.getPassword().equals(password);
    }

    @Override
    public boolean updateUser(User user) {
        Optional<User> existingUser = Optional.empty();
        if (existingUser.isPresent()) {
            User updatedUser = existingUser.get();
            // Update user details
            updatedUser.setName(user.getName());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setPhoneNumber(user.getPhoneNumber());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setCountry(user.getCountry());
            updatedUser.setCity(user.getCity());
            updatedUser.setPostcode(user.getPostcode());
            UserRepository.save(updatedUser);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUser(long userId) {
        Optional<User> userToDelete = Optional.ofNullable(UserRepository.findById(userId));
        userToDelete.ifPresent(user -> UserRepository.delete(user));
        return userToDelete.isPresent();
    }

    @Override
public User getUserById(long userId) {
    return UserRepository.findById(userId)
            .orElse(null);
}

    @Override
    public boolean addCatListingToUser(long userId, CatListing catListing) {
        Optional<User> optionalUser = Optional.ofNullable(UserRepository.findById(userId));
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.addCatListing(userRepository);    
             UserRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public void removeCatListingFromUser(long userId, CatListing catListing) {
        Optional<User> optionalUser = Optional.ofNullable(UserRepository.findById(userId));
        optionalUser.ifPresent(user -> {
            user.removeCatListing(catListing);
            UserRepository.save(user);
        });
    }

    @Override
    public boolean updateCatListing(long userId, long catListingId, CatListing catListing) {
        Optional<User> optionalUser = Optional.ofNullable(UserRepository.findById(userId));
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            Optional<CatListing> optionalCatListing = User.getCatListings().stream()
                    .filter(cl -> cl.getId() == catListingId)
                    .findFirst();
            optionalCatListing.ifPresent(existingCatListing -> {
                // Update cat listing details
                existingCatListing.setName(catListing.getName());
                existingCatListing.setBreed(catListing.getBreed());
                existingCatListing.setAge(catListing.getAge());
                existingCatListing.setLocation(catListing.getLocation());
                existingCatListing.setDescription(catListing.getDescription());     
                UserRepository.save(user);
            });
            return optionalCatListing.isPresent();
        }
        return false;
    }

    @Override
    public boolean deleteCatListing(long userId, long catListingId) {
        Optional<User> optionalUser = Optional.ofNullable(UserRepository.findById(userId));
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            boolean removed = User.getCatListings().removeIf(catListing -> catListing.getId() == catListingId);
            if (removed) {
                UserRepository.save(user);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean createUser(User user) {
        // Logic for creating a new user
        return true;
    }

    @Override
    public Set<CatListing> getAllCatListingsForUser(long userId) {
        Optional<User> optionalUser = Optional.ofNullable(UserRepository.findById(userId));
        return optionalUser.map(user -> User.getCatListings()).orElse(Collections.emptySet());
    }
}
