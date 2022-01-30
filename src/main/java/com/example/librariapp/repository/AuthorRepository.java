package com.example.librariapp.repository;

import com.example.librariapp.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author , Long> {
}
