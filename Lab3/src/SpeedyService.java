import command.Customer;
import command.FilterChangeService;
import command.Mechanic;
import command.OilChangeService;
import command.ShopApprentice;

public class SpeedyService {

	public static void main(String[] args) {
		ShopApprentice shopApprentice = new ShopApprentice();
		Mechanic mechanic = new Mechanic();
		Customer customer = new Customer(shopApprentice);
		
		System.out.println("Welcome to Speedy Service. How can we help you?");
		customer.scheduleService(new OilChangeService(mechanic));
		customer.needRepair();
		
		customer.scheduleService(new FilterChangeService(mechanic));
		customer.needRepair();
	}
}
