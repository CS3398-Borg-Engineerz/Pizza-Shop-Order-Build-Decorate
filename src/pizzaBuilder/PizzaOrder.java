package patternsexamp;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// Using Command Design Patttern (code based on DZone Command Pattern)

//Receiver
public class PizzaOrder{
  private boolean orderReady;
  public Pizza.Builder pb;
  public Pizza p;

  public void bakeDeepDish(){
	System.out.format("Baking a deepdish... \n"); 
    pb = new Pizza.Builder("Deep Dish"); 
    p = pb.pizzas(1).build();
    reportOrder();

  }
  public void bakeThinCrust(){
  	System.out.format("Baking a thincrust... \n");
  	pb = new Pizza.Builder("Thin Crust");  
    p = pb.pizzas(1).build();
    reportOrder();
  }

<<<<<<< HEAD
  public void bakeOlasPizza(){
    System.out.format("Baking Ola's Pizza... \n");
    pb = new Pizza.Builder("Ola's Crust");  
=======

  public void bakeChancePizza(){
  	System.out.format("Baking a Chance's Pizza... \n");
  	pb = new Pizza.Builder("Chance Pizza");  

  public void bakeJoshPizza(){
    System.out.format("Baking a Josh Pizza... \n");
    pb = new Pizza.Builder("Josh Crust");  

>>>>>>> master
    p = pb.pizzas(1).build();
    reportOrder();
  }

  public void bakeBaileyPizza(){
    System.println("Baking Bailey's pizza...");
    pizza = new Pizza.Builder("Deep Dish"); 
    p = pizza.pizzas(1).build();
    reportOrder();
  }

  private void reportOrder() {
      System.out.format("\nBuilt %s - num pies: %d, pepperoni: %b, onion: %b, frenchfries %b\n", 
    	p.getName(),  
      p.getNumber(),
      p.toppings.pepperoni,
      p.toppings.onion,
      p.toppings.frenchfries );
  }
}