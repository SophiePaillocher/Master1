package ex1;

public class ThermometerAdaptator extends TemperatureObservable {
	
	private Thermometer thermometer;
	
	public ThermometerAdaptator(Thermometer thermometer) {
		this.thermometer = thermometer;
	}

	public void setTemperature(float temperature){
		if (thermometer.getTemperature() > temperature)
			thermometer.increaseTemperature(temperature);
		else 
			thermometer.decreaseTemperature(temperature);
		notify(new Event("thermometer", temperature));
	}
	
	public float getTemperature(){
		return thermometer.getTemperature();
	}
	


}
