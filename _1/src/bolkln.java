// girilen değere kadar olan sayılar içinden 3 ile 4 de ortak bölünenlerin toplamını bulur.
import java.util.Scanner;
public class bolkln {
    public static void main(String[] args) {

        int a;
        int  say = 0;
        int ekle =0;
        int ort;
        int num=0;

        Scanner veri= new Scanner(System.in);

        System.out.print("Bir değer giriniz :");
        a= veri.nextInt();

        if(a>=0){

        for(int i =0;i<=a;i++){


             if(i%4==0 && i%3==0){
                  ekle += i;
                  say++;
                  num=i;

             }
        }
        ort = ekle/say;

        System.out.println("Ortalama :"+ ort+" Sayı adedi :" +say+ " Toplamın sonucu :"+ ekle +" Son Sayı :"+num);
        }else{
            System.out.print("Değer 0 dan küçük olamaz");
        }



    }
}
