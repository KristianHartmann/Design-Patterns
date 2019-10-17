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
public abstract class AddonDecorator extends Beverage{
    private int cost;

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void addCost(int cost) {
        this.cost += cost;
    }
}
