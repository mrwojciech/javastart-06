package Zadanie05;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie05 {

    public static void main(String[] args) {

        System.out.println("Podaj dlugosc tablicy:");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int[] tab = new int[lenght];
        int number = 0;
        int index = 0;
        for (index = 0; index < lenght; index++) {
            System.out.println("Podaj element tablicy " + index + ": ");
            number = scanner.nextInt();
            tab[index] = number;
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Czy liczba utworzona z wszystkich liczb w tablicy jest palindromem: " + isPolindrome(tab, index));
    }

    private static boolean isPolindrome(int[] tab, int index) {

        int lenght = index - 1;
        for (int i = 0; i < lenght; i++) {

            if (tab[i] != tab[lenght - i]) {
                return false;
            }
        }


        return true;
    }
}
