import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        //tanımla
        double v1,v2;
        int sec;
       //değerleri ekrana yazdır
        Scanner veri = new Scanner(System.in);
        System.out.print("1. değeri giriniz  :");
        v1 = veri.nextDouble();
        System.out.print("2. değeri giriniz  :");
        v2 = veri.nextDouble();

        // hesap makinesi yapımı

System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
System.out.println("Seçeneklerden birini seçiniz :");
sec = veri.nextInt();


switch (sec){
    case 1:
        System.out.print("sonuç  :" + (v1+v2) );
        break;
    case 2:
        System.out.print("sonuç  :" + (v1-v2));
        break;
    case 3:
        System.out.print("sonuç  :" + (v1*v2));
        break;
    case 4:
        System.out.print((v2==0) ? "payda 0 olamaz ": "sonuç  :" + (v1/v2));
        break;
    default:
        System.out.print("Bir hata oluştu.");
        break;
}


    }
}