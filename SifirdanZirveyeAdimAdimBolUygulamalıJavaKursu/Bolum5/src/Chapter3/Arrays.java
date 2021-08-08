package Chapter3;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*
        İçerisinde belli sayıda ve aynı türde veri olan yapılara dizi denir.
        Siz eğer 10 tane integer değeri bir arada tutmak istiyorsanız 10
        farklı değişken tanımlamak yerine bir dizi oluşturup kullanabilirsiniz.
        Dizilerde primitive veya referans tip veri türlerini barındırabilir.
        Tek şart bir dizi aynı türde elemanları içermelidir.
        Dizi türündeki referanslar dizi nesnelerine bağlanır. (Nesne ?).
        Dizi referans değerleri stack yapısında, dizi nesneleri ise heap alanında tutulur.

        Aşağıdaki dizi tanımlamalarının hepsi doğrudur.

        double[] a = new double[10] --> 10 tane double değer tutacak dizi
        int []b = new int[10] --> 10 tane integer değer tutacak dizi
        float c[] = new float[10] --> 10 tane double değer tutacak dizi

        Bu diziler oluşturulduğunda heap alanında 10 adet değer saklayacak
        bir alan olusturulur ve bu alana da veri tiplerinin varsayılan  değerleri atanır.

        Bir diziyi tanımladıktan sonra veri atamak için
        int []b = new int[10];
        b[0] = 5 --> dizinin 0. indeksine 5 değeri atandı

        Dizide index değerleri 0'dan başlar. O yüzden maksimum index değeri
        dizinin eleman sayısının 1 eksiği kadardır. Bu sınırı aştığınızda
        ArrayIndexBoundException hatası alırsınız.

        Ayrıca double[] veriler = {3,4, 5,1, 2,3} şeklinde de diziyi oluşturabilirsnz.
        double[] myList;
        myList = {1.9, 2.9, 3.4, 3.5}; //bu ifade hata verir

        Dizideki elemanları gezmek ve kullanmak için genellikle for döngüsü  kullanılır
        10 elemanlı integer bir dizideki tüm elemanları yazdırırsak;
        for(int i=0; i<dizi.length ; i++){
        System.out.println(i+". indeksteki eleman:" + dizi[i]);
        }
        Dizi bir kere tanımlanır, sonrasında dizideki elemanları
        değiştirebilirsiniz ancak tutacağı eleman sayısını değiştiremezsiniz.
        int sayilar[] = new int[10];--> 10 elemanlı integer bir dizi  oluşturulur.
        sayilar = new int[15]; --> eski sayilar dizisi silinip yenisi
        oluşturulur. Burada dizinin genişleyebildiğini düşünmeyin, tamamen
        yeni bir dizi oluştu...

        Veriler Nasıl Tutulur?
        Tanımladğımız değişkenler, nesneler, diziler aşağıdaki yapılarda tutulur.
        Yığın (Stack) :Bellekte yani Ram'de bulunur. Oldukça hızlı çalışan,
        doğrudan işlemciden donanım desteğine sahip olan alandır. Java
        derleyicisi program oluşturulmadan önce buraya konulacak verileri ve  büyüklüklerini bilmelidir.
        İlkel veri tipleri o yüzden burada tutulur. Çünkü hepsinin bellekte tutacağı alan sabit ve bellidir.
        Ama dizi veya nesnelerin ne kadar  yer tutacağı belli olmadığı için burada sadece referansları yer  alır.
        Bu referansların değerleri ise heap alanında bulunan gerçek değerin adres bilgisidir.
        Heap : Derleyici buradaki değerlerin ne kadar bellek ihtiyacı olduğunu bilmek zorunda değildir.
        Biz ne zaman new deyip yeni bir dizi veya nesne oluşturmak istersek bu alanda bize yer verilir.
        Diziler veya nesnelerin gerçek değerleri burada saklanır. Bu özgürlüklerin bize maaliyeti ise yığına göre daha yavaş olmasıdır.

         */


        int[] arr = new int[5];
        System.out.println("Dizi değerlerini doldurunuz");
        for (int i = 0; i < arr.length; i++) {
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int []array3=new int[5]; // dizi tanımlama 1

        int[]array2={1,2,3,4,5}; // dizi tanımlama 2




    }
}
