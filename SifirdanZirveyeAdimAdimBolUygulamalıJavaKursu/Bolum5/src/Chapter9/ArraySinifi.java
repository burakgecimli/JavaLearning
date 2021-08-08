package Chapter9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySinifi {
    public static void main(String[] args) {
        /*
        Arrays.sort(dizi); // tüm diziyi sıralar
        Arrays.parallelSort(dizi) // tüm diziyi daha etkili bir şekilde sıralar. Eğer bilgisayarınızda birden fazla işlemci varsa tercih edilebilir.
        Arrays.binarySearch(dizi, aranilacakEleman); eleman bulunursa indexini döndürür. Eleman yoksa negatif bir değer döndürür.
        Arrays.equals(dizi1, dizi2); //elemanları aynı ise true değilse false
        Arrays.fill(dizi1, 14);//tüm elemanlarına 14 yazar.
        Arrays.fill(dizi1, 0, 2, 10)// 0,1 ve 2. indexe 10 sayısını yazar.
        Elemanların yer değiştirilmesi Collections.shuffle() ile yapılacaktır. Collections bölümünde anlatılacak.
         */
        int[] numbers = {10, 34, 2, 56, 43, 8, 76, 61, 90};
        int[] sayilar = {11, 34, 56, 32};

        diziYazdir(numbers);
        System.out.println("----Sorted--------");
        Arrays.sort(numbers);
        diziYazdir(numbers);
        System.out.println("----Sorted--------");
        Arrays.parallelSort(numbers); //Bu daha hızlı çalışır.
        diziYazdir(numbers);

        System.out.println("--------------");


        int sonuc = Arrays.binarySearch(numbers, 10); //Sıralanmış dizinin indexini döndürür. 2 için ->0   8 için ->1  10 için->2

        System.out.println("Sonuç=" + sonuc);
        System.out.println("------------");

        System.out.println(Arrays.equals(numbers,sayilar));
        System.out.println("--------------------");
        Arrays.fill(sayilar, 14);
        diziYazdir(sayilar);

    }

    private static void diziYazdir(int[] arr) {
        for (int in : arr) {
            System.out.println(in);
        }
    }
}
