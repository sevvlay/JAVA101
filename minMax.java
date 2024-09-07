import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceğinizi belirtiniz: ");
        int n = input.nextInt();

        if (n <= 0){
            System.out.println("Lütfen geçerli bir sayı giriniz!");
        }else{
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i=1; i<=n; i++){
                System.out.print(i + ". sayıyı giriniz:");
                int number = input.nextInt();

                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }
            System.out.println("En büyük sayı: " + max);
            System.out.println("En küçük sayı: " + min);
        }


    }
}
