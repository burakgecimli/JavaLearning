package Chapter10;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
       /*
        Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
        Ekok(s1,s2) * ebob(s1,s2) = (s1*s2); buna uygun olacak şekilde bulunuz
        */

        System.out.println("Sayı giriniz");
        Scanner input = new Scanner(System.in);
        int birinciSayi = input.nextInt();
        int ikinciSayi = input.nextInt();

        int ebob = EbobBul(birinciSayi, ikinciSayi);
        if (ebob==1){
            System.out.println("Sayılar aralarında asaldır.");
        }else
        System.out.println("Sayıların ebobu=" + ebob);

        int ekok = EkokBul(birinciSayi, ikinciSayi);
        System.out.println("Sayıların ekoku=" + ekok);

    }

    private static int EkokBul(int birinciSayi, int ikinciSayi) {
        int ekok = (birinciSayi * ikinciSayi) /EbobBul(birinciSayi, ikinciSayi);
        return ekok;
    }

    private static int EbobBul(int birinciSayi, int ikinciSayi) {
        int eb = 1;
        if (birinciSayi > ikinciSayi) {
            for (int i = 1; i <= ikinciSayi; i++) {
                if (birinciSayi % i == 0 && ikinciSayi % i == 0) {
                    if (i > eb) {
                        eb = i;
                    }
                }
            }
        } else {
            for (int i = 1; i <= birinciSayi; i++) {
                if (birinciSayi % i == 0 && ikinciSayi % i == 0) {
                    if (i > eb) {
                        eb = i;
                    }
                }
            }
        }

        return eb;
    }
}
