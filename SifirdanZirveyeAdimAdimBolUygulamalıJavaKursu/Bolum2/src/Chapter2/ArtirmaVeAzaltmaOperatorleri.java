package Chapter2;

public class ArtirmaVeAzaltmaOperatorleri {
    public static void main(String[] args) {

        /*
            ++ ve -- operatörleri değişkende bulunan değeri 1 arttırmaya veya azaltmaya  yarar.
            Arttırma veya azaltma yapılacak değişkenin başına veya sonuna yazılabilir ve
            yazıldığı yere göre farklı davranışlar sergiler. Tabi şunu da söylemek gerekir
            ki tek başlarına kullanıldıklarında başta veya sonda olması fark yaratmaz.
            Bu operatörler bilinen toplama ve çıkarma işlemine göre doğrudan işlemci
            tarafından desteklendiği için çok daha hızlı çalışırlar.
            int sayi = 10;
            sayi++; // ++sayi da yazsaydık bir önemi olmayacaktı.
            int sonuc = ++sayi + 5 // sayı değişkenini 1 arttır ve sonra 5 ile topla
            int sonuc = 5 + sayi++ // 5 sayısı ile sayı değişkenini topla, sonra sayıyı
            bir arttır.

            int sayi1 = 10;
            int sayi2 = ++sayi1;
            int sayi3 = sayi1--;
            System.out.println("Sonuc : " + (sayi1)+(--sayi2)+(sayi3++))
         */

        int sayi1 = 10;  //10
        int sayi2 = ++sayi1; //SAYİ2=11 sayi1=11
        int sayi3 = sayi1--; //sayi3=11 sayi1=10
        System.out.println("Sonuc : " + ((sayi1) + (--sayi2) + (sayi3++)));
        //sayi1=10 --sayi2=10 sayi3++ = 11


    }
}
