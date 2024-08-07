import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {

        String userName, password;
        String sifre = "321Java654";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("Java101") && password.equals(sifre)){
            System.out.print("Başarıyla giriş yaptınız!");
        }
        else {
            System.out.println("Bilgileriniz yanlış!");

            System.out.println("Şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
            String cevap = input.nextLine();

            if (cevap.equals("evet")) {
                String yeniSifre;

                do {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    yeniSifre = input.nextLine();

                    if (yeniSifre.equals(sifre)) {
                        System.out.println("Yeni şifreniz bir önceki şifrenizle aynı olamaz. Lütfen tekrar deneyiniz.");
                    }

                } while (yeniSifre.equals(sifre));

                sifre = yeniSifre;
                System.out.print("Yeni şifre oluşturuldu.");
            }else{
                System.out.print("Şifre sıfırlama işlemi iptal edildi.");

                }
            }
        }
}

