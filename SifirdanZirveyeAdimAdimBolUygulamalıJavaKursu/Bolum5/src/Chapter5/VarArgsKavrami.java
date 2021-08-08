package Chapter5;

public class VarArgsKavrami {
    public static void main(String[] args) {
        toplamBul(5, 8);
        toplamBul(5, 8, 10); //Method overloading yapabiliriz ancak kaç tane sayı ile işlem yapacağımızı bilmediğimiz de tek tek metod tanımlamamıza gerek yok.


        toplamBul(5, 8, 10, 20,45,65,85); //bunun yerine varargs yapısını kullanırız.
    }

    public static void toplamBul(int i, int j) {
        int toplam = 0;
        toplam = i + j;
        System.out.println("Sonuç=" + toplam);
    }

    public static void toplamBul(int i, int j, int k) { //Method overloading yapabiliriz
        int toplam = 0;
        toplam = i + j + k;
        System.out.println("Sonuç=" + toplam);
    }

    public static void toplamBul(int... arr) {
        int toplam = 0;
        for (int in : arr) {
            toplam += in;
        }
        System.out.println("Sonuç=" + toplam);
    }
}
