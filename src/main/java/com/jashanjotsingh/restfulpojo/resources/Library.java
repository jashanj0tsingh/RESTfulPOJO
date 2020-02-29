package com.jashanjotsingh.restfulpojo.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jashanjotsingh
 */
public class Library {

    private final HashMap<String, Book> library;

    private void addBooksToLibrary() {
        //
        Book first = new Book();
        first.setIsbn("9788700631625");
        first.setYear(1997);
        first.setTitle("Harry Potter and the Philosopher's Stone");
        first.setAuthor("J.K. Rowling");
        library.put(first.getIsbn(), first);
        //
        Book second = new Book();
        second.setIsbn("9780747538493");
        second.setYear(1998);
        second.setTitle("Harry Potter and the Chamber of Secrets");
        second.setAuthor("J.K. Rowling");
        library.put(second.getIsbn(), second);
        //
        // ...
        //
        Book seventh = new Book();
        seventh.setIsbn("9780545010221");
        seventh.setYear(2007);
        seventh.setAuthor("J.K. Rowling");
        seventh.setTitle("Harry Potter and the Deathly Hallows");
        library.put(seventh.getIsbn(), seventh);
    }

    public Library() {
        this.library = new HashMap<>();
        addBooksToLibrary();
    }
    
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        library.keySet().forEach((key) -> {
            books.add(library.get(key));
        });
        return books;
    }
    
    public Book getBookByISBN(String isbn) {
        Book book;
        book = library.get(isbn);
        return book;
    }
    
    public void addBook(String isbn, String title, String author, int year) {
        Book book = new Book(isbn, title, author, year);
        library.put(isbn, book);
    }
}
