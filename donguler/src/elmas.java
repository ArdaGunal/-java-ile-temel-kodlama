import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        int a;
        String bosluk =" ";
        String sekil = "*";


        System.out.print("Bir sayı giriniz :");
        a=veri.nextInt();

        for(int i=1;i<=a;i++){

            for(int k=a-1;i<=k;k--){
                System.out.print(bosluk);
            }
            for(int n=1;n<=2*i-1;n++){
                System.out.print(sekil);
            }
            for(int k=a-1;i<=k;k--){
                System.out.print(bosluk);
            }
            System.out.println();
        }

        //
        for(int i=a;i>1;i--){

            for(int k=a-i+1;k>=1;k--){
                System.out.print(bosluk);
            }
            for(int n=1;n<=2*i-3;n++){
                System.out.print(sekil);
            }
            for(int k=a-i+1;k>=1;k--){
                System.out.print(bosluk);
            }
            System.out.println();
        }


    }
}
