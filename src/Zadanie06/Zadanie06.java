package Zadanie06;

public class Zadanie06 {
    public static void main(String[] args) {

/*

        Jaka	jest	najmniejsza	liczba,	która	dzieli	się	bez	reszty	przez	każdą	z	liczb
        z	przedziału
*/

        int number = 20, modulo = 1;
        boolean isNumberFound = false;
        do {

            for (modulo = 1; modulo < 21; modulo++) {
                if (number%modulo!=0) break;
            }
            if (modulo >= 20) {
               isNumberFound = true;
            }
            number++;


        } while (!isNumberFound);
               System.out.println(--number+"+"+modulo);

    }

    private static int countModulo(int number, int modulo) {
        return number % modulo;
    }
}
