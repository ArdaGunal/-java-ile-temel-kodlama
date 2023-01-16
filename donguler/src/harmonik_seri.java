import java.util.Scanner;

public class harmonik_seri {
    public static void main(String[] args) {
        Scanner veri= new Scanner(System.in);
        int n;
       double toplam = 0;

        System.out.print("Bir sayı giriniz :");
        n =veri.nextInt();

        for(double i=1 ; i<=n;i++){

            toplam += 1/i;

        }
        System.out.print(toplam);




    }
}
