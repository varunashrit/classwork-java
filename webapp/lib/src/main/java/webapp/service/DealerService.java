package webapp.service;

import webapp.entities.Dealer;

public interface DealerService {
	// Create
		public Dealer createDealer(Dealer dealer);

		// Retrieve
		public Dealer retrieveDealerById(Integer dealerId);

		// Update
		public Dealer updateDealer(Dealer dealer);

		// Delete
		public String deleteDealer(Integer dealerId);

}
