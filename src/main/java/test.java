import bot.Inventaire;
import de.De;
import de.Face;



import static de.Ressource.*;
import static de.Type.*;

public class test {
    public static void main(String[] args){
        System.out.println("kyriakos");
        Face myFace = new Face(3,OR, CHOIX);
        myFace.afficherFace();
        De myDe = new De();
        myDe.InitDe1();
        myDe.afficherDe();
        Inventaire Sac = new Inventaire();
        Sac.setInventaireJ1();
        Sac.afficherInventaire();
    }
}
