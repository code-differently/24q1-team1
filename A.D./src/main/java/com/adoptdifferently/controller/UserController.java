package com.adoptdifferently.controller;

import com.adoptdifferently.model.User;
import com.adoptdifferently.model.CatListing;
import com.adoptdifferently.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // POST endpoint for creating a new user
    @PostMapping
    public String createUser(@RequestBody User user) {
        boolean success = userService.createUser(user);
        if (success) {
            return "User created successfully!";
        } else {
            return "Failed to create user. Please try again.";
        }
    }

    // GET endpoint for retrieving user details by user ID
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable long userId) {
        return userService.getUserById(userId);
    }

    // PUT endpoint for updating user details by user ID
    @PutMapping("/{userId}")
    public String updateUser(@PathVariable long userId, @RequestBody User user) {
        boolean success = userService.updateUser(user);
        if (success) {
            return "User details updated successfully!";
        } else {
            return "Failed to update user details. Please try again.";
        }
    }

    // DELETE endpoint for deleting a user by user ID
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable long userId) {
        boolean success = userService.deleteUser(userId);
        if (success) {
            return "User deleted successfully!";
        } else {
            return "Failed to delete user. Please try again.";
        }
    }

    // POST endpoint for adding a new cat adoption listing for a user by user ID
    @PostMapping("/{userId}/catlistings")
    public String addCatListing(@PathVariable long userId, @RequestBody CatListing catListing) {
        boolean success = userService.addCatListingToUser(userId, catListing);
        if (success) {
            return "Cat listing added successfully!";
        } else {
            return "Failed to add cat listing. Please try again.";
        }
    }

    // GET endpoint for retrieving all cat listings for a user by user ID
    @GetMapping("/{userId}/catlistings")
    public Set<CatListing> getAllCatListingsForUser(@PathVariable long userId) {
        return userService.getAllCatListingsForUser(userId);
    }

    // PUT endpoint for updating cat listing details for a user by user ID and cat listing ID
    @PutMapping("/{userId}/catlistings/{catListingId}")
    public String updateCatListing(@PathVariable long userId, @PathVariable long catListingId, @RequestBody CatListing catListing) {
        boolean success = userService.updateCatListing(userId, catListingId, catListing);
        if (success) {
            return "Cat listing details updated successfully!";
        } else {
            return "Failed to update cat listing details. Please try again.";
        }
    }

    // DELETE endpoint for deleting a cat listing from a user by user ID and cat listing ID
    @DeleteMapping("/{userId}/catlistings/{catListingId}")
    public String deleteCatListing(@PathVariable long userId, @PathVariable long catListingId) {
        boolean success = userService.deleteCatListing(userId, catListingId);
        if (success) {
            return "Cat listing deleted successfully!";
        } else {
            return "Failed to delete cat listing. Please try again.";
        }
    }
}
