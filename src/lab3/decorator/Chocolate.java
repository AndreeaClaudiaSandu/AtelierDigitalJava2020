package lab3.decorator;

public class Chocolate extends Topping{
    public Chocolate( Beverage wrappedBeverage) {
        super("chocolate", 6, wrappedBeverage);
    }
}

