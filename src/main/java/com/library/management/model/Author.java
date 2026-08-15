package com.library.management.model;
public class Author{
    private int authorId;
    private String name;
    private String biography;
    private String nationality;


    public int getAuthorId(){
        return this.authorId;
    }
    public String getName(){
        return this.name;
    }
    public String getBiography(){
        return this.biography;
    }
    public String getNationality(){
        return this.nationality;
    }



    public void setId(int authorId){
        this.authorId = authorId; 
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBiography(String biography){
        this.biography = biography;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }


    public Author(int authorId, String name, String biography, String nationality){

        if (id <= 0) {
            throw new IllegalArgumentException("Author ID must be positive");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Author name cannot be empty");
        }
        this.authorId = authorId; 
        this.name = name;
        this.biography = biography;
        this.nationality = nationality;
    }
}