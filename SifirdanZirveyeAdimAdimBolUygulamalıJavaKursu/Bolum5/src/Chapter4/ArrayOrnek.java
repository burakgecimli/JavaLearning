package Chapter4;

import java.util.Scanner;

public class ArrayOrnek {
    public static void main(String[] args) {
        /*
        10 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama
         */
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(i, 2);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("--------------------------");

        /*
        Kullanıcıdan hangi ayda olduğunu bilgisini alıp ilgili ay değerini yazdırın  ay adlarını bir dizide saklayın.
         */


        input = new Scanner(System.in);
        String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        while (true) {
            System.out.println("Hangi Aydaysanız değerini giriniz");
            int ay = input.nextInt();
            if (ay > aylar.length) {
                System.out.println("Hatalı değer girdiniz tekrar yeni bir değer giriniz");
                ay = input.nextInt();
                if (ay <= aylar.length) {
                    System.out.println("Girilen Ay değeri= " + (aylar[ay - 1]));
                    break;
                }
            } else {
                System.out.println("Girilen Ay değeri= " + (aylar[ay - 1]));
                break;
            }
        }
        System.out.println("---------------------------");
        System.out.println();



        /*
        Kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini
        sorun ve buna bağlı olarak aldıgınız değerleri bir dizide saklayın.
        Veri alma işlemi bittikten sonra tüm sayıları ve ortalamasını ekrana yazdırın.
         */

        System.out.println("Kaç tane sayının ortalamasının alınmasını istiyorsunuz");
        int kacTane = input.nextInt();
        double toplam = 0;
        int[] arr = new int[kacTane];
        for (int i = 0; i < kacTane; i++) {
            System.out.println("Sayı Giriniz");
            arr[i] = input.nextInt();
            toplam += arr[i];
        }
        System.out.println("Sayıların Ortalaması=" + (toplam / arr.length));

    }
}
