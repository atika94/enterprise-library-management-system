package com.library.management.model;
import java.util.List;
public class Book {
    private String isbn;
    private String title;
    private List<Author> authors;
    private String publisher;
    private int publicationYear;
    private String edition;
    private String category;
    private String language;
    private int numberOfPages;

    public String getIsbn(){
        return this.isbn;
    }
    public String getTitle(){
        return this.title;
    }
    public List<Author> getAuthors() {
        return this.authors;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public String getEdition(){
        return this.edition;
    }
     public String getCategory(){
        return this.category;
    }
     public String getLanguage(){
        return this.language;
    }
     public int getNumberOfPages(){
        return this.numberOfPages;
    }




    public void setTitle(String title){
        this.title = title;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public void setEdition(String edition){
        this.edition = edition;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Book(
        String isbn,
        String title,
        List<Author> authors,
        String publisher,
        int publicationYear,
        String category,
        String language
) {

    if (isbn == null || isbn.isBlank()) {
        throw new IllegalArgumentException("ISBN cannot be empty");
    }

    if (title == null || title.isBlank()) {
        throw new IllegalArgumentException("Title cannot be empty");
    }

    if (authors == null || authors.isEmpty()) {
        throw new IllegalArgumentException("Book must have at least one author");
    }

    if (publisher == null || publisher.isBlank()) {
        throw new IllegalArgumentException("Publisher cannot be empty");
    }

    if (publicationYear <= 0) {
        throw new IllegalArgumentException(
                "Publication year must be positive"
        );
    }

    if (category == null || category.isBlank()) {
        throw new IllegalArgumentException("Category cannot be empty");
    }

    if (language == null || language.isBlank()) {
        throw new IllegalArgumentException("Language cannot be empty");
    }

    this.isbn = isbn;
    this.title = title;
    this.authors = authors;
    this.publisher = publisher;
    this.publicationYear = publicationYear;
    this.category = category;
    this.language = language;
}
    
}
