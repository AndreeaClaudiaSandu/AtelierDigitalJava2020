package lab3.delegation;

public class Employee {
    private String name;
    public void work(){
        System.out.println("working");
    }
    public void calculatePay(PayCalcullator p){
        System.out.println("Rest to pay: "+ p.calculate("manager"));
    }
}
