package ex1;

public class TemperatureAlarm implements TemperatureObserver{
	
	public void update(Event event) {
		if (event.getTemperature() < 4 || event.getTemperature() > 18) {
			System.out.println("Biiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiip");
		}
		
	}

}
