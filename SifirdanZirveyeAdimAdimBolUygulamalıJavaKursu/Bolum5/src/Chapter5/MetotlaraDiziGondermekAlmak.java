package Chapter5;

public class MetotlaraDiziGondermekAlmak {
    public static void main(String[] args) {
        /*
      --- Dizilerin Metotlara Gönderilmesi ---
        Metotlarımıza primitive verileri parametre olarak geçebildiğimiz
        gibi dizileri de parametre olarak geçebiliriz.
        Burda dikkat edilmesi gereken metotlara dizideki değerlerin kopyası
        değil referansları gider. O yüzden metot içinde yapılacak
        değişiklikler dizinin kendisinde yapılmış sayılır. Primitive
        tiplerde ise metotlara sadece değerin kopyası gönderiliyordu.
        Metotlar geriye dizi de döndürebilir. Aşağıdaki metot parametre
        olarak aldığı bir dizinin elemanlarını ters yönde içeren bir dizi
        olusturur.

        public static int[] tersiniAl(int[] dizi) {
        int[] sonuc= new int[dizi.length];
        for (int i = 0, j = sonuc.length - 1; i < dizi.length; i++, j--) {
        sonuc[j] = dizi[i];
        }
        return sonuc;
        }
               */


        int[] numberArray = {10, 20, 30, 40, 50};
        int sayi = 15;

        System.out.println("İlk değer=" + sayi); // Primitive tip olan int sayi değişkeninin kopyası gönderildi.
        sayiDegistir(sayi);
        System.out.println("Son değer=" + sayi); // Ve dolayısıyla metot işleminden orijinal değer etkilenmeden çıktı.

        System.out.println("---------------------------------");

        System.out.println("İlk değer= " + numberArray[0]); //Referans tip olan array ise metot işleminde dizinin referansı metota parametre olarak
        //  gittiğinden dizinin orijinal değeri değişti.
        degistir(numberArray);
        System.out.println("Son değer= " + numberArray[0]);


    }

    public static void degistir(int[] arr) {
        arr[0] = 99;
    }

    public static void sayiDegistir(int num) {
        num = 99;
    }
}
