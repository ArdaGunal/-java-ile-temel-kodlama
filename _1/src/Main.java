import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   //tanımla
        double mat,fiz , kimya , bio , tur;
        //başla
   Scanner veri = new Scanner(System.in);
//dersleri yaz
        System.out.print("Fizik notunuz : ");
        fiz = veri.nextDouble();

        System.out.print("Matematik notunu :");
           mat = veri.nextDouble();

           System.out.print("Kimya notunuz:  ");
           kimya = veri.nextDouble();

           System.out.print("Biyoloji notunuz :");
                   bio = veri.nextDouble();
              System.out.print("Türkçe notunuz :");
              tur = veri.nextDouble();
double toplam = mat+fiz+kimya+bio+tur;
double ortalama = toplam /5;
System.out.print("Ders Ortalaması :");
System.out.print(ortalama);
//geçti geçmedi uygulamasını yap



        double a = 50;
        boolean kosul1 = ortalama >= a;
        String srt = kosul1  ?" ;Geçti" :"Kaldı";
        System.out.print(srt);




    }
}