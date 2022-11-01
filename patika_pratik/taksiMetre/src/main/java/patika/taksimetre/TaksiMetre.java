
package patika.taksimetre;

import java.util.Scanner;

/**
 *
 * @author nur
 */
/* Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
public class TaksiMetre {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int km;
        double kmtutar=2.20, ucret=10;
        
        System.out.println("Kaç Kilometre Gidildi ? ");
        km=input.nextInt();
        ucret+= km*kmtutar;
        
        ucret = ucret < 20 ? 20 :  ucret;
        
        System.out.println("Ücret : " + ucret);
       
    }
}
