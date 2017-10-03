package ZadanieD03;

import java.util.Random;

public class ArrayTest {

    public static void main(String[] args) {

        ArrayComparator arrayComparator = new ArrayComparator();
        int sizea = 4, sizeb = 4;
        int[][] tab1 = new int[sizea][sizeb];
        int[][] tab2 = new int[sizea][sizeb];
        Random random = new Random();
        for (int i = 0; i < sizea; i++) {
            for (int j = 0; j < sizeb; j++) {
                tab1[i][j] = random.nextInt(10);
                tab2[i][j] = tab1[i][j];
                // tab2[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Czy tablice są równe: " + arrayComparator.compare(tab1, tab2));
    }
}
