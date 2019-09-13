/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Main;

import StrategyPattern.Behavior.DisplayBehavior.DisplayAsString;
import StrategyPattern.Behavior.DisplayBehavior.IDisplayBehavior;
import StrategyPattern.Behavior.FlyBehavior.IFlyBehavior;
import StrategyPattern.Behavior.FlyBehavior.NoFly;
import StrategyPattern.Behavior.QuackBehavior.IQuackBehavior;
import StrategyPattern.Behavior.QuackBehavior.NoQuack;
import StrategyPattern.Behavior.QuackBehavior.SimpleQuack;
import StrategyPattern.Duck.Duck;

/**
 *
 * @author mehgn
 */


/*
Strategy pattern is about using composition rather than inheritance. 
"Strategy pattern defines a family of patterns encapsulates each one and make them interchangeable. Strategy lets the algorithm vary independantly from the clients that use it"
*/
public class Main {

    public static void main(String[] args) {
        Duck rubberDuck = new Duck(new DisplayAsString(), new NoFly(), new NoQuack());
        
        rubberDuck.fly();
        rubberDuck.display();
        rubberDuck.quack();
    }
}
