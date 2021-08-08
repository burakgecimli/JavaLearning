package Chapter11;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        //SORU 2: Decimal sayıları binary formatına çeviren java programını yazınız.
        //Program 30 sayısı için 1 1 1 1 0 çıktısını üretmeli, String kullanabilirsiniz.

        Scanner tara = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int girilenSayi = tara.nextInt();
        String binarySayi = "";
        if(girilenSayi == 0){
            binarySayi = "0";
        }
        while(girilenSayi > 0){

            int mod = girilenSayi % 2;
            binarySayi = mod + binarySayi;
            girilenSayi = girilenSayi / 2 ;

        }
        System.out.println("Sayının binary hali: "+binarySayi);



    }
}
