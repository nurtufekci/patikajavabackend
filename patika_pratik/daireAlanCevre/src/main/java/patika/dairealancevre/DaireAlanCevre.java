
package patika.dairealancevre;

import java.util.Scanner;

/**
 *
 * @author nur
 *
 */

public class DaireAlanCevre {

    public static void main(String[] args) {
        int yaricap;
        double alan, cevre, pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenizin Yarıçapı :  ");
        yaricap=input.nextInt();
        alan=pi*yaricap*yaricap;
        cevre = 2*pi*yaricap;
        System.out.println("Dairenizin Alanı : " + alan);
        System.out.println("Çevrenizin Alanı : " + cevre);
        
    }
}
