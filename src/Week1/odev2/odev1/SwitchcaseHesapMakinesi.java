package Week1.odev2.odev1;

import java.util.Scanner;

public class SwitchcaseHesapMakinesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı giriniz.");
        int sayi1 = input.nextInt();
        System.out.println("İkinci Sayıyı giriniz.");
        int sayi2 = input.nextInt();
        System.out.println("Yapılacak İşlemi Tuşlayınız. 1-Toplama 2-Cikartma 3-Çarpma 4-Bölme");
        int islem = input.nextInt();
        double sonuc = switch (islem) {
            case 1 -> sayi1 + sayi2;
            case 2 -> sayi1 - sayi2;
            case 3 -> sayi1 * sayi2;
            case 4 -> (double) sayi1 / sayi2;
            default -> 0;
        };

        System.out.println("Sonucunuz:" + sonuc);
    }
}
