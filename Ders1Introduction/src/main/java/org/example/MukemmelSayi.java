package org.example;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number = 8;
        boolean check = false;
        int sum = 0;
        if (number == 1) {
            System.out.println("1 her zaman mukemmel sayidir");
        } else if (number < 1) {
            System.out.println("Pozitiv sayi giriniz!");
        } else {
            for (int i = 1; i < number; i++) {
                if ((number % i) == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                check = true;
                System.out.println("Mukemmel Sayi");
            } else {
                System.out.println("Mukemmel Sayi degildir");
            }
        }
    }
}

