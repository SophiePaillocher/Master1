package ex3;

public class TemperatureChangeEvent 
{
	private float temperature;
	private String sensorName;
	
	public TemperatureChangeEvent(float temperature, String sensorName)
	{
		this.temperature = temperature;
		this.sensorName = sensorName;
	}

	public float getTemperature() 
	{
		return temperature;
	}

	public String getSensorName()
	{
		return sensorName;
	}
}
