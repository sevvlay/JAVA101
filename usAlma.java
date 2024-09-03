import java.util.Scanner;

public class usAlma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        int a = input.nextInt();

        System.out.print("Üs: ");
        int b = input.nextInt();

        int result = 1;
        int pozitifUs = Math.abs(b);
        for (int i = 1; i <= pozitifUs; i++){
            result *= a;
        }
        if (b < 0) {
            System.out.println(a + " üzeri " + b + " = 1/" + result);
        } else {
            System.out.println(a + " üzeri " + b + " = " + result);
        }

    }
}
