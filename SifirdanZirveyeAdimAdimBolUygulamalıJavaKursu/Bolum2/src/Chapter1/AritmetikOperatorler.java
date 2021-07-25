package Chapter1;

public class AritmetikOperatorler {

    public static void main(String[] args) {

	/*
	    Matematiksel işlemleri yaparken kullandığımız + - * / ve % ifadelerinin  javadaki versiyonlarıdır.
        Burada % operatörü mod alma işlemine yaramaktadır.
        int sonuc = 5 % 2; 5 sayısının 2 sayısı ile modunu hesaplar. Sonuc = 1
        Diğer operatörler matematikte bildiğiniz işlemler için kullanılır.
	 */

        /*

        ÖDEV:
        sayi1 ve sayi2 diye iki integer değişken oluşturun ve bunlara sırasıyla 60 ve
        40 değerlerini atayın. Bu değişkenleri yukarıda bahsettiğimiz operatörler ile
        işleme sokup sonuçlarını ekrana yazdırın.
         */


        int sayi1 = 60, sayi2 = 40;
        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);
        System.out.println(sayi1 * sayi2);
        System.out.println((double) sayi1 / sayi2);
        System.out.println(sayi1 % sayi2);


    }
}
