package ex2;

/**
 * Represente une alarme de temperature
 */
public class TemperatureAlarm implements TemperatureObserver
{
	public void update(TemperatureChangeEvent event) 
	{
		if (event.getTemperature() < 4 || event.getTemperature() > 18)
			System.out.println("Alarme déclenchée - " + event.getSensorName() + " " + event.getTemperature() + "°");
	}
}
