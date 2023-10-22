package com.thuongmaidientu.bigshop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Base {
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Integer price;
	
	@Column(name = "discount")
	private Integer discount;
	
	@Column(name = "shortdescription",columnDefinition = "TEXT")
	private String shortDescription;
	
	@Column(name = "description",columnDefinition = "TEXT")
	private String description;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name = "purchases")
	private Integer purchases;
	
	@Column(name = "image1")
	private String image1;
	
	@Column(name = "image2")
	private String image2;
	
	@Column(name = "image3")
	private String image3;
	
	@Column(name = "image4")
	private String image4;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@OneToMany(mappedBy="product")
	private List<OrderDetail> orderDetail = new ArrayList<OrderDetail>();
}
