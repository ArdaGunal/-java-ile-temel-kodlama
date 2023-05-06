
import java.util.Scanner;

public class mukemmel_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();
        int b=0;


        System.out.println(sayi + " sayısının pozitif tam bölenleri: ");

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(i + " ");
                b+=i;


            }
    }if (b==sayi){
            System.out.print(sayi+" Mükemmel bir sayıdır");
        }else{
            System.out.print(sayi+" Mükemmel sayı değildir.");
        }


}}
