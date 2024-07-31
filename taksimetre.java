import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args){

        int km;
        double totalPrice = 10;
        double perKM = 2.20;

        Scanner input =new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextInt();

        totalPrice += (perKM * km);
        System.out.println("Total: "+ totalPrice);

    }
}
