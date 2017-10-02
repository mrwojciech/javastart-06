package ZadanieD01;

import java.util.Random;

public class ZadanieD01 {

    public static void main(String[] args) {

        int[] tab = new int[10];

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            tab[i] = random.nextInt(10);
        }

        for(int i =-10;i<10;i++){
            if (i<0) {
                System.out.print(tab[10 - Math.abs(i)]+", ");
            }
            if (i>=0) {
                System.out.print(tab[9-i]+", ");
            }
        }
    }
}
