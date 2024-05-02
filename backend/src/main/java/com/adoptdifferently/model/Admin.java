package com.adoptdifferently.model;

import java.util.Objects;
import java.util.UUID;

public class Admin {
    private String username;
    private String password;
    private UUID adminId;

    public Admin(String username, String password, UUID string) {
        this.username = username;
        this.password = password;
        this.adminId = string;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getAdminId() {
        return adminId;
    }

    public void setAdminId(UUID adminId) {
        this.adminId = adminId;
    }

    public boolean isAdmin() {
        return true; // Admins always return true for isAdmin()
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", adminId=" + adminId +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminId, admin.adminId);
    }

    public Object getEmail() {
        return null;
    }
}
