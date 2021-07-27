package Chapter6;

import java.util.Scanner;

public class OdevCozumleri2 {
    public static void main(String[] args) {
                  /*
        Küçük bir piyango oyunu tasarlayınız. Sistem iki basamaklı bir sayı üretmeli.
        Kullanıcıdan da bu sayıyı tahmin etmesini istemelisiniz.
        Eğer kullanıcı sayıyı tam olarak doğru bilirse 10000 TL;
        Eğer kullanıcı sayının basamaklarını bilirse yani 65 yerine 56 yazmıssa 5000TL
        Eğer kullanıcı şanslı numaranın sadece bir basamağını bilirse 1000 TL kazanır.
        */


        int randSayi = 10 + (int) (Math.random() * 89); // İki basamaklı sayı üretildi.
        System.out.println("Sistem tarafından üretilen sayı= " + randSayi);

        System.out.println("Sayıyı Tahmin Ediniz");
        Scanner input = new Scanner(System.in); // Kullanıcıdan tahmin sayısı istendi
        int tahminSayi = input.nextInt();


        int randSayiOnlar = randSayi / 10;
        int randSayiBirler = randSayi % 10;

        int tahminSayiOnlar = tahminSayi / 10;
        int tahminSayiBirler = tahminSayi % 10;


        int gecici = randSayiBirler; //Swap işlemi sayının basamaklarının yerini değiştiriyor. örn: 65 sayısını 56 ya çeviriyor.
        randSayiBirler = randSayiOnlar;
        randSayiOnlar = gecici;

        int yeniSayi = randSayiOnlar * 10 + randSayiBirler; // basamakları yerleri değiştirilen yeni sayı
        // System.out.println(yeniSayi);


        if (tahminSayi == randSayi) {
            System.out.println("Tebrikler 10000 TL kazandınız.");
        } else if (tahminSayi == yeniSayi) {
            System.out.println("Tebrikler 5000 TL kazandınız.");
        } else if (tahminSayiOnlar == randSayiOnlar || tahminSayiOnlar == randSayiBirler || tahminSayiBirler == randSayiBirler || tahminSayiBirler == randSayiOnlar) {
            System.out.println("Tebrikler 1000 TL kazandınız.");
        } else
            System.out.println("Maalesef kazanamadınız.");

        System.out.println("Sistem tarafından üretilen sayı= " + randSayi);
        System.out.println("Sizin Tahmininiz= " + tahminSayi);


    }
}
