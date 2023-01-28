package com.raghav.LearnerBean;

public class TimetableBean 
{

	private String period;
	private String classes_assigned;
	private String subjects_assigned;
	private String  time_duration;
	private String teacher_assigned;
	private String student_inclass;
	
	
	
	
	
	
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getClasses_assigned() {
		return classes_assigned;
	}
	public void setClasses_assigned(String classes_assigned) {
		this.classes_assigned = classes_assigned;
	}
	public String getSubjects_assigned() {
		return subjects_assigned;
	}
	public void setSubjects_assigned(String subjects_assigned) {
		this.subjects_assigned = subjects_assigned;
	}
	public String getTime_duration() {
		return time_duration;
	}
	public void setTime_duration(String time_duration) {
		this.time_duration = time_duration;
	}
	public String getTeacher_assigned() {
		return teacher_assigned;
	}
	public void setTeacher_assigned(String teacher_assigned) {
		this.teacher_assigned = teacher_assigned;
	}
	public String getStudent_inclass() {
		return student_inclass;
	}
	public void setStudent_inclass(String student_inclass) {
		this.student_inclass = student_inclass;
	}
	
	
	@Override
	public String toString() {
		return "TimetableBean [period=" + period + ", classes_assigned=" + classes_assigned + ", subjects_assigned="
				+ subjects_assigned + ", time_duration=" + time_duration + ", teacher_assigned=" + teacher_assigned
				+ ", student_inclass=" + student_inclass + "]";
	}
	
	
	
	
	
}
