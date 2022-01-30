package com.example.librariapp.controller;

import com.example.librariapp.Model.Author;
import com.example.librariapp.repository.AuthorRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @PostMapping("author")
    public Author addAuthor(@RequestBody Author author) {

        return authorRepository.save(author);
}
    @DeleteMapping("removeauthor")
    public String deleteAuthor() {
        deleteAuthor();
        return "delete author";
    }
}
