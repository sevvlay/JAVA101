import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        int total = 0;

        for (int i=1; i<num; i++){
            if (num%i==0){
                total += i;
            }
        }

        if (total == num){
            System.out.print(num + " mükemmel bir sayıdır.");
        }else{
            System.out.print(num + " mükemmel bir sayı değildir.");
        }
    }
}

