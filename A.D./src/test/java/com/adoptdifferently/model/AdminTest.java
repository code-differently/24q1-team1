package com.adoptdifferently.model;
import com.adoptdifferently.model.Admin;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdminTest {

    @Test
    void testGetUsername() {
        Admin admin = new Admin("adminUser", "adminPassword", UUID.randomUUID());
        assertEquals("adminUser", admin.getUsername());
    }

    @Test
    void testGetPassword() {
        Admin admin = new Admin("adminUser", "adminPassword", UUID.randomUUID());
        assertEquals("adminPassword", admin.getPassword());
    }

    @Test
    void testGetAdminId() {
        UUID adminId = UUID.randomUUID();
        Admin admin = new Admin("adminUser", "adminPassword", adminId);
        assertEquals(adminId, admin.getAdminId());
    }

    @Test
    void testIsAdmin() {
        Admin admin = new Admin("adminUser", "adminPassword", UUID.randomUUID());
        assertTrue(admin.isAdmin());
    }
}
