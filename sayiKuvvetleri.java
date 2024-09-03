import java.util.Scanner;

public class sayiKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Giriniz: ");
        n = input.nextInt();

        System.out.print(n + " sayısına kadar olan 4'ün kuvvetleri: ");
        for (int i=1; i<=n; i*=4){
            System.out.println(i);
        }
        System.out.print(n + " sayısına kadar olan 5'in kuvvetleri: ");
        for (int i=1; i<=n; i*=5){
            System.out.println(i);
        }
    }
}
