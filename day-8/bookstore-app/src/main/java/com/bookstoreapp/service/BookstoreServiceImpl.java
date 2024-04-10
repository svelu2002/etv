package com.bookstoreapp.service;

import com.bookstoreapp.exception.BookAlreadyExistsException;
import com.bookstoreapp.exception.BookNotFoundException;
import com.bookstoreapp.model.Book;
import com.bookstoreapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookstoreServiceImpl implements BookstoreService{

    @Autowired
    private BookRepository bookRepository;


    /* DONE:
     Get all books
     */
    @Override
    public List<Book> getAllBooks() {
       return bookRepository.findAll();
    }

    /* DONE:
       Get book by id
       Check if book exists
          If book exists return book
          else throw exception book not found
     */
    @Override
    public Book getBookById(int id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElseThrow(() -> new BookNotFoundException("Book with id " + id + " is not found"));
    }

    /* DONE:
       Save book
       Check if book exists
          If book exists throw exception book already exists
          else save book
     */
    @Override
    public Book saveBook(Book book) {
        Optional<Book> optionalBook = bookRepository.findById(book.getId());
        if (optionalBook.isPresent()) {
            throw new BookAlreadyExistsException("Book with id " + book.getId() + " already exists");
        }
        return bookRepository.save(book);
    }


    /* TODO:
       Update book
       Check if book exists
          If book exists update book
          else throw exception book not found
     */
    @Override
    public Book updateBook(int id, Book book) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isEmpty()) {
            throw new BookNotFoundException("Book with id " + id + " is not found");
        }
        return bookRepository.save(book);

    }

    /* TODO:
       Delete book
       Check if book exists
          If book exists delete book
          else throw exception book not found
     */
    @Override
    public void deleteBook(int id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isEmpty()) {
            throw new BookNotFoundException("Book with id " + id + " is not found");
        }
        bookRepository.deleteById(id);
    }


}
