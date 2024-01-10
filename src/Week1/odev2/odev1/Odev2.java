package Week1.odev2.odev1;

import java.util.Scanner;

public class Odev2 {
    public  static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("KDVsini hesaplatmak istediğiniz ürünü giriniz.");
        double sayi1 = input.nextInt();
        double kdv;
        if(sayi1>1000){
            kdv = 0.22;
        }else{
            kdv=0.10;
        }
        double kdvMiktari = sayi1 * kdv;
        System.out.println("Ürünün KDVsiz fiyatı: " +sayi1);
        System.out.println("Ürüne uygulanan KDV Miktari: " + "%" + (kdv*100));
        System.out.println("Ürünün KDVli fiyatı: " + (sayi1 + kdvMiktari));
        System.out.println("Ürüne uygulanan KDV miktarı: " + kdvMiktari);


    }
}
