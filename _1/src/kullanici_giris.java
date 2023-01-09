import  java.util.Scanner;

public class kullanici_giris {
    public static void main(String[] args){

        Scanner veri = new Scanner(System.in);
        String kullaniciAdi,sifre,sifirla,ysifre;
        System.out.print("Kullanıcı adınızı giriniz  :");
       kullaniciAdi= veri.nextLine();
       System.out.print("Şifrenizi giriniz  :");
       sifre=veri.nextLine();


       if(kullaniciAdi.equals("Patika")&& (sifre.equals("kodlama"))){
System.out.print("Giriş yaptınız");

       }
else{
           System.out.print("Giriş yapamadınız.Şifrenizi sıfırlamak için yeni yazınız  :");
           sifirla= veri.nextLine();
           if (sifirla.equals("yeni")){
               System.out.print("yeni şifrenizi giriniz  :");
               ysifre=veri.nextLine();
               System.out.print((ysifre.equals("kodlama"))? "Şifre oluşturulamadı, lütfen başka şifre giriniz." : "Şifre oluşturuldu");

           }else{ System.out.print("Giriş yapamadınız.  :");

           }
       }

  }
    }
