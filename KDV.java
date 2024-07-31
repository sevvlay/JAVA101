import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double paraTutari;
        double kdvTutari;
        double kdvOrani;
        double kdv;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücreti giriniz : ");
        paraTutari = input.nextDouble();

        if (paraTutari<=1000 && paraTutari>0){

            kdvOrani = 0.18;
        }

        else{

            kdvOrani = 0.08;
        }

        kdvTutari = paraTutari * kdvOrani;
        kdv = kdvTutari + paraTutari;
        System.out.println(kdv);









    }
}
