package com.example.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

	@Entity
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@ToString
	public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String name;
	private String description;
	private String photoName;
	@OneToMany(mappedBy="category")
	private Collection<Product> products; 
	}