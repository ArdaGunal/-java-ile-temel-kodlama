import java.util.Scanner;

public class uslu_sayi {
    public static void main(String[] args) {
        int a,b,c;
        Scanner veri =new Scanner(System.in);

        System.out.print("Üssü alıcanak sayı :");
        a =veri.nextInt();
        System.out.print("Üs :");
        b = veri.nextInt();
        // a^b = a*a*a... b tane
         c=a;

        for(int i =1;i<b; i++){
            a=a*c;
        }
        System.out.println("Cevap :"+a);

    }
}
