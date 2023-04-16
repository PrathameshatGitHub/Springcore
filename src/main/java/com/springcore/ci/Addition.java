package com.springcore.ci;

public class Addition {
	public  int a;
	 public int b;
	 public int c;
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(" int .int");
	}
	public Addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println(" String  .String");
	}
	public  int  sum() {
		int c=a+b;
		return c;
	}
	
	

}
