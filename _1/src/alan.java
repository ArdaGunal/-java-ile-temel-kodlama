//Hipotenüs hesaplamaya yarar.

import java.text.NumberFormat.Style;
import java.util.Scanner;

public class alan {
    public static void main(String[] args){
        //a^2+b^2=c^2 hesapla
        double akenari,bkenari,ckenari;
        Scanner veri1 =new Scanner(System.in);

        System.out.print("A kenarını giriniz ;");
        akenari = veri1.nextDouble();

        System.out.print("B kenarını giriniz ;");
        bkenari = veri1.nextDouble();

        System.out.print("C kenarını giriniz  ;");
        ckenari = veri1.nextDouble();
         
        double u =(akenari+bkenari+ckenari)/2;

        double alan= Math.sqrt(u*(u-akenari)*(u-bkenari)*(u-ckenari));
        System.out.println("Üçgenin alanı  ;"+alan);
    }

}
