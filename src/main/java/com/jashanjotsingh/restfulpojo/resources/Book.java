package com.jashanjotsingh.restfulpojo.resources;

/**
 *
 * @author jashanjotsingh
 */
public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private int year;
    
    public Book() {
        
    }
    
    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "\"title\" : \"" + this.title + "\"," +
                "\"author\" : \""+ this.author + "\"," +
                "\"year\" : "+ this.year + "," +
                "\"isbn\" : "+ this.isbn +
                "}";
    }
}

    
