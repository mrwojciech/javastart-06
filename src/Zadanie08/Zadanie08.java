package Zadanie08;

import java.util.Scanner;

public class Zadanie08 {


    public static void main(String[] args) {

        int rowNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe wierszy");
        rowNumber = scanner.nextInt();
        int wideOfTheRow = rowNumber;

        for (int presentRow = 1; presentRow < rowNumber + 1; presentRow++) {
            int starNumberPerRow = presentRow * 2 - 1;
            int spaceNumberBefore = (wideOfTheRow - starNumberPerRow) / 2;

            for (int positionNumber = 1; positionNumber < wideOfTheRow + 1; positionNumber++) {

                if ((positionNumber > spaceNumberBefore) && (positionNumber < spaceNumberBefore + starNumberPerRow)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");

            }

            System.out.println();
        }

    }


}
