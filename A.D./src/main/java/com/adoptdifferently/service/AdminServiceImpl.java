package com.adoptdifferently.service;

import org.springframework.stereotype.Service;
import com.adoptdifferently.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public boolean loginadmin(Admin admin) {
        return false;
        // Implementation for loginadmin method
    }

    @Override
    public boolean registeradmin(Admin admin) {
        return false;
        // Implementation for registeradmin method
    }

    @Override
    public boolean deleteadmin(Admin admin) {
        return false;
        // Implementation for deleteadmin method
    }

    @Override
    public boolean updateadmin(Admin admin) {
        return false;
        // Implementation for updateadmin method
    }

    @Override
    public Admin getadmin(Admin admin) {
        return admin;
        // Implementation for getadmin method
    }

    @Override
    public boolean isAdmin(Admin admin) {
        return false;
        // Implementation for isAdmin method
    }

    @Override
    public boolean isUser(Admin admin) {
        return false;
        // Implementation for isUser method
    }
}
