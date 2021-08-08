package Chapter3;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /*
        Soru 11:
        Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin
        etmeye çalışsın. Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden
        sonra bulduğunu belirtelim.
         */

        int randSayi = (int) (Math.random() * 100);
        int sayac = 0;

        System.out.println("Sayıyı tahmin ediniz.");
        int tahminSayi = input.nextInt();

        while (true) {
            if (randSayi == tahminSayi) {
                sayac++;

                break;
            } else if (randSayi > tahminSayi) {
                System.out.println("Sayıyı arttırın");
                sayac++;
                tahminSayi = input.nextInt();
            } else if (randSayi < tahminSayi) {
                System.out.println("Sayıyı azaltın");
                sayac++;
                tahminSayi = input.nextInt();
            }

        }

        System.out.println("Sayıyı " + sayac + " denemede buldunuz");



    }
}
