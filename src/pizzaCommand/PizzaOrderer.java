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

    PizzaCommand chancePizza = new ChancePizzaCommand(order);

    PizzaCommand joshPizza = new JoshPizzaCommand(order);

    PizzaCommand baileyPizza = new BaileyPizzaCommand(order); 

    // Order a deep Dish pizza
    control.setCommand(deepDish);
    control.submitOrder();

    // Order a thinCrust pizza
    control.setCommand(thinCrust);
    control.submitOrder();


    // Order a Chance Pizza
    control.setCommand(chancePizza);
    control.submitOrder();

    // Order a Josh pizza
    control.setCommand(joshPizza);
    control.submitOrder();

    //Order a Bailey Pizza
    control.setCommand(baileyPizza); 
    control.submitOrder();
  }
}