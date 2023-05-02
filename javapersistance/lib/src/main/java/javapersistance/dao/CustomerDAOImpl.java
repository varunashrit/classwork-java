package javapersistance.dao;


import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import javapersistance.entities.Customer; 

public class CustomerDAOImpl implements CustomerDAO {

	
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javapersistance");
		EntityManager em = emf.createEntityManager();
		@Override
		public Customer createCustomer(Customer customer) {
			em.getTransaction().begin();
			em.persist(customer);
			em.getTransaction().commit();
			return customer;
		}
		@Override
		public Customer updateCustomer(Customer customer) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Customer cust = em.merge(customer);
			System.out.println(cust);
			em.getTransaction().commit();

			
			return customer;
		}
		
		
		@Override
		public Customer retrieveProduct(Integer productId) {
			// TODO Auto-generated method stub
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Customer customer = em.find(Customer.class, productId);
			em.getTransaction().commit();
			return customer;
		}
		@Override
		public List<Customer> getCustomers() {
			em.getTransaction().begin();
			//Query query =em.createQuery("select c from Customer c");//Query using JPQL syntax we are retrieving using entity
			Query query = em.createNativeQuery("select * from customer_details",Customer.class);//Native sql statements
			List<Customer> customerList = query.getResultList();
			em.getTransaction().commit();
			return customerList;
		}
		@Override
		public List<Customer> customers() {
			em.getTransaction().begin();
			TypedQuery<Customer> query =em.createQuery("select c from Customer c",Customer.class);
			List<Customer> customerList = query.getResultList();
			em.getTransaction().commit();
			return customerList;
		}
		@Override
		public Customer getCustomerbyId(Integer customerId) {
			em.getTransaction().begin();
			TypedQuery<Customer> query = em.createQuery("select c from Customer c where c.id=:id",Customer.class);
			query.setParameter("id", customerId);
			Customer customer = query.getSingleResult();
			em.getTransaction().commit();
			return customer;
		}
		@Override
		public List<Customer> getAllCustomers() {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("getAllCustomers");
			List<Customer> customerList = query.getResultList();
			em.getTransaction().commit();
			return customerList;
			}

		
		@Override
		public List<Customer> getCustomersCountryWise(String country) {
			em.getTransaction().begin();
			CriteriaBuilder cb=em.getCriteriaBuilder();
			CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
			Root<Customer> customer = cq.from(Customer.class);
			cq.where(cb.equal(customer.get("address").get("country"), country));
		
			TypedQuery<Customer> query = em.createQuery(cq);
			List<Customer> custLists = query.getResultList();
			return custLists;
		}

		    }

	

