/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Behavior.DisplayBehavior;

/**
 *
 * @author mehgn
 */
public class DisplayAsString implements IDisplayBehavior{

    @Override
    public void display() {
        System.out.println("String display");
    }
    
}
