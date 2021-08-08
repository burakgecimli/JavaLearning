package Chapter2;

public class MethodOverLoading {
    public static void main(String[] args) {

        /*
        Metotlar aşırı yüklenerek yani overload edilerek aynı isimli methodlardan birden fazla tanımlanabilir.
        Burada önemli olan iki metotun birebir aynı isimde olmaları fakat signature
        değerlerinin yani parametre sayısının veya parametre veri tiplerinin farklı
        olmasıdır. Aynı isim altındaki methodları overload ettiğimiz de birbirinden farklı
        olan durumları parametrelerin sayısı ve bu parametrelerin türleridir.
        Bir metotun geri dönüş tipi imza yani signature kavramına dahil değildir.

        metot signature=metot ismi+metot parametre listesi
         */

        System.out.println(toplamBul(12, 4));
        System.out.println(toplamBul(7.4, 12.8));
        System.out.println(toplamBul(1));


    }


    public static int toplamBul(int a, int b) {
        return a + b;
    }

    public static double toplamBul(double a, double b) { // Method Overloading: Aynı metod ismi ile farklı tip parametreler.
        return a + b;
    }

    public static float toplamBul(int a) { //Method OverLoading: Aynı metod ismi ile farklı sayıda parametre.
        return 1;
    }



    /*
     Bir metotun geri dönüş tipi imza yani signature kavramına dahil değildir.

      -> hatalı kullanım
        public static int carpiminiBul(int a) {
        return 3;
    }

    -> hatalı kullanım
    public static double carpiminiBul(int a){
        return 4;

    }

     */


}
