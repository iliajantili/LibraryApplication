package com.example.librariapp.controller;

import com.example.librariapp.Model.Book;
import com.example.librariapp.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("book")
    public Book addBook(@RequestBody Book book) {

        return bookRepository.save(book);
    }
        @GetMapping("/findbook/{id}")
        public Book getBook(@PathVariable Long id) {
            return bookRepository.findById(id).orElse(null);
        }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @DeleteMapping("/removebook/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "delete book with id"+id;
    }
}

