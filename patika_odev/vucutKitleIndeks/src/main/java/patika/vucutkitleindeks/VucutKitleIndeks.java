
package patika.vucutkitleindeks;

import java.util.Scanner;

/**
 *
 * @author nur
 */
public class VucutKitleIndeks {

    public static void main(String[] args) {
        double kilo, boy,indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :  ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg cinsinden) giriniz :  ");
        kilo=input.nextDouble();
        
        indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksi'niz : " + indeks);
        
    }
}
