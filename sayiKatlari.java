import java.util.Scanner;

public class sayiKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int total = 0;

        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0){
                total += n;
            }
        } while (n % 2 == 0);

        System.out.print("Toplam: " + total);
    }
}
