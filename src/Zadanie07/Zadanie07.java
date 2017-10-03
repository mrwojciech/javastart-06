package Zadanie07;

public class Zadanie07 {

    public static void main(String[] args) {


        boolean condition = false;
        int counter = 1;
        int sum = 0;

        do {
            counter++;

            if (checkIfSumOfPowerOfFiveMakeThisNumber(counter)) {
                sum += counter;
            }
            // if number is found make it true
            if (counter > 1000000)  condition = true;
                   }
        while (!condition);
        System.out.println("Suma :"+sum);
    }

    private static boolean checkIfSumOfPowerOfFiveMakeThisNumber(int number) {

        int tempNumber = number;
        int sum=0;
        int tempNum=0;
        while (tempNumber>0){
            tempNum = (tempNumber%10);
            sum = (int) (sum + Math.pow(tempNum,5));
            tempNumber = (int)tempNumber/10;
        }
        return (sum == number);
    }
}
