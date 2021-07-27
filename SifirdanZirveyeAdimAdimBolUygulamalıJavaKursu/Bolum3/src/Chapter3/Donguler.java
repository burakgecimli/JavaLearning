package Chapter3;

public class Donguler {
    public static void main(String[] args) {

        /*

        Döngü ifadeleri sayesinde bazı kod bloklarını tekrar tekrar çalıştırabiliriz.
        3 çeşittir. Kısaca eğer tekrarlanacak ifadenin bir sayısı varsa for, tekrarlanacak
        ifade bir koşula bağlıysa while veya do-while kullanılır.

        For Döngüsü
        Tekrar sayısının belli olduğu durumlarda kullanılır.
        for(ilk_atama ; dongu_calismasinin_sarti ; her_calisma_sonrasi_neolacak);
        for (int i = 0 ; i < 10 ; i++){
        }
        //bu kod blogu her calıstırıldıktan sonra i değeri 1 arttılır ve son durumdaki i değeri şartısağlıyorsa (i < 10) tekrar çalıstırılır
        Aşağıdaki ifadenin çıktısını yorumlayın.

        for(int i=0, j=0; (i+j <10 ); i++, j++){
        }

        for(;;) ifadesi ile sonsuz döngü oluşturulabilir.

        for(int i = ; i<10 ; i++);{
        //compiler hatası vermez ama mantık hatası vardır,
        }


         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");


        for (int i = 0, j = 0; (i + j < 10); i++, j++) {
            System.out.println(i + " " + j);
        }
        System.out.println("----------------------");


        /*

        int sayi = 10;
        while(sayi < 20){ //sayi<20 bu ifade true olduğu sürece çalışır.
        //birşeyler yap
        sayi ++;
        }
        Burada her çalışma sonrasında kontrol değişkenimizi güncellemeyi unutmamalıyız.(sayi++)
        Aksi taktirde sayi değişkeni sürekli 20den küçük olacağıiçin sonsuz döngüoluşur.


        while(true){
        } bu ifade ile sonsuz döngüoluşturabiliriz.

        while(sayi > 50);{
        //bu ifade compiler hatası vermese de mantık hatasıiçerir.
        }
        Döngüyü kontrol etmek için kullandığımız değişkenin float veya double olmamasına dikkat edelim. Çünkü bu veri tipleri tam değil yaklaşık değerler içerir.
         */


        /*
        While Döngüsü
        Koşula bağlı durumlar varsa veya kod bloğunun kaçkere çalışacağı bilinmiyorsa kullanılır.
        While döngüsündeki kod bloğunun tekrar tekrar çalışması için şart true olmalıdır.
         */

        int sayi = 10;
        while (sayi < 20) { //sayi<20 bu ifade true olduğu sürece çalışır.
            System.out.println(sayi + ". sayi");
            sayi++;
        }

        System.out.println("---------------------------");


        /*
        Bazen şartımız sağlansın veya sağlanmasın kodlarımızın en az bir kere çalışmasını isteriz.
        Bu gibi durumlarda do-while döngüsü kullanılır. Şart ifadesi döngü başında değil sonunda
        kontrol edilir. Şart doğruysa kod bloğu tekrar çalıştırılır.

        int sayi =0;
        do{
        //birşeyler yap
        sayi ++;
        }while(sayi<10);//burada noktalı virgül mutlaka olmalıdır
         */

        int number = 0;
        do {
            //birşeyler yap
            System.out.println(number + " kişi");
            number++;
        } while (number < 10);//burada noktalı virgül mutlaka olmalıdır

        System.out.println("----------------------");

        /*
        Etiketli ve etiketsiz olmak üzere iki çeşittir.
        Etiketsiz break ile döngüden çıkabiliriz.
        Etiketli break kullanımda ise etiketlediğimiz döngüyü sonlandırabiliriz.

          for(int i =0; i<10; i++){
            if(i ==4 ){
                break; // i değeri 4e eşit olduğu an döngüden çıkılır.
            }
        }

        */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 4) {
                break; // i değeri 4e eşit olduğu an döngüden çıkılır.
            }
        }
        System.out.println("---------------");



        /*

        //ETIKET KULLANIMI
        Özellikle içiçe birden fazla for yapımız varsa etiket vererek bunları kolayca kontrol edebiliriz. Kullanımı şu şekildedir:
        etiket1 :for(int y=0; y<5; y++){
        for(int z=0; z<10; z++){
        break etiket1;
        //en dıştaki for döngüsünden çıkar, içerdekinden değil
        if(z == 6){
        }
        }
        }
                 */

        distakiFor:
        for (int i = 0; i < 3; i++) {
            ictekiFor:
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
                if (i == 1 && j == 2)
                    break; //bu döngüyü sonlandırır.Dışardaki for çalışmaya devam eder.
                break distakiFor; // dışardaki for sonlanır.
            }
            System.out.println("********");
        }

      /*
          continue
        Uygulandığı döngünün pas geçilmesini sağlar. Etiketli veya etiketsiz kullanılabilir.
        for(int i =0; i<10; i++){
        if(i ==4 ){
        continue; // i değeri 4e eşit olduğu an döngü tekrar başa dönülür ve ekrana 4 değeri yazdırılmamış olur.
        }
        System.out.println("Sayi : " + i);
        }

       */

        for (int i = 0; i < 7; i++) {
            if (i == 4) {
                continue; // i değeri 4e eşit olduğu an döngü tekrar başa dönülür ve ekrana 4 değeri yazdırılmamış olur.
            }
            System.out.println("Sayi : " + i);
        }


    }
}
