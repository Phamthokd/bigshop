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
@Table(name = "`order`")
@AllArgsConstructor
@NoArgsConstructor
public class Order extends Base {
	@Column
	private Integer totalAmount;
	
	@OneToMany(mappedBy="order")
	private List<OrderDetail> orderDetail = new ArrayList<>();
	
	
}
