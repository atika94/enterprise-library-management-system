package com.library.management.model;
import com.library.management.model.enums.UserRole;
public class Administrator extends User{
    public Administrator(int userId, String name, String email, String password) {
        super(userId, name, email, password, UserRole.ADMIN);
    }
}