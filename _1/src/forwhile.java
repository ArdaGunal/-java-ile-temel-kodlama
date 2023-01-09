import java.util.Scanner;
public class forwhile {
    public static void main(String[] args) {
        Scanner veri=new Scanner(System.in);
        int a;
        System.out.print("Bir değer giriniz ;");
        a = veri.nextInt();
       while (a >= 0){
           System.out.println(a);
           a--;
       }
       System.out.print("-------------");
       for(  int i = a; i<=10; i++){
           System.out.println(i);

       }


    }
}
