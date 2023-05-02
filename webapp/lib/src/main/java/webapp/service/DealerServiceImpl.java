package webapp.service;
import webapp.dao.DealerDAO;
import webapp.dao.DealerDAOImpl;
import webapp.entities.Dealer;

public class DealerServiceImpl implements DealerService {
	private DealerDAO dealerDAO = new DealerDAOImpl();
	@Override
	public Dealer createDealer(Dealer dealer) {
		
		return dealerDAO.createDealer(dealer);
	}

	@Override
	public Dealer retrieveDealerById(Integer dealerId) {
		return dealerDAO.retrieveDealerById(dealerId);
	}

	@Override
	public Dealer updateDealer(Dealer dealer) {
		return dealerDAO.updateDealer(dealer);
	}

	@Override
	public String deleteDealer(Integer dealerId) {
		return dealerDAO.deleteDealer(dealerId);
	}

}

