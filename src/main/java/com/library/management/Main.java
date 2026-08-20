package main.java.com.library.management;

import com.library.management.model.Administrator;
import com.library.management.model.Librarian;
import com.library.management.model.Member;
import com.library.management.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Member member = new Member(
                101,
                "Ali",
                "ali@example.com",
                "password123",
                LocalDate.now()
        );

        Librarian librarian = new Librarian(
                201,
                "Sara",
                "sara@library.com",
                "password123",
                "EMP-001"
        );

        Administrator admin = new Administrator(
                301,
                "Ahmed",
                "admin@library.com",
                "password123"
        );

        System.out.println(member.getName());
        System.out.println(librarian.getName());
        System.out.println(admin.getName());
    }
}
