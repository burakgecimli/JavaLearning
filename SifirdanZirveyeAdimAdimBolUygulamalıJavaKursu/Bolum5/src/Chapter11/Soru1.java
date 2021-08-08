package Chapter11;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        SORU 1: 5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
        Bu matrisi ekrana    yazdıran ve çapraz elemanların toplamını gösteren programı yazınız.
         */
        int[][] matris = new int[5][5];
        int soltoplam = 0;
        int sagToplam = 0;

        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                matris[satir][sutun] = (int) (Math.random() * 9);
            }
        }


        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                System.out.print(matris[satir][sutun] + "\t");
            }
            System.out.println();
        }
        System.out.println("*****************************************");

        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                if (satir == sutun) {
                    System.out.print(matris[satir][sutun] + ",");
                    soltoplam += matris[satir][sutun];
                }

            }
        }
        System.out.println("Sol çapraz Toplam:" + soltoplam);


        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                if (satir + sutun == 4) {
                    System.out.print(matris[satir][sutun] + ",");
                    sagToplam += matris[satir][sutun];
                }

            }
        }
        System.out.println("Sağ çapraz Toplam:" + sagToplam);
        System.out.println("Genel Tolam=" + (soltoplam + sagToplam));


    }
}
