package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

}
