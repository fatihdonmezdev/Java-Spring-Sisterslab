package Week1.odev2.odev1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayıyı giriniz.");
        int sayi1 = input.nextInt();
        System.out.println("İkinci Sayıyı giriniz.");
        int sayi2 = input.nextInt();
        System.out.println("Yapılacak İşlemi Tuşlayınız. 1-Toplama 2-Cikartma 3-Çarpma 4-Bölme");
        int islem = input.nextInt();
        double sonuc = 0;
        if(islem == 1){
            sonuc = sayi1 + sayi2;
        }else if(islem == 2){
            sonuc = sayi1 - sayi2;
        }else if(islem == 3){
            sonuc = sayi1 * sayi2;
        }else if(islem == 4){
            sonuc = sayi1 / sayi2;
        }
        System.out.println("Sonucunuz:" + sonuc);
    }
}
