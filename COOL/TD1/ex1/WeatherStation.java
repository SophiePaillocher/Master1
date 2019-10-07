package ex1;

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
	
	public void displayTemperature(String sensorName, float temperature)
	{
		System.out.println("Station " + number + " - " + sensorName + " " + temperature + "�");
	}

	public void update(Event event) {
		displayTemperature(event.getName(), event.getTemperature());
		
	}
}
