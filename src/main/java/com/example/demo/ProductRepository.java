package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Product;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
@RestResource(path="selectedProduucts")
	public List<Product> findBySelectedIsTrue();

@RestResource(path="ProduuctsByKeyword")
public List<Product> findByNameContains(@Param(value="mc") String mc);
}
