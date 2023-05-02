package streamAPI;

import methodReference.DisplayInformation;

public class Order {
	private String currency;
	private double amount;
	public DisplayInformation displayAmount;
	
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [currency=" + currency + ", amount=" + amount + "]";
	}

	public Order(String currency, double amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

}
