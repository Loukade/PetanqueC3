/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petanquec3;

/**
 *
 * @author lucas
 */
public class Equipe {

    
    private int id ; 
    private String nom ;
    private Joueur unJoueur1;
     private Joueur unJoueur2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Equipe(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
    public Equipe(int id, String nom, Joueur unJoueur1,Joueur unJoueur2 ) {
        this.id = id;
        this.nom = nom;
        this.unJoueur1 = unJoueur1;
        this.unJoueur2 = unJoueur2;
    }
    
}
