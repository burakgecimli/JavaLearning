package Chapter4;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
     /*
        Kullanıcıdan aldığınız integer değere kadar olan tüm asal sayıları yazdıran programı yazınız.
           10 için ekranda 2,3,5,7 değerleri olmalıdır.
      */

        boolean asalMi;
        System.out.println("Sayı Giriniz");
        Scanner tara = new Scanner(System.in);
        int girilenSayi = tara.nextInt();
        for (int i = 2; i <= girilenSayi; i++) {
             asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi)
                System.out.print(i + ",");
        }


    }
}
