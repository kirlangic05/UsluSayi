package Donguler;

import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.print("Sınır sayısını giriniz : ");
        a = inp.nextInt();
        for (int n = 1; n <= a; n *= 4) {
            System.out.println("4'ün katları : "+n);
        }
        System.out.println("------------");
        for (int m = 1; m <= a; m *= 5){
            System.out.println("5'in katları : "+m);
        }
    }
}
