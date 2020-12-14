package lab5.ch1;

public class Usd extends Currency{
    public Usd(){ super.setName("USD");}
    public Usd(float value){
        super(value, "USD");
    }
}
