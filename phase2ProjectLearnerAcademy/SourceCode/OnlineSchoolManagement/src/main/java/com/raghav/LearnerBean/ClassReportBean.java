package com.raghav.LearnerBean;

public class ClassReportBean 
{
private String class_name;
private String student_name;
private String subject_name;
private String teachers_name;



public String getClass_name() {
	return class_name;
}
public void setClass_name(String class_name) {
	this.class_name = class_name;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getSubject_name() {
	return subject_name;
}
public void setSubject_name(String subject_name) {
	this.subject_name = subject_name;
}
public String getTeachers_name() {
	return teachers_name;
}
public void setTeachers_name(String teachers_name) {
	this.teachers_name = teachers_name;
}


@Override
public String toString() {
	return "ClassReportBean [class_name=" + class_name + ", student_name=" + student_name + ", subject_name="
			+ subject_name + ", teachers_name=" + teachers_name + "]";
}

	
	
	
	
}
