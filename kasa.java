import java.util.Scanner;

public class kasa {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.print("Armut kaç kilo?");
        double armutKG = input.nextDouble();

        System.out.print("Elma kaç kilo?");
        double elmaKG = input.nextDouble();

        System.out.print("Domates kaç kilo?");
        double domatesKG = input.nextDouble();

        System.out.print("Muz kaç kilo?");
        double muzKG = input.nextDouble();

        System.out.print("Patlıcan kaç kilo?");
        double patlicanKG = input.nextDouble();

        double toplam = ((armut * armutKG) + (elma * elmaKG) + (domates * domatesKG) + (muz * muzKG) + (patlicanKG * patlicanKG));

        String tutar = String.format("%.2f", toplam);
        System.out.println("Toplam tutar: " + tutar);
    }
}
