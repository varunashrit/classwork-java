package studentjpa.service;

import java.util.List;

import studentjpa.entities.Student;

public interface StudentService {
	public Student createStudent(Student student);
	public List<Student> getStudents();

}
