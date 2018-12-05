package de;

import java.util.ArrayList;
import java.util.List;

public class Face {
    private final int or;
    private final int solaire;
    private final int lunaire;
    private final int victoire;
    private final Type type;



    public Face(int or, int solaire, int lunaire, int victoire , Type type){
    this.or = or;
    this.solaire = solaire;
    this.lunaire = lunaire;
    this.victoire = victoire;
    this.type = type;
    }


    public int getNbOr(){
        return or;
    }
    public int getNbLunaire(){
        return or;
    }
    public int getNbSolaire(){
        return or;
    }
    public int getNbVictoire(){
        return or;
    }

    public String toString(){
        return " "+  or +  " "+ solaire +" "+ lunaire +" "+ victoire +" "+ type.toString();
    }
}