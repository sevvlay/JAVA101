import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

    int mat, fizik, kimya, turkce, tarih, muzik;

    Scanner input = new Scanner(System.in);

    System.out.print("Matematik notunuz:");
    mat = input.nextInt();

    System.out.print("Fizik notunuz:");
    fizik = input.nextInt();

    System.out.print("Kimya notunuz:");
    kimya = input.nextInt();

    System.out.print("Turkce notunuz:");
    turkce = input.nextInt();

    System.out.print("Tarih notunuz:");
    tarih = input.nextInt();

    System.out.print("Muzik notunuz:");
    muzik = input.nextInt();

    double toplam = (mat + fizik + kimya + turkce + tarih + muzik);
    double ortalama = toplam/6;

    String gecmeDurumu = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

    System.out.println(gecmeDurumu);








    }
}
