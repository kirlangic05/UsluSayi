package Donguler;

import java.util.Scanner;

public class DortKatlariniTopla {
    public static void main(String[] args) {
        int toplam = 0;
        double a;
        Scanner inp = new Scanner(System.in);

       do {
           System.out.print("Sayı Giriniz : ");
           a = inp.nextDouble();
           if (a % 2 == 0) {
               if (a%4==0){
                   toplam += a;
               }
           }else
               System.out.println("Lütfen tek sayı girişi yapmayınız.");

       }
        while ((a % 2 == 0));
        System.out.println("Toplam : " +toplam);



    }
}
