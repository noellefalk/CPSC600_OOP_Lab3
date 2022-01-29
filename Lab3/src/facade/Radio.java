package facade;

public class Radio {
	String description;
	String station;
	
	public Radio(String description, String station) {
		this.description = description;
		this.station = station;
	}
	
	public String getStation() {
		return station;
	}
	
	public void on() {
		System.out.println(this.description + " on");
	}
	
	public void off() {
		System.out.println(this.description + " off");
	}
	
	public void setStation(String station) {
		this.station = station;
		System.out.println("Resetting the station to " + station);
	}
	
	public void setVolume(int volumeLevel) {
		System.out.println(this.description + " setting the volume to " + volumeLevel);
	}
	
	public String toString() {
		return this.description;
	}
}
