package Chapter1;

public class Methods {

    public static void main(String[] args) {

                /*
        Metotlar (yordamlar) sayesinde bir kod bloğunun belli bir işi yapması için bir araya gelmesiyle oluşur.
        Metotları kullanarak büyük problemleri küçük parçalara ayırabilir,
        gereksiz kod kalabalığından kurtulabiliriz.

        */


        /*
        --- PARAMETRESİZ METOTLAR ---
        Parametre almayan ve değer döndürmeyen metotlardır.

        void selamla(){
        System.out.println("Merhabalar, Nasılsın ?");
        }
         */
        parametresizMetod();


        /*
        --- PARAMETRE ALAN METOTLAR ---
         Girdi olarak bazı değerler alır ve bunlara  bağlı olarak işlem yapar.

         void topla ( int s1, int s2){
            System.out.println("Parametrelerin toplamı : " + (s1 + s2));
        }

        */
        parametreliToplamaYap(12, 6);


        int sayi = 5;
        sayiDegistir(sayi); // bu çıktı metot tanımı gereği 15 verecektir.
        System.out.println(sayi); // Ancak sayi değişkenini bu metota gönderme işlemi sonucunda tekrar yazdırırsak 15 değil yine 5 değerini verecektir.
        // Çünkü Primitive tiplerde  değişkeninin orijinal değeri  değil kopyası gönderilir.



        /*
        --- PARAMETRELİ DEĞER DÖNDÜREN METOTLAR ---
        Çağrıldıkları yere bazı değerleri döndüren metotlar.
         */

        System.out.println("Fark=" + sayilarinFarkiniBulGeriDondur(14, 7));

        /*
        --- PARAMETRESİZ DEĞER DÖNDÜREN METOTLAR ---
        Geriye değer döndürüp parametre almayan metotlar da olabilir.Örneğin Math.random() gibi ...
         */

       /* Math.random(); geriye değer döndüren metotları bu şekil kullanırsak.O metot çalışacak fakat biz o metotu konsolda yazdırmazsak veya bir değişkene atayıp
         işlem yapmazsak onun sonucunu göremeyiz bu yüzden  geriye değer döndüren metotlar System.out.println(Math.random()); şeklinde kullanılır.

        */
        System.out.println(Math.random());

        boolean islem = parametresizGeriyeDondur();
        System.out.println(islem);


    }


    public static boolean parametresizGeriyeDondur() {
        return false;
    }

    public static int sayilarinFarkiniBulGeriDondur(int k, int l) {
        return k - l;
    }

    public static void sayiDegistir(int number) {
        number = number + 5;
        System.out.println(number);
    }


    public static void parametresizMetod() {
        System.out.println("Merhaba ben geriye değer döndürmeyen void bir metodum.");
    }


    public static void parametreliToplamaYap(int a, int b) {
        System.out.println("Toplam=" + (a + b));
    }







}
