/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petanquec3;
import java.util.Random;

public class PetanqueC3 {

    public static void main(String[] args) {
        int NbEquipe ;
        NbEquipe = (int)(Math.random()*14);
        if(NbEquipe % 2 == 1)
        {
            NbEquipe = 0;
        while(NbEquipe < 6)
        {
            NbEquipe = (int)(Math.random()*14);
            if(NbEquipe % 2 == 1)
            {
            System.out.println(NbEquipe);
            NbEquipe = 0;
            }
        }
        }
        else 
        {
         while(NbEquipe < 6)
         {
            NbEquipe = (int)(Math.random()*14);
            if(NbEquipe % 2 == 1)
            {
            System.out.println(NbEquipe);
            NbEquipe = 0;
            }   
         }
  
        }
 System.out.println(NbEquipe);
 int i;
 for(i=0 ; i<NbEquipe;i++)
 {
     Equipe d = new Equipe(i,"Equipe"+(i+1));
     System.out.println(d.getNom());
 }
}
}