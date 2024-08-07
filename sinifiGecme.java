import java.util.Scanner;

public class sinifiGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int dersSayisi = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if(0>mat || mat>100){
            mat = 0;
            dersSayisi--;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if(0>fizik || fizik>100){
            fizik = 0;
            dersSayisi--;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if(0>turkce || turkce>100){
            turkce = 0;
            dersSayisi--;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if(0>kimya || kimya>100){
            kimya = 0;
            dersSayisi--;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if(0>muzik || muzik>100){
            muzik = 0;
            dersSayisi--;
        }

        double average = (double) (mat + fizik + turkce + kimya + muzik) /dersSayisi;

        if(average<55) {
            System.out.println("Ortalamanız: " + average);
            System.out.print("Maalesef sınıfta kaldınız.");
        }
        else{
            System.out.println("Ortalamanız: " + average);
            System.out.print("Sınıfı geçtiniz!");
        }
    }
}
