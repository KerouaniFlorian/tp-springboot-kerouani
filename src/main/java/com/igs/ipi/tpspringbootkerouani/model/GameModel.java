package com.igs.ipi.tpspringbootkerouani.model;

public class GameModel {

    private static final int LARGEUR = 7;
    private static final int HAUTEUR = 6;

    private String nom1;
    private String nom2;
    private Jeton[][] jetons = new Jeton[HAUTEUR][LARGEUR];

    public boolean isJoueur() {
        return joueur;
    }

    public void setJoueur(boolean joueur) {
        this.joueur = joueur;
    }

    private boolean joueur;

    public GameModel(){
        for (int i = 0; i < jetons.length; i++){
            for (int j = 0; j < jetons[i].length; j++){
                jetons[i][j] = Jeton.VIDE;
            }
        }
        joueur = true;
    }

    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    public Jeton[][] getJetons(){
        return jetons;
    }

    public void setJetons(Jeton[][] jetons) {
        this.jetons = jetons;
    }

    public void ajouter(Integer index) {
        for (int h = jetons.length - 1; h > 0; h--) {
            if (jetons[h][index] == Jeton.VIDE) {
                Jeton jeton = joueur ? Jeton.ROUGE : Jeton.JAUNE;
                jetons[h][index] = jeton;
                joueur = !joueur;
                return;
            }
        }
    }


}
