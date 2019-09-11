/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Behavior.QuackBehavior;

/**
 *
 * @author mehgn
 */
public class SimpleQuack implements IQuackBehavior{
    public void quack(){
        System.out.println("Simple quack");
    }
}
