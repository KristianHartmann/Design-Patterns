/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern.main;

import DecoratorPattern.AddonDecorator.AddonDecorator;
import DecoratorPattern.AddonDecorator.Caramel;
import DecoratorPattern.Beverage.Beverage;
import DecoratorPattern.Beverage.Espresso;
/*
The decorator pattern attaches additional responsabilites to an object dynamically.
Decorators provides a flexible alternative to subclassing for extending functionality.
 */

/*
Pesonlig note: i min mening er det DÅRLIGT design da AddonDecorator er spild da code bare er duplikat af Beverage og Caramel bare kunne extend Beverage direkte.
Også dårligt design at addons kender direkte til beverage. 
*/
public class main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getCost());
        AddonDecorator caramel = new Caramel(espresso);
        System.out.println(espresso.getCost());
    }
}
