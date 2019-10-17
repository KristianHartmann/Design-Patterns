/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern.AddonDecorator;

import DecoratorPattern.Beverage.Beverage;

/**
 *
 * @author mehgn
 */
public class Caramel extends AddonDecorator {

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
        addCost();
    }
    private Beverage beverage;

    public void addCost() {
         beverage.addCost(2);
    }


}
