import java.util.Scanner;

public class cift_dort {
    public static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

         Scanner v1 = new Scanner(System.in);
         int a;
         int b=0;

         do{
             System.out.print("Bir sayı giriniz :");
             a= v1.nextInt();
             if ( a%4==0 && a%2==0){
             b+=a;}

         }while(a%2 == 0);
             System.out.println("Toplam :"+b);



    }
}
