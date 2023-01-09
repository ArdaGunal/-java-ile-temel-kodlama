import java.util.Scanner;

public class artik_yil {
    public static void main(String[] args){
        Scanner veri = new Scanner(System.in);

        int yil;
        System.out.print("Artık yıl hesaplamak için veri giriniz  :");
        yil= veri.nextInt();

        if (yil %4 ==0) {
            if(yil % 100 == 0){
                if(yil % 400 ==0){
                    System.out.print(yil + " Artık yıl");
                }else
                {System.out.print(yil + " Artık yıl değildir");}

            }else{
                System.out.print(yil + " Artık yıldır");
            }

        }else{
            System.out.print(yil + " Artık yıl değildir");
        }





    }
}
