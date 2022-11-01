

package patika.manavkasa;

import java.util.Scanner;

/**
 *
 * @author nur
 */

public class ManavKasa {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float armutkilo = 2.14f, armut, elmakilo = 3.67f, elma, domateskilo=1.11f, domates, muzkilo=0.95f, muz, patlicankilo=5.0f ,patlican, ucret;
        System.out.print("Armut Kilo ? ");
        armut = input.nextFloat();
        System.out.print("Elma Kilo ? ");
        elma=input.nextFloat();
        System.out.print("Domates Kilo ? ");
        domates=input.nextFloat();
        System.out.print("Muz Kilo ? ");
        muz=input.nextFloat();
        System.out.print("Patlıcan Kilo ? ");
        patlican=input.nextFloat();
        
        ucret = (armut*armutkilo)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo);
        System.out.print("Toplam Tutar : " + ucret);
        
        
        
    }
}
