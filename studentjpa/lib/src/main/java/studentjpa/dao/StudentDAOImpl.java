package studentjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import studentjpa.entities.Student;

public class StudentDAOImpl implements StudentDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentjpa");
	EntityManager em = emf.createEntityManager();
	@Override
	public Student createStudent(Student student) {
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		return student;
	}
	@Override
	public List<Student> getStudents() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("getStudents");
		List<Student> studentList = query.getResultList();
		return studentList;
	}
	

}
