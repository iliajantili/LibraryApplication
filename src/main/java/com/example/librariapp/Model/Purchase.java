package com.example.librariapp.Model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
@Entity
public class Purchase {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private int price;
    private LocalDateTime date;

    @OneToMany
    private Set<Book> books;

    public Purchase(int price, LocalDateTime date) {
        this.price = price;
        this.date = date;
    }

    public Purchase() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
