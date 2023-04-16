package com.springcore;

public class Student {
	
	private int age;
    public Student(String studentName) {
        this.studentName = studentName;
    }

    private int studentId;

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
	
	System.out.println("setting the age" );
	
this.age = age;
	}

	public Student(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "student{" +
                "my id=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

    private  String studentName;

    public Student() {
    }

    private String studentAddress;
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
    	
    System.out.println("setting name");
        this.studentName = studentName;
    }



    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
    	System.out.println("ssetting the addresss");
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
    	System.out.println("setting the id");
        this.studentId = studentId;
    }
}
