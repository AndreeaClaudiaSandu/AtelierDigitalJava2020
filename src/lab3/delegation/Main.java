package lab3.delegation;

public class Main {
    public static void main(String[] args) {
        Employee e= new Employee();
        PayCalcullator p = new PayCalcullator();
        e.calculatePay(p);
    }

}
