import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        int digitNum = 0;
        int tempNum = number;
        int digitValue;
        int result = 0;
        int digitPow;

        while (tempNum != 0){
            tempNum /= 10;
            digitNum++;
        }

        tempNum = number;
        while (tempNum != 0){
            digitValue = tempNum % 10;
            digitPow = 1;

            for (int i=1; i<=digitNum; i++){
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNum /= 10;
        }

        if (result == number){
            System.out.print(number + " bir Armstrong sayısıdır.");
        }else
            System.out.print(number + " bir Armstrong sayısı değildir.");

    }
}
