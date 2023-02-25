package Donguler;
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, f1 = 1, f2 = 1, f3 = 1, kombinasyon;
        System.out.print("1. Kümenin Eleman Sayısı : ");
        n = input.nextInt();
        System.out.print("2. Kümenin Eleman Sayısı : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            f1 *= i;
        }
        for (int j = 1; j <= r; j++) {
            f2 *= j;
        }
        for (int k = 1; k <= (n-r); k++) {
            f3 *= k;
        }

        kombinasyon = f1 / (f2 * f3);

        System.out.print("(" + n + "," + r + ") Kombinasyonu = " + kombinasyon);
    }
}
