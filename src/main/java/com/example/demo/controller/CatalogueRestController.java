package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProductRepository;
import com.example.demo.entities.Product;

@RestController
public class CatalogueRestController {
private ProductRepository productRepository;

public CatalogueRestController(ProductRepository productRepository) {
this.productRepository=productRepository;
}
@GetMapping(path="/phtoProduct/{id}" ,produces=MediaType.IMAGE_PNG_VALUE)
public byte[] getphoto(@PathVariable("id") Long id) throws IOException {
	Product product=productRepository.findById(id).get();
	return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom/products/"+product.getPhotoName()));
	
}

}
