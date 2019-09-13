/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.Observable;

import ObserverPattern.Observer.IObserver;
import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author mehgn
 */
public class WeatherStation implements IObservable {

    private int temperature;

    public int getTemperature() {
        return temperature;
    }
    private ArrayList<IObserver> observerList = new ArrayList<>();
    
    
    
    public WeatherStation() {
        temperature = 10;
    }
    

    @Override
    public void add(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver IObserver : observerList) {
            IObserver.update();
        }
    }
}


