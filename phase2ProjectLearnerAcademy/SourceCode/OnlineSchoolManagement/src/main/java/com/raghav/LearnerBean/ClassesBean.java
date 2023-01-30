package com.raghav.LearnerBean;

public class ClassesBean 

{
private String class_name;
private int numberofstudent;
private String floor;




public String getClass_name() {
	return class_name;
}
public void setClass_name(String class_name) {
	this.class_name = class_name;
}
public int getNumberofstudent() {
	return numberofstudent;
}
public void setNumberofstudent(int numberofstudent) {
	this.numberofstudent = numberofstudent;
}
public String getFloor() {
	return floor;
}
public void setFloor(String floor) {
	this.floor = floor;
}


@Override
public String toString() {
	return "ClassesBean [class_name=" + class_name + ", numberofstudent=" + numberofstudent + ", floor=" + floor + "]";
}
	
	
	 
}
