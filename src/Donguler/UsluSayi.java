package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, n;
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        a = inp.nextInt();
        System.out.print("Kaç üs olacağını girin : ");
        n = inp.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= a;
        }
        System.out.println("Sonuç : " + total);


    }
}
