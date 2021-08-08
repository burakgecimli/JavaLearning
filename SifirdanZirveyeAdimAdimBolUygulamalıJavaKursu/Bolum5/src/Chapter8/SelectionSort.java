package Chapter8;

public class SelectionSort {
    public static void main(String[] args) {
        int numbersLength = (int) (Math.random() * 100);
        int[] numbers = new int[numbersLength];
        System.out.println("Dizinin uzunluğu= " + numbersLength);

        System.out.println("---------------------");
        rastgeleDiziOlustur(numbers, numbersLength);
        diziYazdir(numbers);


        System.out.println("------------------------ sorted -----------------------------");
        System.out.println();
        selectionSort(numbers);
        diziYazdir(numbers);

    }

    private static void rastgeleDiziOlustur(int[] arr, int length) {

        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    private static void diziYazdir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Dizinin " + i + ".elemanı= " + arr[i]);

        }
    }

    //10,3,15,86
    //3,10,15,86
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int enKucukEleman = arr[i];
            int enKucukIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < enKucukEleman) {
                    enKucukEleman = arr[j];
                    enKucukIndex = j;
                }
            }

            if (enKucukIndex != i) {
                arr[enKucukIndex] = arr[i];
                arr[i] = enKucukEleman;
            }


        }

    }


}
