package org.example;

public class sesliHarf {
    public static void main(String[] args) {

        char harf = 'A';

        switch (harf){
            case 'A':
            case 'I':
            case 'o':
            case 'u':
                System.out.println("kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");

        }

    }
}
