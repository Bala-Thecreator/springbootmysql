package com.marlabs.bala;

import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;


@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String bookname;
	private String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Long id, String bookname, String author) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", author=" + author + "]";
	}	

}
