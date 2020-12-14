package lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Running r1= new Running("red",35);
        Running r2= new Running("red",35);
        Boot boot= new Boot("red",35);
        Pair<Running> pair=null;
        try {
            pair = new Pair(r1, boot);
        }catch(ShoesDontMatch e1){
            try {
                pair = new Pair(r1, r2);
            }catch(ShoesDontMatch e2){
                System.out.println("don't match");
            }
        }
        //Pair<Running> pair2= new Pair<>(r1,boot);
        //new Pair(r1 ,boot);
    }
}
