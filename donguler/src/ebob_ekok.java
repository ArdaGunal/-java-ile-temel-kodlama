import java.util.Scanner;


public class ebob_ekok {
    public static void main(String[] args) {

        Scanner veri= new Scanner(System.in);

        System.out.print("İlk değeri giriniz :");
        int a = veri.nextInt();

        System.out.print("2. değeri giriniz :");
        int b =veri.nextInt();

        //ebob hesaplama

   int i=1;

   int d =1;
   int f=0;
   if(a>0 && b>0){

    while( i<=a &&i<=b){


        if(a%i ==0 && b%i==0){
        d++;
        f=i;
        }

        i++;

        }
   }

   else{
       System.out.print("Pozitif değerler giriniz.");
   }

        System.out.println("Ebob :"+f);
        i=1;


    //ekok hesaplama


     while (i<a*b){
         i++;

         if (i%a==0 && i%b==0){

           break;
         }
     }System.out.println("ekok :"+i);




    }
}
