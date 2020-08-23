package com.collectionmasterassignment;

public class Book {
	 int bookid;
	 String author;
	 float price;
	 
	public Book(int bookid, String author, float price) {
		this.bookid = bookid;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", author=" + author + ", price=" + price + "]";
	}
	 

}
