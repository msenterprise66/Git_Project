package org.kk.git;

public class Student {

	private String sname;
	private String course;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", course=" + course + "]";
	}	
}
