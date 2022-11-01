
package patika.ucgenalan;

import java.util.Scanner;

/**
 *
 * @author nur
 */
public class UcgenAlan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a,b,c,ucgencevre,x;
        double ucgenalan;
        System.out.println("Sırasıyla A, B ve C Kenarlarının Uzunluklarını Giriniz");
        System.out.print("A Kenar : ");
        a=input.nextInt();
        System.out.print("B Kenar : ");
        b=input.nextInt();
        System.out.print("C Kenar : ");
        c=input.nextInt();
        
         boolean ucgenkosul=((a+b>c)&&(a+c>b)&&(b+c>a)) ; 
         ucgencevre=a+b+c;
         x=ucgencevre/2;
         ucgenalan=Math.sqrt(x*(x - a)*(x - b)*(x - c));
         String sonuc = ucgenkosul ? "Üçgeninizin Çevresi : " +ucgencevre+ " cm" +"\nÜçgeninizin Alanı :" + ucgenalan + " cm2 " : "Kenarlarınız bir üçgen oluşturmamaktadır.";
        
                System.out.println(sonuc);
                
                
                
        /*if((a+b>c) && (a+c>b) && (b+c>a))
        {
            ucgencevre=a+b+c;
            x=ucgencevre/2;
            ucgenalan=Math.sqrt(x*(x - a)*(x - b)*(x - c));
            
            System.out.println("Üçgeninizin Çevresi " + ucgencevre + " cm");
            System.out.println("Üçgeninizin Alanı : " + ucgenalan + " cm2");
        }
        else
        {
            System.out.println("Kenarlarınız bir üçgen oluşturmamaktadır.");
        }*/
    }
}
