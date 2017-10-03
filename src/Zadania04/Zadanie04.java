package Zadania04;

import java.util.Random;

public class Zadanie04 {


    public static void main(String[] args) {

        int[] tab = new int[10];
        Random random = new Random();
        double avg;
        for (int i = 0; i < 10; i++) {
            tab[i] = random.nextInt(10);
        }

        avg = srednia(tab);
        System.out.println("Srednia liczb w tablicy to:" + avg);
        int sum = showNumbersLessThanAvg(tab, avg);
        System.out.println("Suma liczb mniejszych od sredniej to: " + sum);
        int sum2 = showNumbersBiggerThanAvg(tab, avg);


    }

    private static int showNumbersBiggerThanAvg(int[] tab, double avg) {
        int sum = 0;
        for (int number : tab) {

            if (number > avg) {
                System.out.println("Znalazlem liczbę mniejszą od sredniej:" + number);
                sum += number;
            }
        }


        return sum;
    }

    private static int showNumbersLessThanAvg(int[] tab, double avg) {
        int sum = 0;

        for (int number : tab) {

            if (number < avg) {
                System.out.println("Znalazlem liczbę mniejszą od sredniej:" + number);
                sum += number;
            }
        }

        return sum;
    }

    private static double srednia(int[] tab) {
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }

        return sum / tab.length;
    }
}
