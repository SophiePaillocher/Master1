package ex3;

/**
 * Represente un capteur de temperature.
 */
public class DefaultTemperatureSensor extends TemperatureSensor
{
	private float temperature;
	
	public DefaultTemperatureSensor(String name)
	{
		super(name);
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
}
