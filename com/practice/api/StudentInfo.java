package com.practice.api;

public class StudentInfo implements Comparable<StudentInfo> {
	
	private String name;
	private Integer dob;
	private Integer age;
	public StudentInfo(String name, int dob, int age) {
		
		this.name = name;
		this.dob = dob;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", dob=" + dob + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDob() {
		return dob;
	}
	public void setDob(Integer dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int compareTo(StudentInfo dateOfBirth){
		
		if(this.getDob()>dateOfBirth.getDob()){
			return +1;
		}
		if(this.getDob()<dateOfBirth.getDob()){
			return -1;
		}
		return 0;
		//return this.getDob().compareTo(dateOfBirth.getDob());
	}
	

}
