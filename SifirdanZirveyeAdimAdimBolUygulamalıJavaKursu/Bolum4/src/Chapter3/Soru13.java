package Chapter3;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki integer değerin en büyük ortak bölenini bulan uygulamayı yazınız
        //Örneğin 14 ve 35 sayıları için ebob = 7 olmalıdır.

        Scanner input=new Scanner(System.in);
        System.out.println("a sayısını giriniz:");
        int a=input.nextInt();
        System.out.println("b sayısını giriniz:");
        int b=input.nextInt();

        int eb=0;
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0){
                    eb=i;
                }

            }

        }else {
            for (int i=1;i<=a;i++){
                if (a % i == 0 && b % i == 0){
                    eb=i;
                }
            }

        }
        System.out.println(a+" ve "+b+" sayılarının ebobu= "+eb);

    }
}
