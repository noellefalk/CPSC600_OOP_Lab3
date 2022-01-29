package command;

public class ShopApprentice {
	Service service;
	
	public void takeRepairRequest(Service service) {
		this.service = service;
		service.serviceRequest();		
	}
}
