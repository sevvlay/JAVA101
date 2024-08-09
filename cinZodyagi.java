import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {

        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınız: ");
        yil = input.nextInt();

        if(yil > 0){
            int sonuc = yil % 12;
            if (sonuc == 0){
                System.out.println("Maymun");
            }else if (sonuc == 1){
                System.out.println("Horoz");
            }else if (sonuc == 2){
                System.out.println("Köpek");
            }else if (sonuc == 3){
                System.out.println("Domuz");
            }else if (sonuc == 4){
                System.out.println("Fare");
            }else if (sonuc == 5){
                System.out.println("Öküz");
            }else if (sonuc == 6){
                System.out.println("Kaplan");
            }else if (sonuc == 7){
                System.out.println("Tavşan");
            }else if (sonuc == 8){
                System.out.println("Ejderha");
            }else if (sonuc == 9){
                System.out.println("Yılan");
            }else if (sonuc == 10){
                System.out.println("At");
            }else{
                System.out.print("Koyun");
            }
        }else
            System.out.print("Hatalı Giriş Yaptınız!");

        }

    }

