package Chapter2;

public class SwitchCase {
    public static void main(String[] args) {
      /*
        İlgili değişkenin değerine göre farklı işlemler yapılacaksa kullanılması
        gereken yapıdır. Eğer ard arda çok fazla if else if kullanıyorsanız switch
        case kullanarak kod karmaşıklığının önüne geçebilirsiniz.



         Dikkat edilmesi gerekenler :
        • Koşula bağlanan değişken double veya float olamaz.

        • Değişkenlerin hangi aralıkta olduğu incelenemez.

        • Sadece char, short, byte veya int değerler kullanılabilir.

        • break anahtar kelimesi kullanılması zorunlu değildir ama koşulun
          sağlandığı case'den çıkmak için kullanılması tavsiye edilir. Aksi
          taktirde program aşağıya doğru çalışmaya devam edecektir.

        • Herhangi bir şart sağlanmaz veya bir case içine girilmezse varsa
          default bloğu çalıştırılır.


       */

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı gün sayısı girildi");


        }


    }
}
