package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

public class BaileyPizzaCommand {
  //reference to the order
  PizzaOrder order;
  public BaileyPizzaCommand(PizzaOrder order){
    this.order = order;
  }
  public void execute(){
    order.bakeBaileyPizza();
  }
}