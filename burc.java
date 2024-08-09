import java.util.Scanner;

public class burc {
    public static void main(String[] args) {

        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum ayınızı giriniz (1-12): ");
        month = input.nextInt();

        System.out.print("Doğum gününüzü giriniz (1-31): ");
        day = input.nextInt();

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            System.out.print("Burcunuz Kova");
        } else if ((month == 2) || (month == 3 && day <= 20)) {
            System.out.print("Burcunuz Balık");
        } else if ((month == 3) || (month == 4 && day <= 19)) {
            System.out.print("Burcunuz Koç");
        } else if ((month == 4) || (month == 5 && day <= 20)) {
            System.out.print("Burcunuz Boğa");
        } else if ((month == 5) || (month == 6 && day <= 20)) {
            System.out.print("Burcunuz İkizler");
        } else if ((month == 6) || (month == 7 && day <= 22)) {
            System.out.print("Burcunuz Yengeç");
        } else if ((month == 7) || (month == 8 && day <= 22)) {
            System.out.print("Burcunuz Aslan");
        } else if ((month == 8) || (month == 9 && day <= 22)) {
            System.out.print("Burcunuz Başak");
        } else if ((month == 9) || (month == 10 && day <= 22)) {
            System.out.print("Burcunuz Terazi");
        } else if ((month == 10) || (month == 11 && day <= 21)) {
            System.out.print("Burcunuz Akrep");
        } else if ((month == 11) || (month == 12 && day <= 21)) {
            System.out.print("Burcunuz Yay");
        } else if (month == 12 || month == 1) {
            System.out.print("Burcunuz Oğlak");
        }
    }
}