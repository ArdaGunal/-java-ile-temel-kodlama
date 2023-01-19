import java.util.Scanner;
public class yildiz {
    public static void main(String[] args) {
        Scanner veri =new Scanner(System.in);

        String sekil = "*";
        String bosluk = " ";
        int b;


        System.out.print("Bir değer giriniz :");
        b=veri.nextInt();

        for(int i=1;i<=b;i++){


            for(int k=b;i<=k;k--){
              System.out.print(bosluk);
            }


            for(int n=1;n<=2*i-1;n++){

              System.out.print(sekil);
            }
            System.out.println(bosluk);

        }




    }
}
