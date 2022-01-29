package facade;

public class Engine {
	String description;
	
	public Engine(String description) {
		this.description = description;
	}
	
	public void on() {
		System.out.println(this.description + " on");
	}
	
	public void off() {
		System.out.println(this.description + " off");
	}
	
	public String toString() {
		return this.description;
	}
}
