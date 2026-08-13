# Enterprise Library Management System

## 1. Project Overview

The Enterprise Library Management System is a Java-based application designed to manage the operations of a modern library.

The system will manage books, physical book copies, members, librarians, borrowing transactions, reservations, fines, notifications, and library reports.

The project is designed to demonstrate advanced Java programming and software engineering concepts including object-oriented design, SOLID principles, collections, generics, exception handling, streams, design patterns, persistence, and automated testing.

The initial version will be implemented as a Java application with file-based persistence. The architecture will allow the persistence layer to be replaced with a database in a future version.

---

## 2. Project Goals

The main goals of the project are:

- Build a realistic library management application using Java.
- Apply object-oriented programming principles in a meaningful way.
- Practice clean and maintainable software architecture.
- Understand and apply SOLID principles.
- Use Java Collections, Generics, Streams, Lambdas, and functional interfaces.
- Implement meaningful custom exception handling.
- Apply appropriate design patterns.
- Implement persistent storage.
- Add automated unit tests.
- Maintain a professional GitHub repository and documentation.
- Design the system so it can later be extended into a REST API.

---

## 3. User Roles

The system will initially support three user roles.

### 3.1 Member

A member can:

- Log into the system.
- Search for books.
- View book and copy availability.
- Borrow available books.
- Return borrowed books.
- Reserve unavailable books.
- View current borrowed books.
- View borrowing history.
- View outstanding fines.
- Receive notifications about reservations and due dates.

### 3.2 Librarian

A librarian can:

- Log into the system.
- Add books.
- Add physical copies of books.
- Update book information.
- Remove books or copies.
- Register members.
- Manage member information.
- Issue books.
- Process returned books.
- Manage reservations.
- View and manage fines.
- Generate library reports.

### 3.3 Administrator

An administrator has system-level privileges and can:

- Manage librarians.
- Manage users.
- Configure library policies.
- View system-wide reports.
- View audit logs.