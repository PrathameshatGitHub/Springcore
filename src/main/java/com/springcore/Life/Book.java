package com.springcore.Life;

public class Book {
	private String name;

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public  void init() {
		System.out.println("this is initlize method");
		
		
	}
	public  void destroy() {
		System.out.println("this is destroy method");
		
		
	}

}
