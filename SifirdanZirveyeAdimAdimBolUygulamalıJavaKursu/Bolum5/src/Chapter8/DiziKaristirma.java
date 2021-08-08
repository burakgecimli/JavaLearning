package Chapter8;

public class DiziKaristirma {
    public static void main(String[] args) {
        /*
         Dizide istediğimiz bir elemanın olup olmadığını linear olarak arayabiliriz.
         Bu işlemde sırası ile aranılan elemanın dizide olup olmadığını kontrol ederiz.
         Küçük boyutlu dizilerde kolayca yapılırken, eleman sayısı çok olan dizilerde verimsizdir.
         5000 elemanlı bir dizide olmayan bir eleman için 5000 kere kontrol yapmak gerekir.
         Binary search ile daha etkin aramalar yapılabilir.
         Ama binary search yapmak için dizi elemanlarının sıralı olarak dizide yer alması gerekir.
         */

        int[] numbers = {12, 4, 32, 67, -9, 12, 1, 104, 21, 17};
        diziYazdir(numbers);
        System.out.println("Dizi karıştırıldıktan sonraki hali");
        diziKaristir(numbers);
        diziYazdir(numbers);


    }

    private static void diziKaristir(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int randNumbers = (int) (Math.random() * (i + 1));

            int swap = arr[i];
            arr[i] = arr[randNumbers];
            arr[randNumbers] = swap;

        }

    }

    private static void diziYazdir(int[] arr) {
        for (int in : arr) {
            System.out.println("Eleman: " + in);
        }
    }
}
