package ex3;

import java.util.ArrayList;

public abstract class TemperatureSensor 
{
	private String name;
	private ArrayList<TemperatureObserver> observers;
	
	public TemperatureSensor(String name)
	{
		this.name = name;
		this.observers = new ArrayList<TemperatureObserver>();
	}
	
	public void addObserver(TemperatureObserver o)
	{
		observers.add(o);
	}
	
	public abstract float getTemperature();
	public abstract void setTemperature(float temperature);
	
	protected void notifyTemperatureChange()
	{
		TemperatureChangeEvent event = new TemperatureChangeEvent(getTemperature(), name);
		for (TemperatureObserver o : observers) 
			o.update(event);
	}
}
