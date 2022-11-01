
package patika.ucgenhipotenus;

import java.util.Scanner;

/**
 *
 * @author nur
 */
public class UcgenHipotenus {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aKenar,bKenar;
        double hipotenus;
        System.out.print("A Kenarını Giriniz : ");
        aKenar=input.nextInt();
        System.out.print("B Kenarını Giriniz : ");
        bKenar=input.nextInt();
        
        hipotenus=Math.sqrt((aKenar*aKenar)+(bKenar*bKenar));
        System.out.println("Hipotenüs : " + hipotenus);
        
    }
}
