package com.example.librariapp.controller;

import com.example.librariapp.Model.Author;
import com.example.librariapp.Model.Publisher;
import com.example.librariapp.repository.PublishRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {
    public final PublishRepository publishRepository;

    public PublisherController(PublishRepository publishRepository) {
        this.publishRepository = publishRepository;
    }

    @PostMapping("publisher")
    public Publisher addPublisher(@RequestBody Publisher publisher) {

        return publishRepository.save(publisher);
}
    @DeleteMapping("removepublisher")
    public String deletePublisher() {
        deletePublisher();
        return "delete publisher";
    }
}

