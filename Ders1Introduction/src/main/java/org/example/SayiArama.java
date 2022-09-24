package org.example;

public class SayiArama {
    public static void main(String[] args) {

        int[] sayilar = new int[]{23, 15, 14, 22, 44, 7};
        int aranacak = 44;
        boolean varmi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            System.out.println("Aradığınız sayı dizide mevcuttur");
        } else {
            System.out.println("Aradığınız sayı dizide mevcut değildir");

        }

    }
}
