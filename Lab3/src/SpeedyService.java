import java.util.ArrayList;
import java.util.Arrays;

import command.Customer;
import command.FilterChangeService;
import command.Mechanic;
import command.OilChangeService;
import command.Service;
import command.ShopApprentice;
import facade.Engine;
import facade.Headlights;
import facade.MotorcycleFacade;
import facade.Radio;

public class SpeedyService {

	public static void main(String[] args) {
		ShopApprentice shopApprentice = new ShopApprentice();
		Mechanic mechanic = new Mechanic();
		Customer customer = new Customer(shopApprentice);
				
		Headlights headlights = new Headlights("Headlights");
		Engine engine = new Engine("Engine");
		Radio radio = new Radio("Radio", "103.5");
		
		ArrayList<Service> serviceList = new ArrayList<Service>(Arrays.asList(new OilChangeService(mechanic), new FilterChangeService(mechanic)));
		for (Service service: serviceList) {
			System.out.println("Welcome to Speedy Service. How can we help you?");
			customer.scheduleService(service);
			customer.needRepair();
			
			System.out.println("Your service is complete. Let's verify the motorcycle is still operating properly.");
			MotorcycleFacade motorcycleFacade = new MotorcycleFacade(engine, headlights, radio);
			motorcycleFacade.turnKeyOn();
			
			System.out.println("Looks like all systems are working!");
			motorcycleFacade.turnKeyOff();
			
			System.out.println();
		}
	}
}
