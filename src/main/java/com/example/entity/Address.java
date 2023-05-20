package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="Address_types")
public class Address {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addr_id ;
	private String area;
	private String city;
	private String addr_type;
	
	public int getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddr_type() {
		return addr_type;
	}
	public void setAddr_type(String addr_type) {
		this.addr_type = addr_type;
	}
}
