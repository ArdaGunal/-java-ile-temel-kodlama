import java.util.Scanner;

public class gelismis_not {
    public static void main(String[] args) {
        double mat, fiz, tur, kim, muz;
        Scanner ort =new Scanner(System.in);

        System.out.print("Matematik notunuz  :");
        mat = ort.nextDouble();
        while((mat<0) || (mat>100)) {
            System.out.println("o ile 100 arasında değer giriniz!!");
            System.out.print("Matematik notunuz  :");
            mat = ort.nextDouble();
        }



        System.out.print("Fizik notunuz  :");
        fiz = ort.nextDouble();
        while((fiz<0) || (fiz>100)) {
            System.out.println("o ile 100 arasında değer giriniz!!");
            System.out.print("Fizik notunuz  :");
            fiz = ort.nextDouble();
        }


        System.out.print("Türkçe notunuz  :");
        tur = ort.nextDouble();
        while((tur<0) || (tur>100)) {
            System.out.println("o ile 100 arasında değer giriniz!!");
            System.out.print("Türkçe notunuz  :");
            tur = ort.nextDouble();
        }


        System.out.print("Kimya notunuz  :");
        kim = ort.nextDouble();
        while((kim<0) || (kim>100)) {
            System.out.println("o ile 100 arasında değer giriniz!!");
            System.out.print("Kimya notunuz  :");
            kim = ort.nextDouble();
        }

        System.out.print("Müzik notunuz  :");
        muz = ort.nextDouble();

        while ((muz<0) || (muz>100)) {
            System.out.println("o ile 100 arasında değer giriniz!!");
            System.out.print("Müzik notunuz  :");
            muz = ort.nextDouble();
        }





        double avarage = (mat+ fiz+ tur+kim+ muz)/5;
        if (avarage>=55){
            System.out.println("Tebrikler sınıfı geçtiniz");
        }else {
           System.out.println("Kaldınız");
        }
        System.out.print("Not ortalamanız  :"+ avarage);

    }
}
