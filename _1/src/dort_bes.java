//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
//4 ve 5 in ortak kuvvetlerini yazdırdım.

import java.util.Scanner;

public class dort_bes {
    public static void main(String[] args) {


        Scanner ver = new Scanner(System.in);
        int n;
        System.out.print("Bir sayı giriniz  ;");
        n = ver.nextInt();

        for(int i=1;i<n;i++){

            if(i%4==0 && i%5==0){
                System.out.println("4 ve 5 in ortak katları ;"+i);
            }

        }

    }
}
