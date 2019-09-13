/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.Observer;

import ObserverPattern.Observable.WeatherStation;

/**
 *
 * @author mehgn
 */
public class PhoneDisplay implements IObserver, IDisplay {

    private int temperature;
    /*
    benyttes til at informere PhoneDisplay hvilket data der har ændret sig. DÅRLIG IDE (Find en måde og parse data på uden phonedisplay kender til weatherstation )
     */
    private WeatherStation station = new WeatherStation();

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }
    @Override
    public void update() {
        temperature = this.station.getTemperature();
    }

    @Override
    public void display() {
        System.out.println("the temperature is: " + temperature);
    }

}
