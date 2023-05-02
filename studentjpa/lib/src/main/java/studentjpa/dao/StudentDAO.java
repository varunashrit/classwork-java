package studentjpa.dao;

import java.util.List;

import studentjpa.entities.Student;

public interface StudentDAO {
	public Student createStudent(Student student);
	public List<Student> getStudents();

}
