package Zadanie01;

import java.util.Scanner;

public class Zadanie01 {

    public static void main(String[] args) {

        int x = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (x * x < 100) {
            x++;
            System.out.println("Podaj x: ");
            x = scanner.nextInt();
        sum+=x;
        }
        sum = sum%2;
        System.out.println("Kwadrat: "+x+" jest większy od sto");
        System.out.println("Reszta z dzielenia przez 2 sumy wpisanych liczb = "+sum);
    }
}
