package com.adoptdifferently.service;

import com.adoptdifferently.model.Admin;

public interface AdminService {

    boolean loginadmin(Admin admin);

    boolean registeradmin(Admin admin);

    boolean deleteadmin(Admin admin);

    boolean updateadmin(Admin admin);

    Admin getadmin(Admin admin);

    boolean isAdmin(Admin admin);

    boolean isUser(Admin admin);
}