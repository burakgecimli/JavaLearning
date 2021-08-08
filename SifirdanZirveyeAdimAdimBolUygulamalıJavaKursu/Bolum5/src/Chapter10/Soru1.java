package Chapter10;

public class Soru1 {
    public static void main(String[] args) {
        /*
        100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını rastgele olacak şekilde üretin.
        Bu işlemden sonra dizideki elemanların ortalamasını hesaplayarak bu ortalamanın altında
        kaç tane eleman olduğunu yazdırın.
         */

        int[] arr = new int[100];
        diziOlustur(arr);
        diziYazdir(arr);
        System.out.println("************************************************************");
        double diziOrt = ortalamaBul(arr);
        System.out.println("Dizinin Ortalaması=" + diziOrt);

        System.out.println("********************************************************");
        ortalamaAltiSayilar(arr, diziOrt);


    }

    private static void ortalamaAltiSayilar(int[] arr, double arrOrt) {
        int sayac = 0;
        for (int in : arr) {
            if (in < arrOrt) {
                sayac++;
            }

        }
        System.out.println("Bu dizide " + sayac + " tane eleman " + arrOrt + " değerinin altındadır.");
    }


    private static double ortalamaBul(int[] arr) {
        int toplam = 0;
        for (int in : arr) {
            toplam = toplam + in;

        }
        double ort = (double) toplam / arr.length;
        return ort;
    }

    private static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "\t");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    private static void diziOlustur(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
    }
}
