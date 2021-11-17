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
public class Match {
    private int id; 
    private int temps; 
    private Equipe Equipe1 ;
    private Equipe Equipe2 ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public Equipe getEquipe1() {
        return Equipe1;
    }

    public void setEquipe1(Equipe Equipe1) {
        this.Equipe1 = Equipe1;
    }

    public Equipe getEquipe2() {
        return Equipe2;
    }

    public void setEquipe2(Equipe Equipe2) {
        this.Equipe2 = Equipe2;
    }

    public Match(int id, int temps, Equipe Equipe1, Equipe Equipe2) {
        this.id = id;
        this.temps = temps;
        this.Equipe1 = Equipe1;
        this.Equipe2 = Equipe2;
    }
    
  
}
