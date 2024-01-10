package Week1.odev2.odev1;

import java.util.Scanner;

public class tekcift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = input.nextInt();
        System.out.println((sayi % 2 == 0)? "Girdiginiz sayi bir çift sayı": "Girdiginiz sayı bir tek sayı" );
    }
    }
