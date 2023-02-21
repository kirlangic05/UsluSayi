package Donguler;

import java.util.Scanner;

public class DortveBesinKatlariIki {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 1, m = 1, a;

        System.out.print("Sınır değerini giriniz : ");
        a = scan.nextInt();

        while (n <= a) {
            n *= 4;
            System.out.println("4'ün katları : " + n);
        }

        System.out.println("_____________");

        while (m <= a) {
            m *= 5;
            System.out.println("5'in katları : " + m);
        }
    }
}
