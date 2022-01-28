package command;

public class FilterChangeService implements Service{
	Mechanic mechanic;
	
	public FilterChangeService(Mechanic mechanic) {
		this.mechanic = mechanic;
	}
	public void serviceRequest() {
		mechanic.changeFilter();	
	}
}