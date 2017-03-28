/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn_tableau4;
import java.util.Scanner;
/**
 *
 * @author MOUSTAPHA
 */
public class Mn_tableau4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int monTableau[]=new int[10];
        int[]tab={12,15,13,10,8,9,13,14};
        int indice1,indice2,memoire;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez_le_premier_indice:_");
        indice1=sc.nextInt();
        System.out.println("Entrez_le_deuxieme_indice:_");
        indice2=sc.nextInt();
        if((indice1<0)||(indice1>=tab.length)){
          System.out.println("indice1_non_valide");
        }else if((indice2<0)||(indice2>=tab.length)){
            System.out.println("indice2_non_valide");    
        }else{
             System.out.println("tableau_avant_echange_:_");
             for(int i=0;i<tab.length;i++){
                 sc.nextInt(tab[i]);
                 System.out.println("__");    
             }
             sc.nextLine();
             memoire=tab[indice1];
             tab[indice1]=tab[indice2];
             tab[indice2]=memoire;
             System.out.println("tableau_apres_echange_:_");
             for(int i=0;i<tab.length;i++){
                 sc.nextInt(tab[i]);
                 System.out.println("__");
             }
             sc.nextLine();    
        }
    }
    
}
