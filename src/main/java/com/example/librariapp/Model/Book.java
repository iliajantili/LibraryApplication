package com.example.librariapp.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private String title;

    public Book(Long id, String title, int year, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.authors = authors;
    }

    private int year;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))

    private List <Author> authors;

    public Book() {

    }

    public Book(int i, int i1, String book1, String s, String s1, int i2) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
