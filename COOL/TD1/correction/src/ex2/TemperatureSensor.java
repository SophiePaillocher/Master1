package ex2;

import java.util.ArrayList;

/**
 * Represente un capteur de temperature.
 */
public class TemperatureSensor 
{
	private String name;
	private float temperature;
	private ArrayList<TemperatureObserver> observers;
	
	public TemperatureSensor(String name)
	{
		this.name = name;
		this.observers = new ArrayList<TemperatureObserver>();
	}
	
	public float getTemperature()
	{
		return temperature;
	}
	
	public void setTemperature(float temperature)
	{
		this.temperature = temperature;
		notifyTemperatureChange();
	}
	
	public void addObserver(TemperatureObserver o)
	{
		observers.add(o);
	}
	
	private void notifyTemperatureChange()
	{
		TemperatureChangeEvent event = new TemperatureChangeEvent(temperature, name);
		for (TemperatureObserver o : observers) 
			o.update(event);
	}
}
