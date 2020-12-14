package lab5.ch1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exchange");
        ExchangeDesk exchangeDesk= new ExchangeDesk();
        Ron ronValue= new Ron(20);
        Eur eurValue =new Eur(5);
        Usd usdValue= new Usd(6);

        Eur newRonValue= exchangeDesk.exchange(ronValue, Eur.class, (float)(1/4.8));
        System.out.println("Exchange result = "+newRonValue.getValue());

        Eur newEurValue= exchangeDesk.exchange(usdValue, Eur.class, (float)(1/1.3));
        System.out.println("Exchange result = "+newEurValue.getValue());
    }

}
