package facade;

public class Headlights {
	String description;
	
	public Headlights(String description) {
		this.description = description;
	}
	
	public void on() {
		System.out.println(this.description + " on");
	}
	
	public void off() {
		System.out.println(this.description + " off");
	}
	
	public void brightsOn() {
		System.out.println("High beams on");
	}
	
	public void brightsOff() {
		System.out.println("High beams off");
	}
	
	public String toString() {
		return this.description;
	}
}
