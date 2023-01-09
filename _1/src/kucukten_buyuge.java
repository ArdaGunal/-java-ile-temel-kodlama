import java.util.Scanner;
public class kucukten_buyuge {
    public static void main(String[] args){
        Scanner veri =new Scanner(System.in);
        double a,b,c;
        System.out.print(" a sayısını giriniz  ;");
        a= veri.nextDouble();

        System.out.print(" b sayısını giriniz  ;");
        b= veri.nextDouble();

        System.out.print(" c sayısını giriniz  ;");
        c= veri.nextDouble();

        if ((a<b)&&(a<c)){
            if(b<c){
                System.out.print("a<b<c");
            }else{
                System.out.print("a<c<b");
            }


        }else if((c<b)&&(c<a)){
            if(b<a){
                System.out.print("c<b<a");
            }else{
                System.out.print("c<a<b");
            }
        }else{
            if((b<a)&&(b<c)){
               if(c<a){
                        System.out.print("b<c<a");}
               else{
                   System.out.print("b<a<c");
               }



            }
        }



    }
}
