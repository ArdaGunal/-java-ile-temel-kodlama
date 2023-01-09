import java.util.Scanner;
public class etkinlik_oner {
    public static void main(String[] args){
        Scanner veri =new Scanner(System.in);
        double derece;
        System.out.print("Hava kaç derece  :");
        derece=veri.nextDouble();

        if(derece<5){
            System.out.print("Kayak yapabilirsiniz.");
        }else if(derece>=5 && derece<15){
            System.out.print("Sinemaya gidebilirsiniz");

        }else if(derece>15 && derece<=25){
            System.out.print("piknike gidebilirsiniz.");
        }else{
            System.out.print("Yüzmeye gidebilirsiniz");
        }



    }
}
