package Week1.odev2.odev1;

import java.util.Scanner;

public class GeometrikHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Alanını hesaplamak istediğiniz şekli giriniz,1- Dikdortgen 2-Kare 3-Ucgen ");
        int sekil = input.nextInt();
        double sonuc= 0;


        switch (sekil) {
            case 1 :
                System.out.println("Dikdortgenin uzun ve kısa kenarını giriniz;");
                int kenar1 = input.nextInt();
                int kenar2 = input.nextInt();
                sonuc = kenar1 * kenar2;
            break;
            case 2:
                System.out.println("Karenin kenarını giriniz;");
                int kenar = input.nextInt();
                sonuc = kenar * kenar;
            break;
            case 3:
                System.out.println("Ucgenin Tabanını ve yuksekligini giriniz;");
                int taban= input.nextInt();
                int yukseklik = input.nextInt();
                sonuc = taban * yukseklik;
        }

        System.out.println("Sonucunuz:" + sonuc);
    }
}
