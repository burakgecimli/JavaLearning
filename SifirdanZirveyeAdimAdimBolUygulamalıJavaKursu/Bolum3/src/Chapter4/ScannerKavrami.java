package Chapter4;

import java.util.Scanner;

public class ScannerKavrami {
    public static void main(String[] args) {
        /*
        Scanner sınıfı ile kullanıcının consoledan veri girmesi sağlanır.
        Scanner tara=new Scanner(System.in);
        String isim = tara.next();//sadece ilk kelimeyi alır.
        String tamAd = tara.nextLine();//bütün satırı alır.
        Diğer veri türleri için farklımetotlarıbulunur.
        nextBoolean(), nextInt(), nextLong() gibi..

             */
        System.out.println("İsminizi Giriniz");
        Scanner input = new Scanner(System.in);
        String isim = input.nextLine();
        System.out.println("Yaşınızı Giriniz");
        int yas = input.nextInt();
        System.out.println("İsminiz: " + isim);
        System.out.println("Yaşınız: " + yas);


        System.out.println("Double değer giriniz:");
        double d = input.nextDouble();
        System.out.println(d);

        System.out.println("Cümle giriniz");
        String cumle = input.next();
        System.out.println(cumle);
        input.nextLine();

        System.out.println("bir kelime giriniz");
        char ifade = input.next().charAt(0);
        System.out.println(ifade);


    }
}
