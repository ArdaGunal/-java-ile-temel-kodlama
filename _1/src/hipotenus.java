//Hipotenüs hesaplamaya yarar.

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args){
        //a^2+b^2=c^2 hesapla
        double akenari,bkenari,ckenari;
        Scanner veri1 =new Scanner(System.in);

        System.out.print("A kenarını giriniz ;");
        akenari = veri1.nextDouble();

        System.out.print("B kenarını giriniz ;");
        bkenari = veri1.nextDouble();

        //hesaplama
        ckenari=Math.sqrt(akenari*akenari+bkenari*bkenari);
        System.out.println("hipotenüs :"+ckenari);
    }

}
