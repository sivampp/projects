package com.emp;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *@author Paramasivam Thangavel
 *@created Sep 5, 2025
**/


@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="USER", schema="CPO_DB")
public class User {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ROLE")
	private String role;
	
	@Override
	public String toString() {
		return this.id+" : "+ this.name+" : "+this.role +" : ";
	}

}


