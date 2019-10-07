package ex2;

/**
 * Represente la classe principale du programme
 */
public class MainClass 
{
	public static void main(String[] args) 
	{
		WeatherStation ws1 = new WeatherStation();
		WeatherStation ws2 = new WeatherStation();
		TemperatureAlarm ta = new TemperatureAlarm();
		
		TemperatureSensor ts1 = new TemperatureSensor("Salon");
		TemperatureSensor ts2 = new TemperatureSensor("Cave");
		TemperatureSensor ts3 = new TemperatureSensor("Jardin");
		
		ts1.addObserver(ws1);
		ts1.addObserver(ws2);
		ts2.addObserver(ws2);
		ts3.addObserver(ws2);
		ts2.addObserver(ta);
		
		System.out.println("Salon 20°, Cave 14°, Jardin 19°");
		ts1.setTemperature(20);
		ts2.setTemperature(14);
		ts3.setTemperature(19);
		System.out.println("Jardin 13°");
		ts3.setTemperature(13);
		System.out.println("Salon 19°");
		ts1.setTemperature(19);		
		System.out.println("Cave 3°");
		ts2.setTemperature(3);		
	}
}
