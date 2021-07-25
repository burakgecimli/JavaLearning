package Chapter2;

public class DegiskenKavramiVeNumerikVeriTipleri {

    public static void main(String[] args) {
        /*
         ---DEĞİŞKENLER---
        • Girdiğimiz değerleri alan veya programın çalışmasıyla bazı değerlerin atandığı veri tutucu yapılardır.
        • Alacakları değerlere göre türü belirlenmelidir.
        • Değişken adları rakamla başlayamaz, bu isimlerde büyük-küçük harf duyarlılığı  vardır, örneğin sayi1 ve Sayi1 farklı değişkenleri temsil eder.
        • Reserved wordleri kullanarak değişken adı oluşturulamaz.
        • Aynı kod bloğu içinde aynı isimden birden fazla değişken tanımlanamaz.
        • Boşluk ve /,*,+,- gibi özel karakterler içermemelidir.
        • Değişken tanımlamanın genel formülü :
        • Değişken türü değişken adı = değeri
          int sayi1 = 10 ;
        ---İlkel Veri Tipleri---
        Tam sayılar:
        Byte: -128 ve 127 arasında değerler alır. (8 bit)
        Short: -32768 ve 32767 arasında değerler alır. (16 bit)
        Integer: Orta uzunluktaki sayıları tutmak için kullanılır. En fazla kullanılan veri tipidir. (32 bit)
        Long: Çok uzun sayıları tutmak için kullanılır. (64 bit)
        Ondalıklı Sayılar:
        Float: Bu tip virgülden sonra 7 haneye kadar yeterli duyarlılıktadır. (Tek duyarlı — 32 bit)
        Double: Bu tip virgülden sonra 17 haneye kadar yeterli duyarlılıktadır. (Çift duyarlı — 64 bit)
        Char: Javada karakterleri temsil eder. 16 bit yer kaplar.0
        Boolean: Bu tip sadece True-False değerini alabilir.
         */

        System.out.println("----------------------------------------------");

        System.out.println("Byte Min değeri= " + Byte.MIN_VALUE + "\nByte Max değeri= " + Byte.MAX_VALUE
                + "\nKaç Byte= " + Byte.SIZE);
        System.out.println("----------------------------------------------");

        System.out.println("Short Min değeri= " + Short.MIN_VALUE + "\nShort  Max değeri= " + Short.MAX_VALUE
                + "\nKaç Byte= " + Short.SIZE);
        System.out.println("----------------------------------------------");

        System.out.println("Integer Min değeri= " + Integer.MIN_VALUE + "\nInteger Max değeri= " + Integer.MAX_VALUE
                + "\nKaç Byte= " + Integer.SIZE);
        System.out.println("----------------------------------------------");

        System.out.println("Long Min değeri= " + Long.MIN_VALUE + "\nLong Max değeri= " + Long.MAX_VALUE
                + "\nKaç Byte= " + Long.SIZE);
        System.out.println("----------------------------------------------");

        System.out.println("Float Min değeri= " + Float.MIN_VALUE + "\nFloat Max değeri= " + Float.MAX_VALUE
                + "\nKaç Byte= " + Float.SIZE);
        System.out.println("----------------------------------------------");


        System.out.println("Double Min değeri= " + Double.MIN_VALUE + "\nDouble  Max değeri= " + Double.MAX_VALUE
                + "\nKaç Byte= " + Double.SIZE);
        System.out.println("----------------------------------------------");


    }
}
