package de;

import java.util.Random;

import static de.Ressource.*;
import static de.Type.NORMAL;

public class De {
    private Face face1 ;
    private Face face2 ;
    private Face face3 ;
    private Face face4 ;
    private Face face5 ;
    private Face face6 ;

    public De(){}

    private  int rand(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    public void InitDe1(){
        face1 = new Face(1,OR,NORMAL);
        face2 = new Face(1, OR,NORMAL);
        face3 = new Face(1, OR,NORMAL);
        face4 = new Face(1, OR,NORMAL);
        face5 = new Face(1, OR,NORMAL);
        face6 = new Face(1, SOLAIRE,NORMAL);
    }
    public void InitDe2(){
        face1 = new Face(1, OR,NORMAL);
        face2 = new Face(1, OR,NORMAL);
        face3 = new Face(1, OR,NORMAL);
        face4 = new Face(1, OR,NORMAL);
        face5 = new Face(1, LUNAIRE,NORMAL);
        face6 = new Face(2,VICTOIRE,NORMAL);
    }
    Face getTirageFace(){
        int x = rand();
        Face compte ;
        switch(x){
            case 1:
                compte = face1;
                break;
            case 2:
                compte = face2;
                break;
            case 3:
                compte = face3;
                break;
            case 4:
                compte = face4;
                break;
            case 5:
                compte = face5;
                break;
            default:
                compte = face6;
                break ;
        }
        return compte;
    }

    private Integer minimum(int a ,int b , int c , int d , int e,int f){
        return Math.min(a,Math.min(b,Math.min(c,Math.min(d,Math.min(e,f))))) ;
    }

    public Face faceMin(){
        int valeurMin = minimum(face1.getValeur() ,face2.getValeur() ,face3.getValeur() ,face4.getValeur() ,face5.getValeur() ,face6.getValeur());
        if (valeurMin == face1.getValeur()&& face1.getRes() == Ressource.OR) return face1;
        if (valeurMin == face2.getValeur()&& face2.getRes() == Ressource.OR) return face2;
        if (valeurMin == face3.getValeur()&& face3.getRes() == Ressource.OR) return face3;
        if (valeurMin == face4.getValeur()&& face4.getRes() == Ressource.OR) return face4;
        if (valeurMin == face5.getValeur()&& face5.getRes() == Ressource.OR) return face5;
        if (valeurMin == face6.getValeur()&& face6.getRes() == Ressource.OR) return face6;
        return face1;
    }


    public void afficherDe(){
        System.out.println(" _________________________");
        System.out.println(String.format(" |%-5s  %s %-8s|", "Res  ", "Valeur ","  Type"));
        System.out.println(" _________________________");
        face1.afficherFace();
        face2.afficherFace();
        face3.afficherFace();
        face4.afficherFace();
        face5.afficherFace();
        face6.afficherFace();
    }


}
