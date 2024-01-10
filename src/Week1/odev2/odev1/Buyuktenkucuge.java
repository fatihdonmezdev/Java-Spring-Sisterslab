package Week1.odev2.odev1;

import java.util.Arrays;
import java.util.Scanner;

public class Buyuktenkucuge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Bir sayı daha giriniz");
        int sayi2 = input.nextInt();

        System.out.println("Bir sayı daha giriniz");
        int sayi3 = input.nextInt();

        int[] siraliSayilar = {sayi1, sayi2, sayi3};
        Arrays.sort(siraliSayilar);
        System.out.println("Girdiğiniz Sayıların Sıralanışı: " + siraliSayilar[2] + ", " + siraliSayilar[1] + ", " + siraliSayilar[0]);


    }
}
