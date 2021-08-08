package Chapter6;

public class DiziReferansKavrami {
    public static void main(String[] args) {

        int anaDizi[] = {10, 20, 30, 40, 50};
        int[] denemeDizi = {1, 2, 3, 4, 5};


        System.out.println(denemeDizi[0]);
        denemeDizi = anaDizi; //Burada "anaDizi" nin adresini (referansını) "denemeDizi" sine atadık.Bundan sonra "denemeDizi"si  "anaDizi" nin değerleri olan {10, 20, 30, 40, 50}
        //değerlerini tutacaktır."denemeDizi" sinin eski değerleri olan  {1, 2, 3, 4, 5} değerleri java garbage collector tarafından silinecektir.
        anaDizi[0] = 15;
        System.out.println(denemeDizi[0]);
        System.out.println("--------------------------");
        System.out.println();


        int[] tersiAlinmisDizi = tersiniAl(anaDizi);
        for (int in : tersiAlinmisDizi) {
            System.out.println(in);
        }


    }

    public static int[] tersiniAl(int[] arr) {

        int yeniDizi[] = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            yeniDizi[i] = arr[j];
        }

        return yeniDizi;

    }


}
