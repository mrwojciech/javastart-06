package ZadanieD02;

import java.util.Random;
import java.util.Scanner;

public class MultiArray {

    int n;
    int m;
    int[][] tab = new int[n][m];
    int bound = 100;


    public MultiArray(int N, int M) {

        this.tab = new int[N][M];

        Random random = new Random();

        for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
                tab[n][m] = random.nextInt(bound);
            }
        }
    }


    public void print() {

        for (int n = 0; n < tab.length; n++) {
            for (int m = 0; m < tab[n].length; m++) {
                System.out.print(tab[n][m] + ", ");
            }
            System.out.println();
        }
    }

    public void findMax() {

        int max = 0;

        for (int n = 0; n < tab.length; n++) {
            for (int m = 0; m < tab[n].length; m++) {
                if (tab[n][m] > max) {
                    max = tab[n][m];

                }
            }
        }
        System.out.println("Wartość minimalna to: " + max);
    }


    public void findMin() {

        int min = bound;

        for (int n = 0; n < tab.length; n++) {
            for (int m = 0; m < tab[n].length; m++) {
                if (tab[n][m] < min) {
                    min = tab[n][m];

                }
            }
        }
        System.out.println("Wartość minimalna to: " + min);
    }

    public void randomize() {

        Random random = new Random();

        for (int n = 0; n < tab.length; n++) {
            for (int m = 0; m < tab[n].length; m++) {
                tab[n][m] = random.nextInt(bound);
            }
        }
    }
}