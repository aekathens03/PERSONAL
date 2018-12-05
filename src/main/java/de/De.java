package de;

import java.util.Random;

public class De {
    Face Face1 ;
    Face Face2 ;
    Face Face3 ;
    Face Face4 ;
    Face Face5 ;
    Face Face6 ;

    De(){}

    private  int rand(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    Face getTirageFace(){
        int x = rand();
        Face compte ;

        switch(x){
            case 1:
                compte =  Face1;
                break;
            case 2:
                compte = Face2;
                break;
            case 3:
                compte = Face3;
                break;
            case 4:
                compte = Face4;
                break;
            case 5:
                compte = Face5;
                break;
            default:
                compte = Face6;
                break ;

        }
        return compte;
    }
    private Integer minimum(int a ,int b , int c , int d , int e,int f){
        return Math.min(a,Math.min(b,Math.min(c,Math.min(d,Math.min(e,f))))) ;
    }

    private Integer valeurMin(Face face){
        int res = 0;
        int min = face.getNbOr();
        if (min < face.getNbSolaire()){
            min = face.getNbSolaire();
            res = 1;
        }
        if (min < face.getNbLunaire()){
            min = face.getNbLunaire();
            res = 2;
        }
        if (min < face.getNbVictoire()){
            min = face.getNbVictoire();
            res = 3;
        }
        return res;
    }

    public Face faceMin(){
        int fac1 = valeurMin(Face1);
        int fac2 = valeurMin(Face3);
        int fac3 = valeurMin(Face3);
        int fac4 = valeurMin(Face4);
        int fac5 = valeurMin(Face5);
        int fac6 = valeurMin(Face6);
        int x = minimum(fac1,fac2,fac3,fac4,fac5,fac6);
        switch(x){
            case 1
        }
    }
}
