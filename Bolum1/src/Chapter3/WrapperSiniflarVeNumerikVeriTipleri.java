package Chapter3;

public class WrapperSiniflarVeNumerikVeriTipleri {

    public static void main(String[] args) {

        /*
       ---  Char Veri Tipi ---
       • Java'da tek tırnak içinde basit karakterlerin saklanması için char veri tipi kullanılır.
         char birHarf = 'e';
         char birSayi = '4';
       • birSayi isimli değişkene tek tırnaklar içinde 4 değeri
         atanırsa bu artık rakam ve tam sayı olan 4 olarak değil bir
         karakter olarak algılanır.
        • Eğer bir char değişkenine ilk atama yapılmazsa java otomatik
          olarak '\u0000' unicode değerini atar.
          char değerler bellekte 16 bitlik yer kaplar.


        --- Boolean Veri Tipi ---
       •  Sadece true veya false değerini alan bir veri türüdür.
       •  Bellekte 1 bit yer kaplar.
       •  Ilk değeri atanmazsa java varsayılan olarak false değerini  atar.
       •  boolean ciftSayiMi = true
         */


        char birHarf = 'e';
        char birSayi = '4';
        System.out.println(birHarf);
        System.out.println(birSayi);

        int myInt = 'A';
        System.out.println(myInt); // 'A' değerinin unicode karşılık değerini yazar.


      /*
        int number;
        System.out.println(number);
        Variable 'number' might not have been initialized
       */







        /*
        --- Wrapper Sınıflar Nedir? ---
        Şu ana kadar öğrendiğimiz tüm veri türleri java tarafından
        nesne olarak algılanmamaktadır. Belki de bu yüzden bu veri
        türlerine ilkel veri tipi diyoruz.
        İlerleyen zamanlarda sınıf ve nesne kavramlarını öğrenince bu
        konu çok daha iyi algılanacaktır ancak şuan için bu tanımı
        yapabiliriz.
        Her ilkel veri türünü sarmalayan bir sınıf bulunmaktadır ve
        veri türünün büyük harfle başlayan versiyonudur.
        Örneğin int => Integer, double => Double vb..
        Bu sınıf nesneleri null değer alabilir ve özellikle nesneye
        yönelimli programlar yazarken çok yerde işimize yarayacaktır.
        Şuan için veri türlerimizin alacağı minimum ve maksimum
        değerler için bu sınıfların kullanımlarını göreceğiz.
        System.out.println("En büyük integerdeğer :" + Integer.MAX_VALUE);
        System.out.println("En büyük float değer :" + Float.MAX_VALUE)
         */



        /*
       --- Tip Dönüşümleri Type Casting ---
        Javada küçük olan tamsayı veri türü otomatik olarak büyük
        olan veri türüne dönüştürülür. Yani siz long veri tipine
        sahip bir değişkene integer bir sayı atayabilirsiniz.
        Ama tam tersi bir durumda veri kaybı da yaşanabileceği için tip
        dönüşümü yani type casting işlemi yapmanız gereklidir.
        Ayrıca tam sayı tutan byte, short, int ve long veri tipine sahip
        değişkenlere noktalı ifadeler içeren float veya double değerler atanamaz.
        Böyle durumlarda virgülden sonraki kısmın kaybedileceği gerçeğini
        kabul ederek tip dönüşümü yapılabilir.
        int sayi = (int) 7,75; // sayi değişkenine atanan değer 7 olur.
         */

        int numberInt=10;
        double numberDouble=21.56;
        numberDouble=numberInt;

        System.out.println(numberDouble);


        // numberInt=numberDouble Tip Uyumsuzluğu

        numberInt= (int) numberDouble ;// Cast  to int
        System.out.println(numberInt);


    }
}
