package Lab1;

public class Challenge4 {
    public static void main (String[] args) {
        int[] numere = {-1,-1,-1,2};
        int[] folosire;
        int nr = 0;
        folosire = new int[numere.length];
        for (int i = 0; i < numere.length - 2; i++) {
            for (int j = i + 1; j < numere.length-1; j++) {
                for(int k= j+1; k<numere.length;k++) {
                    if (numere[i] + numere[j] +numere[k] == 0) {
                        if (folosire[i] == 0 & folosire[j] == 0 & folosire[k]==0) {
                            nr++;
                            folosire[i] = 1;
                            folosire[j] = 1;
                            folosire[k] =1;
                        }
                    }
                }
            }
        }
        System.out.println(nr);
    }
}
