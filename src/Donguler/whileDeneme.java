package Donguler;

import java.util.Scanner;

public class whileDeneme {
    public static void main(String[] args) {

        String userName, password;
        boolean hata = false;

        Scanner inp = new Scanner(System.in);

        while (!hata) {
            System.out.print("kullanıcı adı giriniz : ");
            userName = inp.nextLine();
            System.out.print("şifre giriniz : ");
            password = inp.nextLine();

            if ((userName.equals("furkan")) && (password.equals("melih"))) {
                System.out.println("giriş başarılı");
                hata = true;
            } else {
                System.out.println("Giriş bilgileriniz hatalı tekrar deneyin !");

            }

        }


    }
}
