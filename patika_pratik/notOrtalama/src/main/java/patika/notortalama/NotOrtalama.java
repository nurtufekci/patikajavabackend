
package patika.notortalama;

import java.util.Scanner;

/**
 *
 * @author nur
 */

public class NotOrtalama {

    public static void main(String[] args) {
        
        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Matematik Notunuzu Giriniz : ");
        matematik=input.nextInt();
        
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik=input.nextInt();
        
        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya=input.nextInt();
        
        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce=input.nextInt();
        
        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih=input.nextInt();
        
        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik=input.nextInt();
        
        float ortalama= (matematik+fizik+kimya+turkce+tarih+muzik)/6.0f;
        System.out.println("Not Ortalamanız : " + ortalama);
        
        
        boolean kosul = ortalama >60;
        String sonuc = kosul ? " Sınıfı Geçtiniz " : " Sınıfta Kaldınız "; 
        System.out.println(sonuc);
       
    }
}
