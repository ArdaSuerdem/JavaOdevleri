import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float kullanimmiktari,vergi,odeme;

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.FRANCE);
        System.out.println("Kullanım miktarınızı giriniz: ");
        float a = scan.nextFloat();

        if (a>100) vergi= (a*5)/100;
        else if (a>300) vergi = (a * 10) / 100;
        else {
            vergi= (a*15)/100;
        }

        odeme= a+vergi;
        System.out.println("Vergi öncesi tutar: " + a);
        System.out.println("Vergi: " + vergi);
        System.out.println("Ödemeniz gereken toplam miktar: " + odeme +" TL");

    }

}