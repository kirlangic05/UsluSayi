package KosulluIfadeler;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year, b = 4, c = 400;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı giriniz : ");
        year = input.nextInt();

        if ((year % b == 0) || (year % c == 0)) {
            System.out.print(year + " bir artık yıldır !");
        } else System.out.println(year + " bir artık yıl değildir !");
    }
}
