package com.ms.email.repositories;

import com.ms.email.models.ConvocationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ConvocationRepository extends JpaRepository<ConvocationModel, String> {

    public Optional<ConvocationModel> findById(String convocation);

}
