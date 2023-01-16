import java.util.Scanner;
public class basamak_top {
    public static void main(String[] args) {
        int a;
        int bs=0;
        int sum =0;
        Scanner veri= new Scanner(System.in);
        System.out.print("Bir değer giriniz :");
        a = veri.nextInt();

        //345 3+4+5

        while(a!=0){
            bs =a%10;
            a/=10;
            sum += bs;

        }
        System.out.println(sum);


    }
}