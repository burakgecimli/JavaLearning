package Chapter10;

import java.util.Random;
import java.util.Scanner;

public class Soru5 {


    public static void main(String[] args) {
        /*
        Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam soru sayısına bağlı olarak,
        öğrencilerin soruya verdiği cevapları tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
        Değerler A,B,C,D,E olmalı.Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da rastgele oluşturulmalı.
        Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru ve yanlışı olduğunu gösteren programı yazınız.

         */
        System.out.println("Kaç öğrenci olduğunu giriniz");
        Scanner input = new Scanner(System.in);
        int kacOgrenci = input.nextInt();
        System.out.println("Toplam kaç soru olduğunu giriniz");
        int kacSoru = input.nextInt();


        char[][] ogrCevaplari = new char[kacOgrenci][kacSoru];
        char[] dogruCevaplar=new char[kacSoru];

        ogrCevapMatrisi(ogrCevaplari);
        System.out.println("-----------------------------------------------------");


        System.out.println("\t *** CEVAP ANAHTARI *** ");
        dogruCevapMatrisi(dogruCevaplar);


        System.out.println("\n-------------------------------------------------------");
        kontrolEtMatrisi(dogruCevaplar,ogrCevaplari);

    }



    private static void kontrolEtMatrisi(char[] dogruCevaplar,char[][] ogrCevaplari ) {


        for (int i=0;i< ogrCevaplari.length;i++){
            int dogru=0;
            int yanlis=0;
            double puan=0;
            for (int j=0;j<ogrCevaplari[i].length;j++){
                if (ogrCevaplari[i][j]==dogruCevaplar[j]){
                    dogru++;
                }else{
                    yanlis++;
                }

            }
            System.out.println(i +1 +". öğrencinin dogru cevap sayısı : " + dogru+"\t"+"yanlış cevap sayısı : " + yanlis);

        }

    }



    private static void dogruCevapMatrisi(char []dogruCevaplar) {

        for (int i=0;i< dogruCevaplar.length;i++){
            int rastgeleSayi = 65 + (int) (Math.random() * 5);//0 1 2 3 4
            char uretilenSecenek = (char) rastgeleSayi;
            dogruCevaplar[i]=uretilenSecenek;
        }

        for (char in:dogruCevaplar){
            System.out.print(in+"\t");
        }
        System.out.println();
    }

    private static void   ogrCevapMatrisi(char[][] ogrCevaplari) {
        for (int i = 0; i < ogrCevaplari.length; i++) {
            for (int j = 0; j < ogrCevaplari[i].length; j++) {
                int rastgeleSayi = 65 + (int) (Math.random() * 5);//0 1 2 3 4
                char uretilenSecenek = (char) rastgeleSayi;
                ogrCevaplari[i][j]=uretilenSecenek;
            }


        }

        for (int i = 0; i < ogrCevaplari.length; i++) {
            System.out.print(i+1+".öğrencinin cevabları: ");
            for (int j = 0; j < ogrCevaplari[i].length; j++) {

                System.out.print(ogrCevaplari[i][j]+"\t");
            }
            System.out.println();
        }



    }






}
