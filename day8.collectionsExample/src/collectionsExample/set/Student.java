package collectionsExample.set;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int StudentId;
	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.StudentId == o.getStudentId()) {
			return 0;
		}else if(this.StudentId> o.getStudentId()) {
			return 1;
		}else {
		return -1;
		}
	}


	public int getStudentId() {
		return StudentId;
	}


	public void setStudentId(int studentId) {
		StudentId = studentId;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId) {
		super();
		StudentId = studentId;
	}


	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(StudentId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return StudentId == other.StudentId;
	}


	

}