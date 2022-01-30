package com.example.librariapp.repository;

import com.example.librariapp.Model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase , Long> {
}
