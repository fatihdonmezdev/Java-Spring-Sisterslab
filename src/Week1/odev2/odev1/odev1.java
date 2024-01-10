package Week1.odev2.odev1;

import java.util.Scanner;

public class odev1 {
    public  static  void main(String[] args){
        double kdv = 0.30;
        Scanner input = new Scanner(System.in);
        System.out.println("KDVsini hesaplatmak istediğiniz ürünü giriniz.");
        double sayi1 = input.nextInt();
        double kdvMiktari = sayi1 * kdv;
        System.out.println("Ürünün KDVsiz fiyatı: " +sayi1);
        System.out.println("Ürünün KDVli fiyatı: " + (sayi1 + kdvMiktari));
        System.out.println("Ürüne uygulanan KDV miktarı: " + kdvMiktari);


    }

}
