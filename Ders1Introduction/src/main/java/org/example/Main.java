package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ders 5
        System.out.println("Merhaba Java");

        //ders 6,7:

        String mesaj = "benim adim: ";
        String name = "Cemile";
        int age = 20;
        System.out.println(mesaj + name + age);
        System.out.println(mesaj + name + age);

        //ders 8:
        if (name == "Cemile") {
            System.out.println("Ismi dogru tahmin etdiniz!");

        } else {
            System.out.println("Ismi yalnis tahmin etdiniz!");
        }

        //ders 9:
        System.out.println("------------------------------------------");
        System.out.println("hadi 3 sayidan en buyuk rakami bulalim!");
        System.out.println("Oncelikle  1,2,3 cu rakamlari girin:");
        System.out.println("1ci rakam:");
        Scanner sc = new Scanner(System.in);
        int myNumber1 = sc.nextInt();
        System.out.println("2ci rakam:");
        sc = new Scanner(System.in);
        int myNumber2 = sc.nextInt();
        System.out.println("3cu rakam:");
        sc = new Scanner(System.in);
        int myNumber3 = sc.nextInt();

        if ((myNumber1 > myNumber2) && (myNumber1 > myNumber3)) {
            System.out.println(" 3 rakam icinde en buyuk rakam : " + myNumber1);
        } else if ((myNumber2 > myNumber3) && (myNumber2 > myNumber1)) {
            System.out.println(" 3 rakam icinde en buyuk rakam : " + myNumber2);
        } else if ((myNumber3 > myNumber1) && (myNumber3 > myNumber2)) {
            System.out.println(" 3 rakam icinde en buyuk rakam : " + myNumber3);
        } else {
            System.out.println("3 rakamda esit!");
        }


        //ders 10:
        System.out.println("-------Switch-------");
        String myName = "Jamila";
    /*
    buyuk ,kucuk yazilminin karsini toUpperCase le yapa bilirim ama kisa yaziyorum
    */
        switch (myName) {
            case "Jamila":
                System.out.println("dogru buldunuz!");
                break;
            case "Cemile":
                System.out.println("Ingilizcesini yaz!");
                break;
            default:
                System.out.println("Yalnis Isim!");

        }

        //ders 11:
        System.out.println("-------For-------");
        int numb;
        for (numb = 3; numb < 10; numb++) {
            System.out.println("bizim numb degiskenimizin degeri: " + numb);
        }


        //ders 12:
        System.out.println("-------While-------");

        int year = 2022;
        while (year < 2025) {

            System.out.println("simdiki yil: " + (year++));
        }

        //ders 13:
        System.out.println("-------Do-While-------");

        int cost = 255;
        do {

            System.out.println("suanki fiyat:" + cost);
            cost++;

        } while (cost < 259);


        //ders 14:
        System.out.println("-------Array-------");

        String fruit1 = "apple";
        String fruit2 = "banana";
        String fruit3 = "cherry";
        String[] fruits = new String[6];
        fruits[0] = "Apple";
        fruits[3] = fruit1;
        fruits[4] = fruit2;
        fruits[5] = fruit3;
        for (String element : fruits) {
            System.out.print(element + " ");
        }
        //ders 15:
        System.out.println("\n" + "-------Arrayle Calismak-------");
        Double[] numbers = {1.2, 2.5, 3.6, 7.1, 9.0};
        double total = 0;
        double max = numbers[0];
        for (Double myNumber : numbers) {
            total = total + myNumber;
            if (max < myNumber) {
                max = myNumber;
            }
        }
        System.out.println("Sum of these numbers are equal to --> " + total);
        System.out.println("Maximum number in our array is equal to --> " + max);


        //ders 16:
        System.out.println("-------Multi-Array-------");

        String[][] dersler = new String[2][2];
        dersler[0][0] = "Mathematik";
        dersler[0][1] = "Bioloji";
        dersler[1][0] = "Fizik";
        dersler[1][1] = "Kimya";


        for (int i = 0; i < dersler.length; i++) {
            for (int j = 0; j < dersler.length; j++)
                System.out.print(dersler[i][j] + " ");
            System.out.println();
        }

        //ders 17:
        System.out.println("-------String-------");

        String example="Inanmak basarmagin yarisidir  ";
        System.out.println("Stringin uzunlugu :  " + example.length());
        System.out.println("5.index : "+ example.charAt(5));
        System.out.println(example.concat("!"));
        System.out.println("Ifade I le basliyormu? : " + example.startsWith("I"));
        System.out.println("Ifade L ile bitiyormu? : " + example.endsWith("L"));
        System.out.println("ilk index: " + example.indexOf("mak"));
        System.out.println("sonuncu index:" + example.lastIndexOf("i"));

        char[] characters=new char[6];
        example.getChars(0,6, characters,0);
        System.out.println(characters);
        System.out.println("replace : "+ example.replace("mak","makk"));
        System.out.println("Substring(2) : "+ example.substring(2));
        System.out.println("Substring (2,5)"+ example.substring(2,5) );
        System.out.println("split: " );
        for (String kelime : example.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(example.toLowerCase());
        System.out.println(example.toUpperCase());
        System.out.println(example.trim());

    }
}