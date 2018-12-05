package bot;



public class Inventaire {
    private int nbOr;
    private int nbSolaire;
    private int nbLunaire;
    private int nbVictoire;
   /* private List<Carte> cartes = new ArrayList<>();*/

    public Inventaire(){
    }

    public void setInventaireJ1(){
        this.nbOr = 3;
        this.nbSolaire = 0;
        this.nbLunaire = 0;
        this.nbVictoire = 0;
    }

    public void setInventaireJ2(){
        this.nbOr = 2;
        this.nbSolaire = 0;
        this.nbLunaire = 0;
        this.nbVictoire = 0;
    }

    public void setInventaireJ3(){
        this.nbOr = 1;
        this.nbSolaire = 0;
        this.nbLunaire = 0;
        this.nbVictoire = 0;
    }
    public void setInventaireJ4(){
        this.nbOr = 0;
        this.nbSolaire = 0;
        this.nbLunaire = 0;
        this.nbVictoire = 0;
    }

    public int getNbOR() {
        return nbOr;
    }

    private void setNbOR(int nbOR) {
        this.nbOr = nbOR;
    }

    public int getNbSolaire() {
        return nbSolaire;
    }

    private void setNbSolaire(int nbSolaire) {
        this.nbSolaire = nbSolaire;
    }

    public int getNbLunaire() {
        return nbLunaire;
    }

    private void setNbLunaire(int nbLunaire) {
        this.nbLunaire = nbLunaire;
    }

    public int getNbVictoire() {
        return nbVictoire;
    }

    private void setNbVictoire(int nbVictoire) {
        this.nbVictoire = nbVictoire;
    }

   /* public List<Carte> getCartes() {return cartes;}*/

    public void afficherInventaire(){
         System.out.println("|     INVENTAIRE         |");
         System.out.format("|%12s   :  %s     |\n",    "Or"      ,getNbOR()      );
         System.out.format("|%12s   :  %s     |\n",    "Solaire" ,getNbSolaire() );
         System.out.format("|%12s   :  %s     |\n",    "Lunaire" ,getNbLunaire() );
         System.out.format("|%12s   :  %s    |\n",    "Victoire",getNbVictoire());
    }

    public Inventaire getInventaire(){
        return this;
    }
}
