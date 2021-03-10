package com.demo.catalog.models;

public class CatalogItem {

	private String name;
	private String dec;
	private int rating;
	
	public CatalogItem() {}
	
	public CatalogItem(String name, String dec, int rating) {
		super();
		this.name = name;
		this.dec = dec;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
