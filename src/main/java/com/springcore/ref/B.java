package com.springcore.ref;

public class B {
	private int x;
	private A obj;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public A getObj() {
		return obj;
	}
	public void setObj(A obj) {
		this.obj = obj;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "B [x=" + x + ", obj=" + obj + "]";
	}

}
