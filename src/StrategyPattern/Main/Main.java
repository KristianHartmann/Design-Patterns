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
public class Main {

    public static void main(String[] args) {
        Duck rubberDuck = new Duck(new DisplayAsString(), new NoFly(), new NoQuack());
        
        rubberDuck.fly();
        rubberDuck.display();
        rubberDuck.quack();
    }
}
