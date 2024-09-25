package org.example;


public class Main {

    /**
     * La méthode statique main de la classe main est le point d'entrée réel de notre programme.
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 1 - Écris une fonction sumOfEvenNumbers(numbers) qui prend en entrée un tableau d'entiers numbers et
         * retourne la somme de tous les nombres pairs présents dans le tableau.
         * const numbers = [1, 2, 3, 4, 5, 6];
         */
        // your code here
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(sumOfEvenNumbers(numbers));

        /**
         * 2 - Écris une fonction maxNumber(numbers) qui prend en entrée un tableau d'entiers numbers et
         * retourne le plus grand nombre présent dans le tableau.
         * const numbers2 = [12, 21, 67, 36, 49, 51];
         */
        int[] numbers2 = new int[]{12, 21, 67, 36, 49, 51};

        System.out.println(maxNumber(numbers2));

    }

    public static int sumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for(int number: numbers) {
            sum += number % 2 == 0 ? number : 0;
        }
        return sum;
    }

    public static int maxNumber(int[] numbers) {
        int max = - Integer.MAX_VALUE;
        for(int number: numbers) {
            max = Math.max(number, max);
        }
        return max;
    }


}