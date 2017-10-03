package Zadanie02;

import java.util.Scanner;

public class Zadanie03 {

    private static double number;

    public static void main(String[] args) {

        double a, b, c, result;

        System.out.println("Rozwiązuję zadanie  ax +b = c");
        System.out.println("Podaj wartość a:");
        a = getNumber();
        System.out.println("Podaj wartość b:");
        b = getNumber();
        System.out.println("Podaj wartość c:");
        c = getNumber();
        result = (c-b)/a;
        System.out.println("Wynik równania to:"+ result);
    }

    public static double getNumber() {
        double x;
        Scanner scanner = new Scanner(System.in);
        do {
            x = scanner.nextDouble();
        } while (x == 0);
        return x;
    }
}