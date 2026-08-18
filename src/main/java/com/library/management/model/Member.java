package com.library.management.model;

import com.library.management.model.enums.UserRole;

import java.time.LocalDate;

public class Member extends User {

    private LocalDate memberSince;

    public Member(int userId, String name, String email, String password, LocalDate memberSince) {

        super(
                userId,
                name,
                email,
                password,
                UserRole.MEMBER
        );

        if (memberSince == null) {
            throw new IllegalArgumentException(
                    "Member since date cannot be null"
            );
        }

        this.memberSince = memberSince;
    }
    public LocalDate getMemberSince() {
        return this.memberSince;
    }

}