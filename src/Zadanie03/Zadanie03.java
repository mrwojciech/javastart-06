package Zadanie03;

public class Zadanie03 {

    public static void main(String[] args) {


        for (int i = 0; i < 101; i++) {

            System.out.print("i: " + i);
            if ((i % 15 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3 == 0)) {
                System.out.println("Fizz");
            } else if ((i % 5 == 0)) {
                System.out.println("Buzz");
            }
            System.out.println();

        }


    }
}
