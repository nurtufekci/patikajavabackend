
package patika.dairealanalfa;

import java.util.Scanner;

/**
 *
 * @author nur
 */
public class DaireAlanAlfa {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double yaricap, pi=3.14, alfa;
        
        
        System.out.print("Dairenizin Yarıçapı :  ");
        yaricap=input.nextDouble();
        
        System.out.print("Dairenizin Açısı : ");
        alfa=input.nextDouble();
        
        boolean acikosul= 0<=alfa && alfa<=360;
        String sonuc = acikosul? "Daire Diliminin Alanı :  " + (pi*(yaricap*yaricap)*alfa)/360 + " br2"  : "  Açınız  0 ile 360 derece arasında olmalıdır. ";
        System.out.println(sonuc);
        
        
    }
}
