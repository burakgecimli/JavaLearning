package Chapter4;

public class OdevCozumleri {
    public static void main(String[] args) {
        /*
         String stringSayi="150";
        integer bir değer oluşturup içine yukarıdaki metin olarak verieln ifadeyi atayıp ekrana yazdırınız.Sonrasında bu
        değeri tekrar metine çevirip ekrana yazdırınız.

         */
        String stringSayi="150";
        int myInt=Integer.parseInt(stringSayi);
        System.out.println(myInt);

        String myString=String.valueOf(myInt);
        System.out.println(myString);
        System.out.println("--------------------------------------------");



        /*
        Aşağıdaki ifadeleri hesaplayıp ekrana bastırın ve sonuçları yorumlayın.
        int sayi1 = 5 / 3 ;
        float sayi2 = 5f / 3f ;
        double sayi3 = 5d / 3d;
         */
        int sayi1 = 5 / 3 ; // 1
        float sayi2 = 5f / 3f ; // 1.6666666
        double sayi3 = 5d / 3d; // 1.6666666666666667
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);

        /*
        Aşağıdaki ifadelerin sonucu nedir ve sonucu yorumlayın.

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);

         */

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); //0.5000000000000001
        System.out.println(1.0 - 0.9); // 0.09999999999999998


        System.out.println("--------------------------------------------");

        int number1=1;
        int number2=2;
        double avarege= (number1+number2)/2;
        System.out.println(avarege);



        double avarege2=(number1+number2)/2.0;
        System.out.println(avarege2);




    }
}
