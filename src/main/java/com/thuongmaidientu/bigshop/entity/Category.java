package com.thuongmaidientu.bigshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
public class Category extends Base {
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<Product> products = new ArrayList<>();

	
}
