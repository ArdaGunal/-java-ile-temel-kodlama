import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {


        int n;
        int r;
        int toplam =1;
        int t2 =1;
        Scanner vri  = new Scanner(System.in);

        System.out.print("n  değerini giriniz :");
        n = vri.nextInt();

     System.out.print("r değeri giriniz :");
      r = vri.nextInt();

        for(int i=1;i<=n;i++){

           toplam =toplam*i;


        }
        for(int b=1;b<=r;b++){

            t2 =t2*b;


        }

        //sonuç
        double sonuc = (toplam)/(t2*(n-r));
        System.out.print(n+" sayısının "+r+" sayılı kombinasyonu ;"+ sonuc);



    }
}
