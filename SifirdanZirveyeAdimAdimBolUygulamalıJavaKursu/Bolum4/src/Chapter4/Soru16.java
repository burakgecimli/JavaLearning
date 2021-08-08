package Chapter4;

public class Soru16 {
    public static void main(String[] args) {
        ////1 + 2 + 4 + 7 + 11 + 16 + 20 + 23 + 25 + 26 + 28 + 31 + 35 =?
        int artis=0;
        boolean artiyorMu = true;
        int toplam=0;
        for(int i = 1; i<=35; i=i+artis){
            System.out.print(i);
            toplam = toplam + i;
            if(i != 35){
                System.out.print(" + ");
            }else{
                System.out.print(" = " + toplam);
            }
            if(artis <= 4 && artiyorMu==true){
                artis++;
                if(artis == 5){
                    artiyorMu = false;
                    continue;
                }
            }else{
                artis --;
                if(artis == 1){
                    artiyorMu = true;
                    continue;
                }
            }
        }
    }
}

