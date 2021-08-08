package Chapter1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // Klavyeden girilen 3 sayının ortalamasını alan bir uygulama yazınız


        double toplam = 0;
        double sayi;
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + ".sayıyı giriniz");
            sayi = input.nextDouble();
            toplam += sayi;

        }
        System.out.println("Girien Sayıların ortalaması=" + toplam / 3.0);



        // Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız.

        System.out.println("Üçgenin kenarlarını giriniz");
        int birinciKenar = input.nextInt();
        int ikinciKenar = input.nextInt();
        int ucuncuKenar = input.nextInt();


        if (birinciKenar == ikinciKenar && birinciKenar == ucuncuKenar) {
            System.out.println("Eşkenar Üçgen");
        } else if (birinciKenar == ikinciKenar || birinciKenar == ucuncuKenar || ikinciKenar == ucuncuKenar) {
            System.out.println("İkizkenar Üçgen");
        } else
            System.out.println("Çeşitkenar Üçgen");



        /*
        Klavyeden girilen vize ve final notlarınına göre öğrencinin dersi geçip geçmediğini söyleyen
        bir uygulama yazınız.(Geçme notu : 50, vizenin %40ı, finalin %60ı geçerlidir.)
         */
        System.out.println("Vize Notunuzu Giriniz");
        int vizeNot=input.nextInt();
        System.out.println("Final Notunuzu Giriniz");
        int finalNot=input.nextInt();

        double ortalamaNot=(vizeNot*40.0)/100+(finalNot*60.0)/100;
        System.out.println(ortalamaNot);
        if(ortalamaNot>=50){
            System.out.println("Geçtiniz");
        }else
            System.out.println("Kaldınız");



        //Kendi adınızı ekrana 5 kere yazdıran uygulamayı tüm döngülerle yapınız.
        for (int i=0;i<5;i++){
            System.out.println("FOR DÖNGÜSÜ: BURAK");
        }
        System.out.println("----------------------");

        int i=0;
        while (i<5){
            System.out.println("WHILE DÖNGÜSÜ: BURAK");
            i++;
        }
        System.out.println("----------------------");

        int sayac=0;
        do {
            System.out.println("DO WHILE DÖNGÜSÜ: BURAK");
            sayac++;
        }while (sayac<5);



        //  1’den 100’e kadar olan sayıların toplamını bulan uygulamayı yazınız.
        int number=1;
        int sonuc=0;
        while (number<=100){
            sonuc+=number;
            number++;
        }
        System.out.println(sonuc);



        // 1’den 10a kadar olan sayıları sıra ile ve aralarında virgül olacak şekilde yazan bir
        //uygulamayı for döngüsü ile yazınız. 1,2,3,........ 10
        for (int i1=1;i1<=10;i1++){
            System.out.print(i1);
            if (i1!=10){
                System.out.print(",");
            }

        }



    }
}
