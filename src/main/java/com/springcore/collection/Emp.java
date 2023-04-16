package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> numbers;
	private Set<String> Addresss;
	private Map<String,String>courses;
	private Properties prop;
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public Set<String> getAddresss() {
		return Addresss;
	}
	public void setAddresss(Set<String> addresss) {
		Addresss = addresss;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String name, List<String> numbers, Set<String> addresss, Map<String, String> courses) {
		super();
		this.name = name;
		this.numbers = numbers;
		Addresss = addresss;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", numbers=" + numbers + ", Addresss=" + Addresss + ", courses=" + courses + "]";
	}
	

}
