//Kdv bulmaya yarar.

import java.util.Scanner;

public class kdv{
    public static void main(String[] args) {



        //%18 kdv tutarı hesapla
        double fiyat;
        Scanner veri = new Scanner(System.in);

        System.out.println("Ürünün fiyatı :");
        System.out.println(veri);
        fiyat = veri.nextDouble();

        //kdv tutarı
        if(fiyat<=1000) {
            double yfiyat = fiyat + fiyat * 18 / 100;
            System.out.print("Kdv'li fiyat  :");
            System.out.println(yfiyat);
            double kdv = fiyat * 18 / 100;
            System.out.print("Kdv tutarı :");
            System.out.print(kdv);
        }else if (fiyat>1000){
            double yfiyat = fiyat + fiyat * 8 / 100;
            System.out.print("Kdv'li fiyat  :");
            System.out.println(yfiyat);
            double kdv = fiyat * 8 / 100;
            System.out.print("Kdv tutarı :");
            System.out.print(kdv);
        }

//kdv 0-1000 arası %18  1000 ve fazlası %8
    }
}
