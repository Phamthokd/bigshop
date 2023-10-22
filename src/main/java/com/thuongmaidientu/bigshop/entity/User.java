package com.thuongmaidientu.bigshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User extends Base {
	
	
	@Column(name = "fisrtname")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "birth")
	private Date birth;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "avatar")
	private String avatar;
	
	@ManyToMany
	@JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "userid"),inverseJoinColumns = @JoinColumn(name = "roleid"))
	private List<Role> roles = new ArrayList<>();

	
	
}
