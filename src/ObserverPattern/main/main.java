/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.main;

import ObserverPattern.Observable.WeatherStation;
import ObserverPattern.Observer.PhoneDisplay;

/**
 *
 * @author mehgn
 */

/*
"The observer defines a one to many relation between objects so when an object changes state, all of it's dependencies are notified and updated automaticly"
*/
public class main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay display = new PhoneDisplay(station);
        System.out.println("Before updating to display: ");
        display.display();
        station.notifyObserver();
        display.update();
        System.out.println("After updating to display: ");
        display.display();
    }
}
