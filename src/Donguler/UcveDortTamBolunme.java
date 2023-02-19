package Donguler;

import java.util.Scanner;

public class UcveDortTamBolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        int toplam = 0, sayac = 0;

        System.out.print("Sayıyı giriniz : ");
        b = input.nextInt();

        for (a = 0; a <= b; a++) {
            if (a % 12 == 0) {
                sayac += 1;
                toplam += a;
            }
        }
        double ort = (toplam / sayac);
        System.out.println(ort);
    }
}
