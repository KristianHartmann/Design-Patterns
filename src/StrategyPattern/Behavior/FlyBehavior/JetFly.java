/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Behavior.FlyBehavior;

/**
 *
 * @author mehgn
 */
public class JetFly implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("Jet fly");
    }
    
}
