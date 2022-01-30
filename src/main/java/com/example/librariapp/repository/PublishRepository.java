package com.example.librariapp.repository;

import com.example.librariapp.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishRepository extends JpaRepository<Publisher , Long> {
}
