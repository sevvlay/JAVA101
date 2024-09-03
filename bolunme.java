import java.util.Scanner;

public class bolunme {
    public static void main(String[] args) {
        int sayi;
        Scanner input =new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        int toplam = 0;
        int adet = 0;

        for(int i = 0; i <= sayi ; i++){
            if(sayi % 3 == 0 && sayi % 4 == 0){
                adet ++;
                toplam += i;
            }
        }

        if(adet > 0){
            double ortalama = (double) toplam / adet;
            System.out.print("Sayıların Ortalaması: " + ortalama );
        }else
            System.out.print("3'e ve 4'e tam bölünen sayı yok.");

    }
}
