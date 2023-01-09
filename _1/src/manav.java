import java.util.Scanner;
public class manav {
    public static void main(String[] args){

     //elma=2,14 , armut= 3,67 ,domates= 1,11 ,muz=0,95 ,patlican=5
        double elma,armut,domates,muz,patlican;
        Scanner hesap = new Scanner(System.in);
        System.out.print("Kaç kg elma aldınız :");
        elma = hesap.nextDouble();

        System.out.print("Kaç kg armut aldınız :");
        armut = hesap.nextDouble();

        System.out.print("Kaç kg domates aldınız :");
        domates = hesap.nextDouble();

        System.out.print("Kaç kg muz aldınız :");
        muz = hesap.nextDouble();

        System.out.print("Kaç kg patlican aldınız :");
        patlican = hesap.nextDouble();

        double fiyat = armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
        System.out.println(fiyat);

    }
}
