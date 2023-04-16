package com.springcore.Life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean,DisposableBean {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		System.out.println("setting the price");
		
		
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("this is destroy method");
		
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initializing method");
	}
	
}
