package ex3;

public class ThermometerAdapter extends TemperatureSensor 
{
	private Thermometer thermometer;
	
	public ThermometerAdapter(String name, float initialTemperature)
	{
		super(name);
		thermometer = new Thermometer(initialTemperature);
	}
	
	public float getTemperature() 
	{
		return thermometer.getTemperature();
	}

	public void setTemperature(float temperature)
	{
		if (temperature > getTemperature())
			thermometer.increaseTemperature(temperature - getTemperature());
		else
			thermometer.decreaseTemperature(getTemperature() - temperature);
		notifyTemperatureChange();
	}
}
