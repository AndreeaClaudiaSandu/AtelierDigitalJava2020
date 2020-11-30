package lab3.decorator;

public class Milk extends Topping{
    public Milk( Beverage wrappedBeverage) {
        super("milk", 6, wrappedBeverage);
    }
}
