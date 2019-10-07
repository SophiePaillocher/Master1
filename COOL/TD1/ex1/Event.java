package ex1;

public class Event {
	
	private String name;
	private float temperature;
	
	public Event(String name, float temperature) {
		this.name = name;
		this.temperature = temperature;
	}

	public float getTemperature(){
		return temperature;
	}
	
	public String getName(){
		return name;
	}
	
	
}
