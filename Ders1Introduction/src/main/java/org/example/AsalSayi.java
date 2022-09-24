package org.example;

public class AsalSayi {
    public static void main(String[] args) {

        int number = 124;
        int reminder = number % 2;
        //System.out.println(reminder);
        boolean isPrime = true;

        if (number==1){
            System.out.println("sayı asal değildir");
            return;
        }
        if (number<1){
            System.out.println("geçersiz sayı girdiniz");
        }

        for (int i=2; i<number;i++){
            if (number % i == 0){
                isPrime = false;

            }
        }
        if (isPrime){
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal değildir");
        }
    }

}
