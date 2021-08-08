package Chapter11;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //SORU 3: küçük xlerle büyük X şekli çizen programı yazınız.
        //Mesela satır sayısı olarak 5 alan program şunu yazmalı
        /*
         * X     X
         *  X   X
         *    X
         *  X   X
         * X     X
         * */




        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satirSayisi = input.nextInt();

        for(int i=0; i<satirSayisi; i++){
            for(int j=0; j<satirSayisi; j++){

                if(i==j || j==(satirSayisi-i-1)){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }

            }

            System.out.println(" ");

        }


    }
}






