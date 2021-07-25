package Chapter6;

public class OdevCozumu {
    public static void main(String[] args) {
        /*
        Ödev 1
        Bir integer değişken oluşturun ve bu değişkende saniye değerini tutun.
        Sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın
        Örnek 1200 değeri için 20 dakika 0 saniye yazmalıdır.
         */

        int saniye = 546;
        int saat = saniye / 3600;
        int dakika = (saniye / 60) % 60;
        int kalanSaniye = saniye % 60;
        System.out.println(saniye + " saniye=" + saat + " saat " + dakika + " dakika " + kalanSaniye + " saniye  dir");
        System.out.println("--------------------");


        /*
        Ödev 2
        Bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı saklayın.
        Sonrasında bu değerin kaç Celcius olduğunu hesaplayın.
        100 değeri için 37.777778 gibi bir değer elde etmelisiniz.
        Hesaplama formülü : celcius = 5/9 * (fahrenheit -32)
         */

        double fahrenHeit = 100;
        double celcius;
        celcius = (5 / 9.0) * (fahrenHeit - 32);
        System.out.println(celcius);

        /*
        Ödev 3
        Bir yıl değerinin artık yıl olup olmadığını hesaplayın
        Bir yılın artık olması için ya 400 ile modu 0 olmalı yada 4 ile modu 0 olmalı
        ve 100 ile modu 0 olmamalı
        4100 false değer vermeli.
         */

        int yil = 4100;

        System.out.println(((yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0)));

    }
}
