package com.ms.email.controllers;

import com.ms.email.models.ConvocationModel;
import com.ms.email.repositories.ConvocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/convocation")
public class ConvocationController {

    @Autowired
    ConvocationRepository repository;

    @PostMapping("/team")
    public ResponseEntity<ConvocationModel> post(@RequestBody ConvocationModel convocation) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(convocation));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ConvocationModel>> GetAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public String GetById(@PathVariable String id) {
        return repository.findById(id).get().getTeam();
    }

}
