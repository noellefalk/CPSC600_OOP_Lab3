package command;

public class OilChangeService implements Service {
	Mechanic mechanic;
	
	public OilChangeService(Mechanic mechanic) {
		this.mechanic = mechanic;
	}
	
	public void serviceRequest() {
		mechanic.changeOil();		
	}
}
