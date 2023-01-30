package com.raghav.LearnerBean;

public class TeacherBean 
{
private String teacher_name;
private String teacher_id;
private String subject_expertise;
private int experience;
private int phone;




public String getTeacher_name() {
	return teacher_name;
}
public void setTeacher_name(String teacher_name) {
	this.teacher_name = teacher_name;
}
public String getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(String teacher_id) {
	this.teacher_id = teacher_id;
}
public String getSubject_expertise() {
	return subject_expertise;
}
public void setSubject_expertise(String subject_expertise) {
	this.subject_expertise = subject_expertise;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}



@Override
public String toString() {
	return "TeacherBean [teacher_name=" + teacher_name + ", teacher_id=" + teacher_id + ", subject_expertise="
			+ subject_expertise + ", experience=" + experience + ", phone=" + phone + "]";
}
	

	
}
