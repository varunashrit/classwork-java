package studentjpa.service;

import java.util.List;

import studentjpa.dao.StudentDAO;
import studentjpa.dao.StudentDAOImpl;
import studentjpa.entities.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO = new StudentDAOImpl();
	
	@Override
	public Student createStudent(Student student) {
		
		return studentDAO.createStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		
		return studentDAO.getStudents();
	}

}
