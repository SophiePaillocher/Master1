package ex1;

import java.util.ArrayList;

public abstract class TemperatureObservable{
	private ArrayList<TemperatureObserver> observers;
	protected TemperatureObservable(){
		observers = new ArrayList<TemperatureObserver>();
	}
	public void signIn (TemperatureObserver station){
		observers.add(station);
	}
	public void signOut (TemperatureObserver station){
		observers.remove (station);
	}
	public void notify(){
		for (TemperatureObserver observer : observers)
			observer.update();
	}
}
