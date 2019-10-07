package ex1;

import java.util.ArrayList;

public abstract class TemperatureObservable{
	
	private ArrayList<TemperatureObserver> observers;
	
	public TemperatureObservable(){
		observers = new ArrayList<TemperatureObserver>();
	}
	
	public void signIn (TemperatureObserver observer){
		observers.add(observer);
	}
	
	public void signOut (TemperatureObserver observer){
		observers.remove (observer);
	}
	
	public void notify(Event event) {
		for (TemperatureObserver observer : observers)
			observer.update(event);
	}
}
