package ex3;

public class Thermometer 
{
	private float temperature;
	
	public Thermometer(float initialTemperature)
	{
		this.temperature = initialTemperature;
	}
	
	public void increaseTemperature(float value)
	{
		temperature += value;
		temperature += 0.1; // moins pr�cis le thermom�tre !
	}
	
	public void decreaseTemperature(float value)
	{
		temperature -= value;
		temperature -= 0.1; // moins pr�cis le thermom�tre !
	}
	
	public float getTemperature()
	{
		return temperature;
	}
}
