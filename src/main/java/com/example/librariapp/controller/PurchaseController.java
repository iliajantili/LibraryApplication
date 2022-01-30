package com.example.librariapp.controller;

import com.example.librariapp.Model.Book;
import com.example.librariapp.Model.Purchase;
import com.example.librariapp.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    public List<Book> getBooks() {
        Book b1 = new Book(1234, 1991, "Book1", "mark.mark", "£11.00", 5);
        Book b2 = new Book(4321, 1994, "Book2", "bob.bob", "£12.00", 3);
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        return books;
    }


    @PostMapping("purchase")
    public Purchase addPurchase(@RequestBody Purchase purchase) {

        return purchaseRepository.save(purchase);
    }
}
