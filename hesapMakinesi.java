import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int a,b,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyıy giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();


        switch (select){
            case 1:
                System.out.println("Toplam: "+ (a+b));
                break;
            case 2:
                System.out.println("Fark: "+ (a-b));
                break;
            case 3:
                System.out.println("Çarpım: "+ (a*b));
                break;
            case 4:
                if (b != 0){
                    System.out.println("Bölüm: " + (a/b));
                }
                else{
                    System.out.println("Bir sayı sıfıra bölünemez.");
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız!");
        }
    }
}
