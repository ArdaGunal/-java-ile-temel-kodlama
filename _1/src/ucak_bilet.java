import java.util.Scanner;
public class ucak_bilet {
    public static void main(String[] args){
       double yas,tip,km;
       Scanner veri= new Scanner(System.in);

       System.out.print("Mesafeyi KM cinsinden giriniz  ;");
       km= veri.nextDouble();

       System.out.print("Yaşınızı giriniz  :");
       yas = veri.nextDouble();

       System.out.print("Yolculuk tipinizi seçiniz.");
       System.out.print(" 1==> Tek yön ,  2 ==> Gidiş Dönüş  :");
       tip = veri.nextDouble();

       double fiyat = km*0.1;


       if (fiyat <0||yas<0){
           System.out.print("Hatalı veri girdiniz.");
       }else {


           if (tip == 1) {

               if (yas < 12) {
                   System.out.print("Fiyat :" + fiyat * 50 / 100 + " TL");

               } else if (yas < 24) {
                   System.out.print("Fiyat :" + fiyat * 90 / 100 + " TL");
               } else if (yas > 65) {
                   System.out.print("Fiyat" + fiyat * 70 / 100  + " TL");
               } else {
                   System.out.print(fiyat + " TL");
               }


           } else if (tip == 2) {

               double indirim = 2 * fiyat * 80 / 100;

               if (yas < 12) {
                   System.out.print("Fiyat :" + indirim * 50 / 100  + " TL") ;

               } else if (yas < 24) {
                   System.out.print("Fiyat :" + indirim * 90 / 100 + " TL");
               } else if (yas > 65) {
                   System.out.print("Fiyat" + indirim * 70 / 100  + " TL");
               } else {
                   System.out.print(indirim + " TL");
               }


           } else {
               System.out.print("Hatalı veri girdiniz.");
           }
       }



    }
}
