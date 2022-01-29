package facade;

public class MotorcycleFacade {
	Headlights headlights;
	Engine engine;
	Radio radio;
	
	public MotorcycleFacade(Engine engine, Headlights headlights, Radio radio) {
		this.radio = radio;
		this.headlights = headlights;
		this.engine = engine;
	}
	
	public void turnKeyOn() {
		engine.on();
		headlights.on();
		radio.on();
	}
	
	public void turnKeyOff() {
		radio.off();
		engine.off();
		headlights.off();
	}
}
