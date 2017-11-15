package com.digitek.homesearch.model;

import java.io.Serializable;

public class Property implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6160088341073658143L;

	private int id;
	
	private Address address;
	
	private String type;
	
	private int bathrooms;
	
	private int bedrooms;
	
	private int size;
	
	private int age;
	
	private long listPrice;
	
	private int lotWidth;
	
	private int lotLength;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getListPrice() {
		return listPrice;
	}

	public void setListPrice(long listPrice) {
		this.listPrice = listPrice;
	}

	public int getLotWidth() {
		return lotWidth;
	}

	public void setLotWidth(int lotWidth) {
		this.lotWidth = lotWidth;
	}

	public int getLotLength() {
		return lotLength;
	}

	public void setLotLength(int lotLength) {
		this.lotLength = lotLength;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
