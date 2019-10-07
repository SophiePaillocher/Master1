package ex2;

/**
 * Represente une station meteo
 */
public class WeatherStation implements TemperatureObserver
{
	private static int stationCounter = 0;
	private int number;
	
	public WeatherStation()
	{
		stationCounter++;
		number = stationCounter;
	}
	
	public void update(TemperatureChangeEvent event) 
	{
		System.out.println("Station " + number + " - " + event.getSensorName() + " " + event.getTemperature() + "°");
	}
}
