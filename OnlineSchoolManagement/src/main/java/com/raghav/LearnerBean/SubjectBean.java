package com.raghav.LearnerBean;

public class SubjectBean 

{

	private String subject;
	private String bookauthor;
	private String subjectteacher;
	
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getSubjectteacher() {
		return subjectteacher;
	}
	public void setSubjectteacher(String subjectteacher) {
		this.subjectteacher = subjectteacher;
	}
	
	
	@Override
	public String toString() {
		return "SubjectBean [subject=" + subject + ", bookauthor=" + bookauthor + ", subjectteacher=" + subjectteacher
				+ "]";
	}
	
	
	
	
	
}
