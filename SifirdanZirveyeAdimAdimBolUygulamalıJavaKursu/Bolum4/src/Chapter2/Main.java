package Chapter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız.
        System.out.println("Faktöriyeli alınmasını istediğiniz sayıyı giriniz");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int fact = 1;
        for (int i = sayi; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);


        /*
        Aşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için  hesaplayınız.

        x>0, y<0 ise f(x,y) = 4x+2y+4
        x>0, y=0 ise f(x,y) = 2x-y+3
        x<0, y>0 ise f(x,y) = 3x+4y+3
         */

        System.out.println("x değerini giriniz");
        int x = input.nextInt();
        System.out.println("y değerini giriniz");
        int y = input.nextInt();
        int sonuc = 0;

        if (x > 0 && y < 0) {
            sonuc = 4 * x + 2 * y + 4;
        } else if (x > 0 && y == 0) {
            sonuc = 2 * x - y + 3;
        } else if (x < 0 && y > 0) {
            sonuc = 3 * x + 4 * y + 3;
        }
        System.out.println(sonuc);


        // 100lük sistemde verilen notları harfli sistemde gösteren bir uygulama yazınız.

        int notDegeri = 0, notSinir = 0;
        System.out.println("Notunuzu giriniz");
        notDegeri = input.nextInt();
        notSinir = notDegeri / 10;
        if (notDegeri == 100) {
            notSinir = 9;
        }
        switch (notSinir) {
            case 9:
                System.out.println("Notunuz AA");
                break;
            case 8:
                System.out.println("Notunuz BA");
                break;
            case 7:
                System.out.println("Notunuz BB");
                break;
            case 6:
                System.out.println("Notunuz CB");
                break;
            case 5:
                System.out.println("Notunuz CC");
                break;
            default:
                System.out.println("Notunuz CC'den düşük");


        }




        //Çarpım tablosunu oluşturan bir uygulama yazınız.
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j+"\t");
            }
            System.out.println("\n----------------------------------------------------------------------");

        }


















    }
}
