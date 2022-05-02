package com.company;

public class Task3 {
    public static void main(String[] args) {
        int array[] = new int [5];
        int array1[] = new int [5];
        int array2[] = new int [5];

        double a = 0, b = 0, c = 0;
        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
        System.out.println("Перший массив:");
        for(int i = 0; i < 5; i++){
            array[i] = (int) Math.round(Math.random() * 5);
            a = a + array[i];
            System.out.println(array[i] + "");
        }
        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");

        System.out.println("");

        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
        System.out.println("Другий массив:");
        for(int j = 0; j < 5; j++) {
            array1[j] = (int) Math.round(Math.random() * 5);
            b = b + array1[j];
            System.out.println("" + array1[j] + "");
        }
        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");

        System.out.println("");

        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
        System.out.println("Третій массив:");
        for(int k = 0; k < 5; k++) {
            array2[k] = (int) Math.round(Math.random() * 5);
            c = c + array2[k];
            System.out.println(array2[k] + "");
        }

        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");

        System.out.println("");

        System.out.println("Cереднє арифметичне першого масиву: " + a/5);
        System.out.println("Cереднє арифметичне другого масиву: " + b/5);
        System.out.println("Cереднє арифметичне третього масиву: " + c/5);

        System.out.println("");

        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
        System.out.println("Найбільше значення: ");
        double f = Math.max(a/5, b/5);
        System.out.println(Math.max(f, c/5 ));
        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
    }
}
