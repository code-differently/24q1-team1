package com.adoptdifferently.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.adoptdifferently.model.User;
import com.adoptdifferently.model.CatListing;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("John", "john@example.com", "123456789", "password", "USA", "New York", "10001", 1);
    }
    @Test
    public void testGettersAndSetters(){
        Long userId = 1L;

        assertEquals("John", user.getName());
        assertEquals("john@example.com", user.getEmail());
        assertEquals("123456789", user.getPhoneNumber());
        assertEquals("password", user.getPassword());
        assertEquals("USA", user.getCountry());
        assertEquals("New York", user.getCity());
        assertEquals("10001", user.getPostcode());
        assertEquals(userId, user.getUserId());

        user.setName("Alice");
        assertEquals("Alice", user.getName());
    }
    @Test 
    public void testHashCodeAndEquals() {
        User user1  = new User("John", "john@example.com", "123456789", "password", "USA", "New York", "10001", 1);
        User user2 = new User("Blake", "blake@example.com", "987654321", "password", "USA", "Delaware", "19720", 1);

        assertEquals(user1, user2);
        assertEquals(user1.hashCode(), user2.hashCode());
    }
    @Test 
    public void testToString() {
        String expectedString = "User [name=John, email=john@example.com, phoneNumber=123456789, password=password, country=USA, city=New York, postcode=10001, userId=1, catListings=[]]";

        assertEquals(expectedString, user.toString());
    }
    @Test 
    public void testisAdmin() {
        assertEquals(false, user.isAdmin());
    }
    @Test 
    public void testAddandRemoveCatListing() {
        User user = new User("John", "john@example.com", "123456789", "password", "USA", "New York", "10001", 1);
        CatListing newCatListing1 = new CatListing(0, 0, "Fluffy", null, 2, "White", null);
        CatListing newCatListing2 = new CatListing(0, 0, "Sammy", null, 3, "Black", null);

        user.addCatListing(newCatListing1);
        user.addCatListing(newCatListing2);

        Set<CatListing> expectedListings = new HashSet<>();
        expectedListings.add(newCatListing1);
        expectedListings.add(newCatListing2);

        assertEquals(expectedListings, user.getCatListings());

        user.removeCatListing(1);
        expectedListings.remove(newCatListing1);

        assertEquals(2, user.getCatListings().size());
        assertTrue(user.getCatListings().contains(newCatListing1));


    }
    
}
