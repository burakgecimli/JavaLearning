package Chapter6;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {
  /*
        Bazen bir dizinin kopyasının alınması gerekebilir. Burda yapmanız
        gereken her elemanı tek tek okuyup yeni bir diziye atamaktır.
        Isterseniz System sınıfının arraycopy() metotuyla da bu işlemi
        yapabilirsiniz.

        arraycopy(kaynakDizi, hangiElemandanBaslanacak, hedefDizi, hedefDizihangiElemandanBaslanacak, kacElemanKopyalanacak);
        Bu işlem için hedefDizi önceden oluşturulmalıdır

   */
        //Manuel Yöntem
        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }
        diziYazdir(copyArray);
        System.out.println("-----------------");


        //Otomatik Yöntem
        int[] copyArray2 = new int[arr.length];
        System.arraycopy(arr, 0, copyArray2, 0, arr.length);
        diziYazdir(copyArray2);


    }

    public static void diziYazdir(int[] getArray) {
        for (int in : getArray) {
            System.out.println("Kopya dizi: " + in);
        }
    }


}
