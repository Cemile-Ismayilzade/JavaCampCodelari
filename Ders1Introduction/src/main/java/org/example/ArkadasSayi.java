package org.example;

public class ArkadasSayi {
    public static void main(String[] args) {

        //220-284
        int sayi1 = 240;
        int toplam1= 0;
        int sayi2 = 284;
        int toplam2 = 0;

        for (int i=1; i<sayi1; i++){
            if (sayi1 % i == 0){
                toplam1 += i;
            }
        }
        for (int j=1; j<sayi2; j++){
            if (sayi2 % j==0){
                toplam2 += j;
            }
        }
        if (toplam1 == sayi2 && toplam2 == sayi1){
            System.out.println("sayılar arkadaş sayıdır");
        }else {
            System.out.println("sayılr arkadaş sayı değildir");
        }


    }
}
