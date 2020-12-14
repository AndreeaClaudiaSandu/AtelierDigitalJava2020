package lab5.ch1;

public class Eur extends Currency {
    public Eur(){ super.setName("EUR");}
    public Eur(float value){
        super(value,"EUR");
    }
}
