import java.util.Scanner;

public class harmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        double result = 0;
        for (int i=1; i <= n; i++){
            result += ((double) 1 /i);
        }

        System.out.print(result);
    }
}
