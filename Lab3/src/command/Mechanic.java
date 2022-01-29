package command;

public class Mechanic {
	Boolean oilChanged = false;
	Boolean filterChanged = false;
	
	public Boolean getOilChanged() {
		return this.oilChanged;
	}

	public Boolean getFilterChanged() {
		return this.filterChanged;
	}

	public void changeOil() {
		System.out.println("I'm working on the oil change. It will take 45 minutes.");
		this.oilChanged = true;
	}
	
	public void changeFilter() {
		System.out.println("I'm starting the filter change. It will take 10 minutes.");
		this.filterChanged = true;
	}
}
