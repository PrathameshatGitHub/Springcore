package com.springcore;

public class Teacher {
	
	private int number;

	public Teacher(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "Teacher [number=" + number + "]";
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}
	public String getMessege() {
		return "you are so intelligent man";
	}

	public void setNumber(int number) {
		this.number = number;
	}
	

}
