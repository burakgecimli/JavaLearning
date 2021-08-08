package Chapter5;

public class ForeeachDongusu {
    public static void main(String[] args) {
        /*
        Daha önce dizi elemanlarını for döngüsü ile gezmiştik. Dizi
        elemanlarını okumak için çok daha kullanışlı ve foreach isimli bir
        yapı da vardır. Bu yapıyı eğer index ile ilginiz yoksa ve sadece
        dizi elemanlarını göstermek istiyorsanız kullanabilirsiniz.
        for(int oankiSayi : diziAdi){
        System.out.println(oankiSayi);
        }
         */
        int[] numberArray = {1, 2, 3, 4, 5};
        for (int number : numberArray) {
            System.out.println(number);
        }

        String[] names = {"Ali", "Ayşe", "Berk"};
        System.out.println("-----------------");
        diziYazdir(names);





    }

    public static void diziYazdir(String[] arr) {
        for (String in : arr) {
            System.out.println(in);
        }
    }


















}
