import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        int nFaktoriyel = 1;
        int rFaktoriyel = 1;
        int nEksirFaktoriyel = 1;

        for (int i = 2; i<= n; i++){
            nFaktoriyel *= i;
        }

        for (int i = 2; i <= r; i++){
            rFaktoriyel *= i;
        }

        for (int i = 2; i <= (n-r); i++){
            nEksirFaktoriyel *= i;
        }

        int kombinasyon = nFaktoriyel / (rFaktoriyel * nEksirFaktoriyel);
        System.out.print("Kombinasyon: " + kombinasyon);


    }
}
