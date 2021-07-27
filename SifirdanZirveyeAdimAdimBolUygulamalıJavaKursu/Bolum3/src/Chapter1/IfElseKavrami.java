package Chapter1;

public class IfElseKavrami {

    public static void main(String[] args) {
        // write your code here


        /*
        Genel Tanım
        Programın akışını yönlendiren yapılardır. Aksi belirtilmezse uygulama ilk
        ifadeden son ifadeye doğru çalışır. Programlama dillerinde bu akışları
        değiştiren veya bir ifadenin kaç kere çalışacağını belirleyen bazı komutlar bulunur.

        Bunları sıralarsak;
        1. Karşılaştırma ifadeleri : if, if-else, switch case
        2. Döngü ifadadeleri : while, do-while, for
        3. Dallanma ifadeleri : break, continue, return
        4. Istisna ifadeleri : try, catch, finally, throw



         Şart ve seçime bağlı olarak çalışan yapılardır. Burda öğreneceğimiz tüm
        kavramların koşul kısımlarında mutlaka geriye true veya false değer döndürecek
        bir operatör veya değişken olmalıdır.
        Bu konuyu iki tane sayının birbirinden büyük küçük veya eşit olması
        durumlarını kontrol ederken anlatmaya çalışacağım.
        int sayi1 = 10, sayi2 = 5;
        System.out.println("Sayi1 sayi2den büyüktür);
        if(sayi1>sayi2){
        System.out.println("Sayi1 sayi2den küçüktür);
        }else if(sayi1 < sayi2){
        System.out.println("Sayi1 sayi2ye eşittir.);
        }else{
        }

        */

        int myAge = 23;
        int yourAge = 21;
        if (myAge > yourAge) {
            System.out.println("Ben senden büyüğüm");
        } else if (yourAge > myAge) {
            System.out.println("Sen benden büyüksün");
        } else
            System.out.println("Aynı yaştayız");






        /*


        !!!! Dikkat
        • if sayi > 0 { System.out.println("Bu ifade hatalıdır"); }
        //ifden sonra parantez olmalı ve şart buraya yazılmalı
        if (sayi > 0);
        {
        •
        System.out.println("Bu ifade hatalıdır");
         }
        //compile hatası vermez ama istenilen sonucu da üretmez.
        • if'den sonra tek satırlık bir statement geliyorsa {} kullanmak zorunlu değildir.
        • Eğer aynı blok içinde ard arda if kullanılmışsa, else en yakındaki if için kullanılır.
        System.out.println("Burası çalıştı");
        if(sayi1 > 0)
        if(sayi1 > sayi2)
        System.out.println("Else kısmı çalıştı");
        //buradaki else sayi1>0 için çalışır.
        //eğer birinci if ile ilgili olmasını istiyorsanız {} kullanmalısınız.
        else
        Ard arda if else if else if gibi bir ihtiyaç varsa switch case yapısını tercih
        edebilirsiniz.
        •
        • if(ciftMi == true) ifadesi ile if(ciftMi) ifadesi aynı anlama gelir.

*/



           /*
        Kısa if (ternary) Kullanımı
        if cümleciklerini daha kısa bir şekilde ifade edebiliriz.
        int a =10, b =8; c=0;
        c = (a>b) ? (a-b) : (a+b)
        Bu ifadede c değişkenine eğer a sayısı b sayısından büyükse (a-b) atanır,
        eğer a sayısı b sayısından küçükse c değişkenine (a+b) değeri atanır.
         */
        int a = 10, b = 8, c = 0;
        c = (a > b) ? (a - b) : (a + b);

        System.out.println(c);


    }
}
