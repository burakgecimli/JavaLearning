package Chapter1;

import java.sql.Array;
import java.util.Scanner;

public class MethodsOrnek {
    public static void main(String[] args) {


        for (; ; ) {     // Sonsuz döngü oluşturuldu kullanıcı 0 bastığında döngüden çıkılacak.
            int getSecim = menuGoster(); // burada menuGoster metoduna gidilir.menuGoster metodundan gelen "secim" değerini "getSecim" değerine atadık.
            if (getSecim == 0) {
                System.out.println("Programdan Çıkıldı");
                break;    // "secim" değeri 0 olduğunda döngüden çıkılacak.
            } else {
                if (getSecim > 3) {
                    System.out.println("Hatalı İşlem Değeri Girdiniz");
                    break;

                } else {
                    int[] numbers = sayiAl();//"secim" değeri 0 değilse devam edilecek.
                    // Burada "sayiAl" metoduna gidilir ve bize iki sayı tutan array gönderilir.Bizde gelen bu arrayi "[]numbers" dizisinde saklıyoruz.
                    switch (getSecim) { //Burda ise kullanıcının seçimine göre ilgili işlemler yapılır.
                        case 1:
                            System.out.println("Sonuç=" + (numbers[0] * numbers[1]));
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Sonuç=" + (numbers[0] + numbers[1]));
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Sonuç= " + Math.pow(numbers[0], numbers[1]));
                            System.out.println();
                            break;
                    }
                }


            }
        }

    }

    public static int menuGoster() {
        System.out.println("------- MENU -------");
        System.out.println("İki Sayının Çarpımını Bul: 1");
        System.out.println("İki Sayının Toplamını Bul: 2");
        System.out.println("İki Sayının Kuvvetini Bul: 3");
        System.out.println("Çıkmak İçin: 0");
        System.out.println("------------------");
        System.out.println("İşlem Seçiniz:");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        return secim;
    }

    public static int[] sayiAl() {
        System.out.println("Birinci Sayıyı Bulunuz");
        Scanner input = new Scanner(System.in);
        int birinciSayi = input.nextInt();
        System.out.println("İkinci Sayıyı Bulunuz");
        int ikinciSayi = input.nextInt();
        return new int[]{birinciSayi, ikinciSayi};


    }

}
