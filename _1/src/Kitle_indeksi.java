import java.util.Scanner;
public class Kitle_indeksi {
    public static void main(String[] args){
double boy,kilo;
//kilo.boy.boy
        Scanner hesap= new Scanner(System.in);
        System.out.print("Kilonuzu giriniz(KG) :");
        kilo = hesap.nextDouble();

        System.out.print("Boyunuzu giriniz(m) :");
        boy =hesap.nextDouble();
        double endeks= kilo/(boy*boy);
        System.out.print(endeks);


if (endeks<= 18.5){
    System.out.print(":  Kilonuz normalin altında");
}
else if (endeks <= 24.9){
    System.out.print(":  Kilonuz normal");
}
else if (endeks>24.9){
    System.out.print(":  kilonuz normalin üstünde");
}
    }

}
