import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        double r;
        Scanner veri = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz :");
        r = veri.nextDouble();
        double alan = r*r*3.14;
        double cevre = r*2*3.14;
        double d = (3.14*(r*r)*alan)/360;

        System.out.println("Alan :"+alan);
        System.out.println("Çevre :"+ cevre);
        System.out.println("Daire diliminin Alanı :" + d);

    }
}
