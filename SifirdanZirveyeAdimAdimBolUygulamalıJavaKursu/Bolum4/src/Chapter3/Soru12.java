package Chapter3;

import java.util.Scanner;

public class Soru12 {
    /*
     SORU 12:
        Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0a bastığında girdiği sayıların
        çarpımını sonuç olarak gösteren programı yazınız.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int carp = 1;
        while (true) {
            System.out.println("Sayı giriniz(Çıkış için 0 basınız)");
            int sayi = input.nextInt();
            if (sayi == 0) {
                break;
            }
            carp = carp * sayi;
        }
        System.out.println(carp);

    }
}
