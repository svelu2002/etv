package com.bookstoreapp.controller;

import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookstoreController {

    @Autowired
    private BookstoreService bookstoreService;

    /* DONE:
     create a get request to get all books
     Return Response code of 200
     path: /books
     */
    @GetMapping(path = "/books")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Book> getAllBooks() {
        // DONE: Implement this method
        return bookstoreService.getAllBooks();
    }


   /* DONE:
     create a post request to save a book
     Return Response code of 201
     path: /books
     */
    @PostMapping(path = "/books")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Book saveBook(@RequestBody @Valid Book book) {
        // DONE: Implement this method
        return bookstoreService.saveBook(book);
    }

    /* TODO:
     create a PUT request to update a book
     Return Response code of 202
     path: /books/{id}
     */

    @PutMapping(path = "/books/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Book updateBook( int id,  Book book) {
        // TODO: Implement this method
        return bookstoreService.updateBook(id, book);
    }

    /* TODO:
     create a DELETE request to delete a book
     Return Response code of 200
     path: /books/{id}
     */
    @DeleteMapping(path = "/books/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteBook(int id) {
        // TODO: Implement this method
        bookstoreService.deleteBook(id);
    }


    /* DONE:
     create a GET request to get a book by id
     Return Response code of 200
     path: /books/{id}
     */
    @GetMapping(path = "/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Book getBookById(int id) {
        // DONE: Implement this method
        return bookstoreService.getBookById(id);
    }




}
