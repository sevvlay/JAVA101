import java.util.Scanner;

public class kutleIndeksi {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        double boy = inp.nextDouble();

        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        double kilo = inp.nextDouble();

        double bmi = kilo / (kilo * kilo);

        System.out.println("Vücut kütle indeksiniz: " + bmi);
    }
}
