/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petanquec3;

import java.util.*;

public class PetanqueC3 {

    public static void main(String[] args) {
        int NbEquipe;
        NbEquipe = (int) (Math.random() * 14);
        if (NbEquipe % 2 == 1) {
            NbEquipe = 0;
            while (NbEquipe < 6) {
                NbEquipe = (int) (Math.random() * 14);
                if (NbEquipe % 2 == 1) {
                    System.out.println(NbEquipe);
                    NbEquipe = 0;
                }
            }
        } else {
            while (NbEquipe < 6) {
                NbEquipe = (int) (Math.random() * 14);
                if (NbEquipe % 2 == 1) {
                    System.out.println(NbEquipe);
                    NbEquipe = 0;
                }
            }

        }
        System.out.println(NbEquipe);
        List<Joueur> listeJoueur = new ArrayList<Joueur>();
        List<Equipe> listeEquipe = new ArrayList<Equipe>();
        int i;
        for (i = 0; i < NbEquipe; i++) {

            Joueur b = new Joueur(2 * i, "Joueur", String.valueOf(i));
            listeJoueur.add(b);
            Joueur c = new Joueur(2 * i + 1, "Joueur", String.valueOf(i + 1));
            listeJoueur.add(c);
            Equipe d = new Equipe(i, "Equipe" + (i + 1), b, c);
            listeEquipe.add(d);
            System.out.println(d.getNom());
        }

        String[][] tab6 = {
            {"1,2", "1,3", "1,4", "1,5"},
            {"3,4", "2,6", "5,2", "6,4"},
            {"5,6", "4,5", "3,6", "2,3"}
        };
        String[][] tab8 = {
            {"1,2", "1,3", "1,4", "1,5"},
            {"3,4", "2,4", "2,3", "2,8"},
            {"5,6", "5,7", "5,8", "3,7"},
            {"7,8", "6,8", "6,7", "4,6"}
        };
        String[][] tab10 = {
            {"1,2", "2,3", "1,3", "6,8"},
            {"3,4", "4,5", "2,4", "7,9"},
            {"5,6", "6,7", "9,6", "10,3"},
            {"7,8", "8,9", "8,10", "5,2"},
            {"9,10", "10,1", "5,7", "4,1"}
        };
        String[][] tab12 = {
            {"1,2", "1,12", "1,3", "12,6"},
            {"3,4", "2,11", "2,4", "3,8"},
            {"5,6", "3,10", "5,7", "11,7"},
            {"7,8", "4,9", "6,8", "1,9"},
            {"9,10", "5,8", "12,9", "4,10"},
            {"11,12", "6,7", "10,11", "5,2"}
        };
        int j, k = 0;
        switch (NbEquipe) {
            case 6:
                for (String[] tab : tab6) {
                    for (String s : tab) {
                       String [] parts = s.split( "," );
                        System.out.println( parts[0] ); 
                        System.out.println( parts[1] );  
                    }
                    System.out.println("\n");
                }
                break;
            case 8:
                for (String[] tab : tab8) {
                    for (String s : tab) {
                        String [] parts = s.split( "," );
                        System.out.println( parts[0] ); 
                        System.out.println( parts[1] );  
                    }
                    System.out.println("\n");
                }
                break;
            case 10:
                for (String[] tab : tab10) {
                    for (String s : tab) {
                        String [] parts = s.split( "," );
                        System.out.println( parts[0] ); 
                        System.out.println( parts[1] );  
                    }
                    System.out.println("\n");
                }
                break;
            case 12:
                for (String[] tab : tab12) {
                    for (String s : tab) {
                        String [] parts = s.split( "," );
                        String z = parts[0] ;
                        String z2 = parts[1] ;
                        
                    }
                    System.out.println("\n");
                }
                break;

        }
    }
}
