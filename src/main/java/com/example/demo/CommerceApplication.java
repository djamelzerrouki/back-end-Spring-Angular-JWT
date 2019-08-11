package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Category;
import com.example.demo.entities.Product;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication


public class CommerceApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;


	public static void main(String[] args) {
		SpringApplication.run(CommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categoryRepository.save(new Category(null,"PC",null,null,null));
		categoryRepository.save(new Category(null,"Smart phones",null,null,null));
		categoryRepository.save(new Category(null,"TV",null,null,null));
		Random r=new Random();

		categoryRepository.findAll().forEach(c->{
			for (int i = 0; i < 12; i++) {
				
			Product p=new Product();
			p.setName(RandomString.make(20));
			p.setAvailable(r.nextBoolean());
			p.setPromontion(r.nextBoolean());
			p.setSelected(r.nextBoolean());
			p.setCurrentprice(r.nextInt(1000)+10);
			p.setPhotoName("unknown.png");
			p.setCategory(c);
			productRepository.save(p);

			}
			});
	}


}


