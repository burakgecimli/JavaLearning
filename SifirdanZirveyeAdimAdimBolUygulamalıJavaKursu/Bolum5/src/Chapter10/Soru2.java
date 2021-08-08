package Chapter10;

public class Soru2 {
    public static void main(String[] args) {

        /*
        Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan sayıların toplamını yazdıran program yazınız.
        Ayrıca bu matriste yer alan en küçük ve en büyük sayıyı da mesaj olarak göstersin.
         */


        int[][] matris = new int[3][2];
        matrisOlustur(matris);
        matrisYazdir(matris);
        System.out.println("---------------------------");
        System.out.println("Toplam=" + matrisToplaminiBul(matris));
        System.out.println("----------------------------");
        matrisEnbuyukEnkucukElemanBul(matris);


    }

    private static void matrisEnbuyukEnkucukElemanBul(int[][] ikiBoyutluDizi) {
        int ek = ikiBoyutluDizi[0][0];
        int eb = ikiBoyutluDizi[0][0];


        for (int i = 0; i < ikiBoyutluDizi.length; i++) {
            for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
                if (ikiBoyutluDizi[i][j] < ek) {
                    ek = ikiBoyutluDizi[i][j];
                }
                if (ikiBoyutluDizi[i][j] > eb) {
                    eb = ikiBoyutluDizi[i][j];
                }

            }

        }
        System.out.println("Matrisin En Büyük Elemanı=" + eb);
        System.out.println("Matrisin En Küçük Elemanı=" + ek);

    }

    private static int matrisToplaminiBul(int[][] ikiBoyutluDizi) {
        int toplam = 0;
        for (int i = 0; i < ikiBoyutluDizi.length; i++) {
            for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
                toplam += ikiBoyutluDizi[i][j];
            }

        }
        return toplam;
    }

    private static void matrisYazdir(int[][] ikiBoyutluDizi) {
        for (int i = 0; i < ikiBoyutluDizi.length; i++) {
            for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
                System.out.print(ikiBoyutluDizi[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void matrisOlustur(int[][] ikiBoyutluDizi) {
        for (int i = 0; i < ikiBoyutluDizi.length; i++) {
            for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
                ikiBoyutluDizi[i][j] = (int) (Math.random() * 20);
            }
        }
    }


}
