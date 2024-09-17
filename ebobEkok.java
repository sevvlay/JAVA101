import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("N2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int ebob = 0;

        for (int i=1; i<=Math.min(n1,n2); i++){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
        }
        int ekok = (n1 * n2) / ebob;

        System.out.print("Ekok: "+ekok);
        System.out.print("\nEbob: "+ebob);
    }
}
