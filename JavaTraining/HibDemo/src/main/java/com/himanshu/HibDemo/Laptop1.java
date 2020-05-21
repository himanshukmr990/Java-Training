package com.himanshu.HibDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop1 
{
	@Id
	private int lid;
	private String brand;
	private int price;
	@ManyToOne
	private Alien alien;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Laptop1 [lid=" + lid + ", brand=" + brand + ", price=" + price + ", alien=" + alien + "]";
	}
	
}
