import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {

        int derece;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        derece = inp.nextInt();

        if (derece < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }else if (derece <= 25){
            if (derece < 15){
                System.out.print("Sinemaya gidebilirsiniz.");
            }
            if (derece >= 10){
                System.out.print("Pikniğe gidebilirsiniz.");
            }
        }
        else{
            System.out.print("Yüzmeye gidebilirsiniz.");
        }




    }
}
