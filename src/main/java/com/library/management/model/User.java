package main.java.com.library.management.model;

import com.library.management.model.enums.UserRole;

public abstract class User {

    private int userId;
    private String name;
    private String email;
    private String password;
    private UserRole role;

    
    
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    



    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(UserRole role) {
        this.role = role;
    }



    protected User(int userId, String name, String email, String password, UserRole role) {
      
        if (userId <= 0) {
            throw new IllegalArgumentException("User ID must be positive");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }

        if (role == null) {
            throw new IllegalArgumentException("User role cannot be null");
        }

        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}