package Lab1;


public class Challenge2 {
    static String compute(int x){
        int returnare=0;
        String a="";
        String trei="Foo";
        String cinci="Bar";
        String sapte="Qix";
        String zero="*";
        int oglinditul=0;
        int cifra;
        if(x%3==0) {
            a = a + trei;
            returnare = 1;
        }
        if(x%5==0) {
            a = a + cinci;
            returnare=1;
        }
        if(x%7==0) {
            a = a + sapte;
            returnare = 1;
        }
        while(x!=0){
            oglinditul=oglinditul*10+x%10;
            x=x/10;
        }
        while(oglinditul>0){
            cifra=oglinditul%10;
            if(cifra==0)
                a=a+zero;
            if(cifra==3) {
                a = a + trei;
                returnare = 1;
            }
            if(cifra==5) {
                a = a + cinci;
                returnare = 1;
            }
            if(cifra==7) {
                a = a + sapte;
                returnare = 1;
            }
            oglinditul/=10;
        }
        if(returnare==1)
            return a;
        else{
            a="";
            return a;
        }
    }
    public static void main (String[] args) {
        int a=105;
        if(compute(a)!="")
            System.out.println(compute(a));
        else {
            int oglinditul=0;
            while(a!=0){
                oglinditul=oglinditul*10+a%10;
                a=a/10;
            }
            while (oglinditul>0) {
                if((oglinditul%10)!=0)
                    System.out.print(oglinditul%10);
                else
                    System.out.print("*");
                oglinditul=oglinditul/10;
            }
        }
    }
}
