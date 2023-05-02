package webapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import webapp.entities.Dealer;

public class DealerDAOImpl implements DealerDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp");
	private EntityManager em = emf.createEntityManager();

	@Override
	public Dealer createDealer(Dealer dealer) {
		em.getTransaction().begin();
		em.persist(dealer);
		em.getTransaction().commit();
		return dealer;
	}

	@Override
	public Dealer retrieveDealerById(Integer dealerId) {

		return em.find(Dealer.class, dealerId);
	}

	@Override
	public Dealer updateDealer(Dealer dealer) {
		Dealer deller = em.find(Dealer.class, dealer.getDealerId());
		if (deller != null) {
			deller.setCity(dealer.getCity());
			deller.setDealerName(dealer.getDealerName());
			em.getTransaction().begin();
			em.persist(deller);
			em.getTransaction().commit();
		}
		return deller;
	}

	@Override
	public String deleteDealer(Integer dealerId) {
		em.getTransaction().begin();
		Dealer dealer = em.find(Dealer.class, dealerId);
		if (dealer != null) {
			em.remove(dealerId);
		}
		em.getTransaction().commit();
		return "Deleted Successfully";
	}


}
