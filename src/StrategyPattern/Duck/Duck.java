/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Duck;

import StrategyPattern.Behavior.DisplayBehavior.IDisplayBehavior;
import StrategyPattern.Behavior.FlyBehavior.IFlyBehavior;
import StrategyPattern.Behavior.QuackBehavior.IQuackBehavior;

/**
 *
 * @author mehgn
 */
public class Duck implements IDisplayBehavior, IFlyBehavior, IQuackBehavior{
    
    IDisplayBehavior IDisplayBehavior;
    IFlyBehavior IFlyBehavior;
    IQuackBehavior IQuackBehavior;

    public Duck(IDisplayBehavior IDisplayBehavior, IFlyBehavior IFlyBehavior, IQuackBehavior IQuackBehavior) {
        this.IDisplayBehavior = IDisplayBehavior;
        this.IFlyBehavior = IFlyBehavior;
        this.IQuackBehavior = IQuackBehavior;
    }

    @Override
    public void display() {
        this.IDisplayBehavior.display();
    }

    @Override
    public void fly() {
        this.IFlyBehavior.fly();
    }

    @Override
    public void quack() {
        this.IQuackBehavior.quack();
    }
    
}
