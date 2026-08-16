package com.library.management.model;

import com.library.management.model.enums.BookStatus;

public class BookCopy {

    private int copyId;
    private Book book;
    private String shelfLocation;
    private BookStatus status;

    public int getCopyId() {
        return this.copyId;
    }

    public Book getBook() {
        return this.book;
    }

    public String getShelfLocation() {
        return this.shelfLocation;
    }

    public BookStatus getStatus() {
        return this.status;
    }

    public BookCopy(int copyId, Book book, String shelfLocation) {

        if (copyId <= 0) {
            throw new IllegalArgumentException("Copy ID must be positive");
        }

        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        if (shelfLocation == null || shelfLocation.isBlank()) {
            throw new IllegalArgumentException("Shelf location cannot be empty");
        }

        this.copyId = copyId;
        this.book = book;
        this.shelfLocation = shelfLocation;
        this.status = BookStatus.AVAILABLE;
    }

}