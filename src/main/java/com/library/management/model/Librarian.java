package com.library.management.model;
import com.library.management.model.enums.UserRole;

public class Librarian extends User{
    private String employeeId;
    public Librarian(int userId, String name, String email, String password, String employeeId) {

        super(
            userId,
            name,
            email,
            password,
            UserRole.LIBRARIAN
        );

        if (employeeId == null || employeeId.isBlank()) {
            throw new IllegalArgumentException("Employee ID cannot be empty");
        }

        this.employeeId = employeeId;
    }
    public String getEmployeeId() {
        return this.employeeId;
    }
}