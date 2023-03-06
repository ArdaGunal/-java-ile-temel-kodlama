import java.util.Scanner;


public class ebob_ekok {
    public static void main(String[] args) {

        Scanner veri= new Scanner(System.in);

        System.out.print("İlk değeri giriniz :");
        int a = veri.nextInt();

        System.out.print("2. değeri giriniz :");
        int b =veri.nextInt();



   int i=1;

   int d =1;
   int f=0;
   if(a>0 && b>0){

    while( i<=a &&i<=b){


        if(a%i ==0 && b%i==0){
        System.out.println(d+". Bölen :"+i);
        d++;
        f=i;
        }

        i++;

        }
   }

   else{
       System.out.print("Pozitif değerler giriniz.");
   }

        System.out.print("Ebob ;"+f);



    }
}
