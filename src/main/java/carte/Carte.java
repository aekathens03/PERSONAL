package carte;

import de.Ressource;

public class Carte {
    private int indice;
    private String name;
    private int victoire;
    private Type type;
    private int valCout;
    private Ressource resCout;
    private int stock;

    public Carte(int indice,String name,int victoire,Type type,int valCout,Ressource resCout,int stock){
        this.indice = indice;
        this.name = name;
        this.victoire = victoire;
        this.type = type;
        this.valCout = valCout;
        this.resCout = resCout;
        this.stock = stock;
    }
}
