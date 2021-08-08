package Chapter7;

public class İkiBoyutluDizi {
    public static void main(String[] args) {
        /*
        Dizileri tanımlarken aynı türde veri tutan yapılar demiştik. İki
        boyutlu dizi kavramı da aslında bir dizi tutan dizi olarak
        düşünülebilir.
        Matematikteki matris sistemini İki boyutlu diziler kullanarak
        oluşturabiliriz.
        Ayrıca bir tablodaki verileri belirtmek için de iki boyutlu diziler
        kullanılabilir.

        veritipi[][] diziAdi = new veritipi[satir_sayisi][sutun_sayisi]
        int[][] sayilar = new int[2][3] ifadesi 2 satırlı 3 sütunlu bir matris demektir
        int[][] borclar = { {0,100,200}, {350,0,250}, {150,500,0}}
        Hasanın aliye borcu için borclar[1,2] demek yeterli
        İki boyutlu bir dizide her bir satır aslında başka bir diziyi tutan dizidir.
        borclar[0].length ==> 3 elemanlı bir dizidir


        O yüzden her bir satır farklı elemanlı diziler de tutabilir.
        int[][] degisikElemanSayiliDizi = new int[5][];
        degisikElemanSayiliDizi[0] = new int[5];
        degisikElemanSayiliDizi[1] = new int[4];
        degisikElemanSayiliDizi[2] = new int[3];
        degisikElemanSayiliDizi[3] = new int[2];
        degisikElemanSayiliDizi[4] = new int[1];
        Bu dizilerin elemanlarini gezerken iç içe for döngüleri kullanılabilir.
        for (int satir = 0; satir < dizi.length; satir ++) {
        for (int sutun= 0; sutun< dizi[satir].length; sutun++) {
        System.out.println("Eleman:" + dizi[satir][sutun]);
        }
        }
        dizi.length ==> satır sayısını dizi[0].length =>0. satırdaki sutun sayısı

         */

        int[][] matris = new int[2][2];
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[1][0] = 3;
        matris[1][1] = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("---------------------");

        //Bu şekilde de tanımlama yapılabilir.
        //3*3 lük bir matris
        int[][] matris2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                System.out.print(matris2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        int[][] borclar = {{0, 100, 200}, {350, 0, 250}, {150, 500, 0}};
        String[] isimler = {"Emre", "Hasan", "Ali"};
        for (int i = 0; i < borclar.length; i++) {
            for (int j = 0; j < borclar[i].length; j++) {
                if (i != j) {
                    int alacak = borclar[i][j] - borclar[j][i];
                    if (alacak < 0) {
                        System.out.println(isimler[i] + "nin " + isimler[j] + " den alacağı= " + (-alacak));
                    }

                }


            }

        }


    }
}
