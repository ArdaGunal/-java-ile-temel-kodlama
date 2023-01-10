//Girilen yıla göre Çin zodyağı burcunuzu söyler.

import java.util.Scanner;

public class cin_zodyagı {
    public static void main(String[] args){
        Scanner veri = new Scanner(System.in);

        int yil;
        String burc=  " ";
        System.out.print("Doğdunuz yılı giriniz :");
        yil=veri.nextInt();

        if( yil %12==0)
        {
           burc= "Maymun";
        }
        else if (yil%12==1) {
            burc="Horoz";
        }
        else if (yil%12==2){
            burc="Köpek";
        }
        else if (yil%12==3){
            burc="Domuz";
        }
        else if (yil%12==4){
            burc= "Fare";
        }
        else if (yil%12==5){
            burc="Öküz";
        }
        else if (yil%12==6){
            burc="Kaplan";
        }
        else if (yil%12==7){
            burc="Tavşan";
        }
        else if (yil % 12 == 8){
            burc="Ejderha";
        }
        else if (yil % 12== 9){
            burc="Yılan";
        }
        else if (yil % 12 == 10){
            burc="At";
        }
        else if (yil % 12== 11){
            burc="Koyun";
        }

        System.out.print("Çin Zodyağı Burcunuz :" + burc);

    }
}
