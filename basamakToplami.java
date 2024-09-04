import java.util.Scanner;

public class basamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int num = input.nextInt();

        int sum = 0;
        int digit;

        while(num > 0){
            digit = num % 10; //Önce son basamağı alıyoruz
            sum += digit; //Basamağı toplama ekliyoruz
            num /= 10; //Son basamağı atıyoruz
        }

        System.out.print("Basamakların toplamı: " + sum);
    }
}
