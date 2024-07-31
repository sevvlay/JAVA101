import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args){

        int a, b, c;
        double z;

        Scanner input =new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını giriniz: ");
        a = input.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz: ");
        b = input.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz: ");
        c = input.nextInt();

        z = (a + b + c) / 2.0 ;

        double alan = Math.sqrt(z * (z - a) * (z - b) * (z - c));
        System.out.println("Üçgenin alanı: " + alan);


    }

}
