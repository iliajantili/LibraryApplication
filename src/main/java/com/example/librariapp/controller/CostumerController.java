package com.example.librariapp.controller;

import com.example.librariapp.Model.Costumer;
import com.example.librariapp.repository.CostumerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
class CostumerController {
    private final CostumerRepository costumerRepository;

    public CostumerController(CostumerRepository costumerRepository) {
        this.costumerRepository = costumerRepository;
    }

    @PostMapping("costumer")
    public Costumer addCostumer(@RequestBody Costumer costumer) {

        return costumerRepository.save(costumer);
    }
    @DeleteMapping("removecustomer")
    public String deleteCustomer() {
        deleteCustomer();
        return "delete customer";
    }
}