package command;

public class Customer {
	ShopApprentice shopApprentice;
	Service service;
	
	public Customer(ShopApprentice shopApprentice) {
		this.shopApprentice = shopApprentice;
	}
	public void scheduleService(Service service) {
		this.service = service;
	}
	public void needRepair() {
		shopApprentice.takeRepairRequest(service);
	}
}
