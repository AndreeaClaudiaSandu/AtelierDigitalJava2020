package Lab1;

public class Challenge3 {
    public static void main (String[] args) {
        int[] numere = {5,9,-5,7,-5};
        int[] folosire;
        int nr=0;
        folosire= new int[numere.length];
        for (int i = 0; i < numere.length-1; i++) {
            for(int j=i+1;j< numere.length;j++){
                if(numere[i]+numere[j]==0){
                    if(folosire[i]==0 && folosire[j]==0){
                        nr++;
                        folosire[i]=1;
                        folosire[j]=1;
                    }
                }
            }
        }
        System.out.println(nr);
    }
}
