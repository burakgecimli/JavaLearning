package Chapter5;

import java.util.Random;

public class MathSinifiRandomSayilar {
    public static void main(String[] args) {
        /*
        Standart java sınıflarından biridir. Matematiksel işlemleri daha kolay şekilde yapmamız için bazısabitler ve metotlar içerir.
        java.lang paketinde olduğu için bu sınıfı kullanırken import gerekmez. Aynı String gibi..
        Bunun yanısıra rastgele sayılar üretmek istiyorsak bu sınıfı kullanabiliriz.
        Math.PI : 3.14…. public static final double PI olarak tanımlanır.
        Math Sınıfına ait birkaç metot;
        Abs(x) : x değişkeninin mutlak değeri
        Ceil(x) : x değişkenini bir üst tam sayıya dönüştürür. Math.ceil(8.3) = 9 gibi.
        exp(x) : x in kuvvetlerını hesaplanmada kullanılır.
        Pow(x,y): x in y ninci kuvveti
        sqrt(x) : x in karekökü
        Max(x,y) ve Min(x,y) büyük ve küçük değer için kullanılır.
        random() : Rastgele sayıüretmek için kullanılır. 0 ile 1 arasında double değer üretir.
         */

        System.out.println(Math.PI);
        System.out.println(Math.E);


        System.out.println("-5 in mutlak değeri= " + Math.abs(-5));
        double d = 8.3;
        System.out.println(d + " sayısının üste yuvarlanmış hali= " + Math.ceil(d));

        System.out.println("2 üssü 3= " + Math.pow(2, 3));
        System.out.println("16 sayısının karekökü= " + Math.sqrt(16));

        //Random Sayı Oluşturma

        int randomSayi = (int) (Math.random() * 10); //  random() 0 ile 1 arasında double değer üretir.
        System.out.println("Random Oluşan Sayı= " + randomSayi);


    }
}
