package Lab1;


public class Challenge2 {
    static String compute(int x){
        String a="";
        String trei="Foo";
        String cinci="Bar";
        String sapte="Qix";
        int cifra;
        if(x%3==0)
            a=a+trei;
        if(x%5==0)
            a=a+cinci;
        if(x%7==0)
            a=a+sapte;
        while(x>0){
            cifra=x%10;
            if(cifra==3)
                a=a+trei;
            if(cifra==5)
                a=a+cinci;
            if(cifra==7)
                a=a+sapte;
            x=x/10;
        }
        return a;
    }
    public static void main (String[] args) {
        int a=53;
        if(compute(a)!="")
            System.out.println(compute(a));
        else
            System.out.println(a);
    }
}
