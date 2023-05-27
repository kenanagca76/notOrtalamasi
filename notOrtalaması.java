package Pratik;

import java.util.Scanner;

public class notOrtalama {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat,fizik,kimya,turkce,tarih,muzik;
        //scanner sınıfımızı tanımladık
        Scanner inp=new Scanner(System.in);
        // kulanıcıdan degerlri al
        System.out.print("Matematik notunu giriniz : ");
        mat=inp.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya=inp.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih=inp.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        muzik=inp.nextInt();

        int toplamNot=(mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama=toplamNot/6.0;

        System.out.println("Girilen notların ortalaması :"+ortalama);
        System.out.println(ortalama < 60 ? "Maalesef Sınıfta Kaldınız :(" : "Tebrikler Sınıfı Geçtiniz");
    }

}
