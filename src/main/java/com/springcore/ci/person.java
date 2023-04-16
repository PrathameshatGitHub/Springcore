package com.springcore.ci;

import java.util.List;

public class person {
	private int age;
	private String name;
	private certtificate carti;
	private List<String>list;
	
	public   person(int age,String name,certtificate carti,List<String>list) {
		
		this.age=age;
		this.name=name;
		this.carti=carti;
		this.list=list;
		}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.age+" :"+this.name+":"+this.carti+" :"+this.list;
	}
	
	
	

}
