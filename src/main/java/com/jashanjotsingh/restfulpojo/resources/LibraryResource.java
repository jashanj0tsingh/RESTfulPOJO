package com.jashanjotsingh.restfulpojo.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jashanjotsingh
 */
@Path("/library")
public class LibraryResource {
    
    Library library = new Library();
    
    @GET
    @Path("/books")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBooks() {
        List<Book> books  = library.getAllBooks();
        return Response.status(200).entity(books.toString()).build();
    }

    @GET
    @Path("/books/{isbn}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBookByISBN(@PathParam("isbn") String isbn) {
        Book response = library.getBookByISBN(isbn);
        return Response.status(200).entity(response.toString()).build();
    }
    
    @GET
    @Path("/books/query")
    @Produces(MediaType.APPLICATION_JSON)
    // http://localhost:8080/RESTfulPOJO/api/v1/SOEN487/library/books/query?isbn=
    public Response getBookByISBNQuery(@QueryParam("isbn") String isbn) {
        Book response = library.getBookByISBN(isbn);
        return Response.status(200).entity(response.toString()).build();
    }
    
    @POST
    @Path("/books/add")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addBookFormData(@FormParam("isbn") String isbn,
                                    @FormParam("title") String title,
                                    @FormParam("author") String author,
                                    @FormParam("year") int year) {
        library.addBook(isbn, title, author, year);
        return Response.status(200).entity(library.getBookByISBN(isbn).toString()).build();
    }
}
