package de;


public class Face {

    private Integer valeur;
    private Ressource res;
    private Type type;

    // CONSTRUCTEUR D'UNE FACE //

    public Face(Integer valeur, Ressource res,Type type){
        this.valeur = valeur;
        this.res = res;
        this.type = type;
    }

    //  GETTER & SETTER VALEUR  //
    public Integer getValeur() {
        return valeur;
    }

    private void setValeur(Integer valeur)  {
        this.valeur = valeur;
    }

    //  GETTER & SETTER RESSOURCE //
    private void setRes(Ressource res){
        this.res = res;
    }

    public Ressource getRes() {
        return res;
    }

    private void setType(Type type) { this.type = type;}

    public Type getType() {return type;}



    public void afficherFace(){

        System.out.println(String.format(" |%-8s  %s      %-6s|", getRes(), getValeur(),getType()));
    }
}
