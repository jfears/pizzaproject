package pizzashop.menu;

import java.util.Arrays;

public class Pizza{
    int size;
    String crust;
    String [] toppings;
    /*
    acess modifiers: public, (default), protected, private
    private: only accesible within the class
    default: only accesible within the package
    protected: only accesible within the package, and subclasses outside of the package
    public: accesible anywhere
    */
    public Pizza(int size, String crust, String ...toppings){
        this.size = 2 * size;
        this.crust = crust + " crust";
        Arrays.sort(toppings);
        this.toppings = toppings;
    }

    public Pizza(){}

    public String toString(){
        return "Pizza Size: " + size + "\nPizza Crust: " + crust
            + "\nPizza Toppings " + Arrays.toString(toppings);
    }
}