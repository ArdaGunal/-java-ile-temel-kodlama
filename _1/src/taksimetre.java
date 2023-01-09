import java.util.Scanner;
public class taksimetre {

    public static void main(String[] args) {

        double km;
        Scanner yazi = new Scanner(System.in);
        System.out.print("Kaç km yıl gideceksiniz :");
        km = yazi.nextDouble();

        double a = km*0.20;
        double b =20;

       double fiyat = (km * 0.20>20) ? a+10 : b;
       System.out.print("Ücretiniz :" + fiyat);


    }
}
