package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Client
public class PizzaOrderer{
  public static void main(String[] args)    {
    PizzaOrderControl control = new PizzaOrderControl();
    PizzaOrder order = new PizzaOrder();
    PizzaCommand deepDish = new DeepDishCommand(order);
    PizzaCommand thinCrust = new ThinCrustCommand(order);
<<<<<<< HEAD
    PizzaCommand olasPizza = new OlasPizzaCommand(order);
=======

    PizzaCommand chancePizza = new ChancePizzaCommand(order);

    PizzaCommand joshPizza = new JoshPizzaCommand(order);

    PizzaCommand baileyPizza = new BaileyPizzaCommand(order); 

>>>>>>> master
    // Order a deep Dish pizza
    control.setCommand(deepDish);
    control.submitOrder();

    // Order a thinCrust pizza
    control.setCommand(thinCrust);
    control.submitOrder();

<<<<<<< HEAD
    // Order an Ola pizza
    control.setCommand(olasPizza);
=======

    // Order a Chance Pizza
    control.setCommand(chancePizza);

    // Order a Josh pizza
    control.setCommand(joshPizza);

    //Order a Bailey Pizza
    control.setCommand(baileyPizza); 

>>>>>>> master
    control.submitOrder();
  }
}