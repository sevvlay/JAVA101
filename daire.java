import java.util.Scanner;

public class daire {
    public static void main(String[] args){

        int r;
        double pi = 3.14;
        double a;
        double dilimAlan;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap giriniz: ");
        r = input.nextInt();
        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextInt();

        dilimAlan = (pi * (r*r) * a) / 360;
        System.out.println(dilimAlan);
    }
}
