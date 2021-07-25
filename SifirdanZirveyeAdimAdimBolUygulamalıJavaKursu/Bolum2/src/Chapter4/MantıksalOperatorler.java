package Chapter4;

public class MantıksalOperatorler {

    public static void main(String[] args) {
        /*
        Javada 6 adet ilişkisel operatör bulunmaktadır, bunların en temel amacı
        değişkenleri karşılaştırmaktır.
        Bu karşılaştırmanın sonucunda da true veya false sonuç verirler.
        int s1=10, s2=20;
        s1 == s2 // s1 ve s2 yi karşılaştırır, eşitse true eşit değilse false döndürür
        s1 < s2 // s1 ve s2 yi karşılaştırır, eğer s1 s2den küçükse true döndürür.
        s1 > s2 // s1 ve s2 yi karşılaştırır, eğer s1 s2den büyükse true döndürür.
        s1 <= s2 // s1 ve s2 yi karşılaştırır, eğer s1 s2den küçük veya eşitse true
        döndürür.
        s1 >= s2 // s1 ve s2 yi karşılaştırır, eğer s1 s2den büyük veya eşitse true
        döndürür.
        s1 != s2 // s1 ve s2 yi karşılaştırır, eğer s1 s2ye eşit değilse true döndürür



        Geriye döndürülen true veya false değerleri ile programımızı kontrol etmek,
        akışına yön vermek için if anahtar sözcüğü ile koşullar yazılabilir.
        System.out.println("s1 ve s2 eşittir");
        //detayları sonraki bölümlerde işlenecektir.

        if(s1 == s2){
            System.out.println("s1 ve s2 eşittir");
            //detayları sonraki bölümlerde işlenecektir.
        }


         */


        int number1 = 10;
        int number2 = 20;

        System.out.println(number1 == number2);
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 != number2);

        /*
        Matematikte kullandığımız ve, veya, değil ifadelerinin javadaki
        karşılıklarıdır.
        Bu operatörler de sonuc olarak true veya false değerini döndürür.
        && ve => true olması için iki değişkenin değerinin de true olması gerekir.
        Diğer durumlarda false değer döndürür.
        || veya => false olması için iki değişkenin değerinin de false olması gerekir.
        Diğer durumlarda true değer döndürür.
        ! değil => önündeki ifadenin tersini verir.
        boolean deger1 = true;
        boolean deger2 = false;
        deger1 && deger2 => false;
        deger1 || deger2 => true;
        !deger1 => false;
        !deger2 => true;
         */

        System.out.println("-------------------");
        boolean d1 = true;
        boolean d2 = false;

        System.out.println(d1 && d2);
        System.out.println(d1 || d2);


    }
}
