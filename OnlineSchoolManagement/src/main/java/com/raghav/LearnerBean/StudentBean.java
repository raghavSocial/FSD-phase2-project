package com.raghav.LearnerBean;

public class StudentBean 
{
private String student_name;
private String student_roll;
private String studing_in;
private int student_age;
private String student_address;


@Override
public String toString() {
	return "StudentBean [student_name=" + student_name + ", student_roll=" + student_roll + ", studing_in=" + studing_in
			+ ", student_age=" + student_age + ", student_address=" + student_address + "]";
}



public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getStudent_roll() {
	return student_roll;
}
public void setStudent_roll(String student_roll) {
	this.student_roll = student_roll;
}
public String getStuding_in() {
	return studing_in;
}
public void setStuding_in(String studing_in) {
	this.studing_in = studing_in;
}
public int getStudent_age() {
	return student_age;
}
public void setStudent_age(int student_age) {
	this.student_age = student_age;
}
public String getStudent_address() {
	return student_address;
}
public void setStudent_address(String student_address) {
	this.student_address = student_address;
}
	
	
}
