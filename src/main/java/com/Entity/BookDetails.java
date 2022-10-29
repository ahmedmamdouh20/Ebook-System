package com.Entity;

public class BookDetails {
     private int bookID;
     private String name;
     private String author;
     private String price;
     private String category;
     private String status;
     private String photoName;
	public BookDetails() {
		super();
	}
	public BookDetails(String name, String author, String price, String category, String status, String photoName) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.category = category;
		this.status = status;
		this.photoName = photoName;
	}
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
  
     
     
}
