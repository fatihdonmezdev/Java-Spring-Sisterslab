package Week1.odev2.odev1;

import java.util.Scanner;

public class odev3 {
    public  static  void main(String[] args) {
// 90-100 arasi AA, 80-89 arasi BA, 70-79 arasi BB, 60-69 arasi CB, 50-59 arasi CC, 0-50 arasi FF)
        Scanner input = new Scanner(System.in);
        System.out.println("Hesaplanacak vize notunuzu giriniz;");
        int vize = input.nextInt();
        System.out.println("Hesaplanacak final notunuzu giriniz;");
        int finalNotu = input.nextInt();
        double ortalama = (vize * 0.20) + (finalNotu * 0.80);
        String not;
        if(ortalama<=100 && ortalama>=90){
            not = "AA";
        }else if(ortalama<90 && ortalama>=80){
            not = "BA";
        }else if(ortalama<80 && ortalama>=70){
            not = "BB";
        }else if(ortalama<70 && ortalama>=60){
            not = "CB";
        }else if(ortalama<60 && ortalama>=50){
            not = "CC";
        }else if(ortalama < 50 && ortalama>=0){
            not = "FF";
        }else{
            not = "Bir sorun oluştu!";
        }
        if(!not.equals("Bir sorun oluştu!")){
            System.out.println("Ortalamaniz;" + ortalama);
            System.out.println("Ortalamanizin Harfle belirtimi;" + not);
        }else{
            System.out.println("Bir sorun oluştu!");
        }
    }
}
