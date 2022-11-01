
package patika.kdvtutar;

import java.util.Scanner;

/**
 *
 * @author nur
 */


public class KdvTutar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double fiyat,kdvOran1=0.18,kdvOran2=0.08,kdvliFiyat;
        System.out.print("Fiyat Giriniz : ");
        fiyat=input.nextDouble();
        
        boolean fiyatkosul=fiyat<1000;
        kdvliFiyat=fiyatkosul ? (fiyat*kdvOran1 + fiyat) : (fiyat*kdvOran2 + fiyat);
        String sonuc = fiyatkosul? "KDV Oran : %18 \n KDVli Fiyat : " + kdvliFiyat + " TL" : "KDV Oran :%8 \nKDV'li Fiyat : " + kdvliFiyat + "TL";
        System.out.println(sonuc);
       
        
       /* if (0<fiyat && fiyat<1000)
        {
            kdvOran=0.18;
            fiyat=fiyat+(fiyat*kdvOran);
            System.out.println("KDV Oran :%18 \nKDV'li Fiyat : " + fiyat + "TL");
        }
        else
            {
                kdvOran=0.08;
                fiyat=fiyat+(fiyat*kdvOran);
                System.out.println("KDV Oran :%8 \nKDV'li Fiyat : " + fiyat + "TL");
            }*/
  } 
}
