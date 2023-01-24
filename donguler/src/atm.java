import java.util.Scanner;
public class atm {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        String ad,sifre;

        int bakiye =1500;
        int hak=3;
        int sec;
        int para;

        while (hak!=0){
            System.out.print("Lütfen Adınızı giriniz :");
                    ad = veri.nextLine();
            System.out.print("Lütfen Şifrenizi giriniz :");
            sifre = veri.nextLine();
            if(ad.equals("a")&&sifre.equals("1")){
                System.out.println("Sisteme girdiniz.Yapacağınız işlemi seçiniz");

                do{ System.out.println(
                        "1-Para Yatırma \n" +
                                "2-Para Çekme\n" +
                                "3-Bakiye Sorgulama\n" +
                                "4-Çıkış");
                System.out.print("İşlemi seçiniz ;");
                sec=veri.nextInt();

                   switch (sec) {
                       case 1:
                           System.out.print("Yatırmak istediğiniz tutarı giriniz :");
                           para = veri.nextInt();
                           bakiye += para;
                           System.out.println("Bakiyeniz :"+bakiye);
                           break;
                       case 2:

                           System.out.print("Çekmek istediğiniz tutarı giriniz :");
                           para = veri.nextInt();
                           if (para>bakiye){
                               System.out.println("Hesabınızın bakiyesi yetersiz");
                           }else{
                               bakiye -= para;
                           }System.out.println("Bakiyeniz :"+bakiye);
                           break;
                       case 3:
                           System.out.println("Bakiyeniz :"+bakiye);

                           break;
                   }}
                    while (sec!=4);{
                        System.out.print("Sistemden çıktınız görüşmek üzere");
                    }



                break;
            }else{
                hak--;
                System.out.println("Hatalı kullanıcı adı ya da şifre kalan hak :"+ hak);
            }


        }if (hak==0) {
            System.out.print("Hesabınız bloke olmuştur.XXX Bankası ile iletişime geçiniz");}





    }
}
