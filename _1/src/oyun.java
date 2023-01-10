//sayı tahmin oyunu.(Daha da geliştireceğim)

import java.util.Random;
import java.util.Scanner;

public class oyun
{
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        Random rnd = new Random();
        int sayi;
        int sayi2;
        System.out.print("Tahmin oyunu için alt değeri giriniz :");
        sayi = veri.nextInt();
        System.out.print("Tahmin oyunu için üst değeri  giriniz :");
         sayi2= veri.nextInt();

    if(sayi>=0 && sayi2>=0){

        int b = rnd.nextInt(sayi2)+sayi;
        System.out.println(b);
        int a=0;

        while (a!=b){
            System.out.print("Tahmininizi giriniz  :");
            a=veri.nextInt();
            System.out.println(b);
        }if(a==b){
            System.out.print("kazandınız :"+b);
        }
    }else{
        System.out.print("0 dan küçük değer giremezsiniz.");
    }
    }
}
