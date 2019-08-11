package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Category;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
