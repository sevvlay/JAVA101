import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi giriniz (KM): ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipi giriniz (1-Tek Yön, 2-Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();


        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)){
            System.out.print("Hatalı Veri Giriniz!");
            return;
        }

        double indirim = 0;
        double indirimliTutar;
        double gidisGelisIndirimi;

        double normalTutar = mesafe * 0.10;

        System.out.print("Uçuşun Tutarı: "+ normalTutar);


            if(yas < 12) {
                indirim = normalTutar * 0.50;
            }else if (yas <= 24){
                indirim = normalTutar * 0.10;
            }else if (yas >= 65){
                indirim = normalTutar * 0.30;
            }
            indirimliTutar = normalTutar - indirim;
            if (yolculukTipi == 2){
                gidisGelisIndirimi = normalTutar * 0.20;
                indirimliTutar -= gidisGelisIndirimi;
            }

        System.out.println("\nToplam Tutar = " + indirimliTutar);
        }

    }



