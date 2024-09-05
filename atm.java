import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        int right = 3;
        int balance = 2000;
        int select;
        boolean finish = false;

        while (right > 0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if (userName.equals("patika101") && password.equals("123654")){
                System.out.print("Merhaba, sisteme giriş yaptınız.");
                do {
                    System.out.println("\nLütfen bir işlem seçiniz:");
                    System.out.println("1 - Para Yatırma");
                    System.out.println("2 - Para Çekme");
                    System.out.println("3 - Bakiye Sorgulama");
                    System.out.println("4 - Çıkış Yap");
                    System.out.print("Seçiminiz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutar: ");
                            int price = input.nextInt();
                            if (price>0){
                                balance += price;
                                System.out.println("Hesabınıza " + price + " TL Yatırdınız.");
                                System.out.print("Yeni tutar: " + balance + " TL");
                            }else{
                                System.out.print("Geçersiz bir tutar girdiniz.");
                            }
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutar: ");
                            int withdraw = input.nextInt();
                            if (withdraw>0 && withdraw<=balance){
                                balance -= withdraw;
                                System.out.println("Hesabınızdan " + withdraw + " TL çektiniz.");
                                System.out.print("Kalan Tutar: " + balance + " TL");
                            }else if (withdraw>balance){
                                System.out.println("Yetersiz Bakiye! Mevcut Bakiyenizi Kontrol ediniz.");
                            }else{
                                System.out.println("Geçersiz bir tutar giriniz.");
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz: " + balance + " TL");
                            break;
                        case 4:
                            System.out.print("Çıkış Yapılıyor...");
                            finish = true;
                            break;
                        default:
                            System.out.print("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyiniz.");
                    }

                }while (!finish);
                break;

            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı ya da şifre!");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan Hakkınız: " + right);
                }

            }
        }
    }
}
