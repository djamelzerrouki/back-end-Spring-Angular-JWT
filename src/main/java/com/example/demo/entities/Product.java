package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id ;
private String name;
private String description;
private  double currentprice;
private  boolean promontion;
private  boolean selected;
private boolean available;
private String photoName;
@ManyToOne
private Category category; 
}
