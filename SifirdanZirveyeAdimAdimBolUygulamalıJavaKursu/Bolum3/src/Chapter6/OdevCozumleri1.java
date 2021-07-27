package Chapter6;

import java.util.Scanner;

public class OdevCozumleri1 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan aldığınız değerlere göre vücut kitle endeksini hesaplayınız.
        Vücut Kitle Endeksi = kilo(kg) / ((boy(cm)/100)karesi)
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        int kilo = input.nextInt();
        System.out.println("Boyunuzu giriniz");
        int boy = input.nextInt();

        double endeks = (double) kilo / ((double) boy / 100 * (double) boy / 100);
        System.out.println(endeks);

        if (endeks < 15) {
            System.out.println("Çok ciddi derecede düşük kilolu");
        } else if (endeks >= 15 && endeks < 16) {
            System.out.println("Ciddi derecede düşük kilolu");
        } else if (endeks >= 16 && endeks < 18.5) {
            System.out.println("Düşük kilolu");
        } else if (endeks >= 18.5 && endeks < 25) {
            System.out.println("Normal Sağlıklı kilo");
        } else if (endeks >= 25 && endeks < 30) {
            System.out.println("Fazla kilolu");
        } else if (endeks >= 30 && endeks < 35) {
            System.out.println("1.dereceden(hafif) obez");
        } else if (endeks >= 35 && endeks <= 40) {
            System.out.println("2.dereceden(ciddi) obez");
        } else
            System.out.println("3.dereceden (çok ciddi) obez");

    }


}
