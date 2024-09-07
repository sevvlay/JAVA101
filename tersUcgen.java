import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz: ");
        int n = scanner.nextInt();

        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
