package pizzashop;

import pizzashop.menu.Pizza;

public class App {
    public static void main(String[] args) {
        int size = 12;
        String crust = "Thin";
        

        Pizza cheesePizza; //only in stack
        cheesePizza = new Pizza(size, crust, "Cheese", "Tomato Sauce"); //now in heap
        Pizza pepperioniPizza = new Pizza(size, crust, "Cheese", "Tomato Sauce", "Pepperioni");
        System.out.println(cheesePizza.toString());
        System.out.println(pepperioniPizza.toString());
    }
}