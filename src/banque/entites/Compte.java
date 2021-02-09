package banque.entites;

public class Compte {
    private static int nbDeCompte = 0;

    private int numCompte;
    private double solde;

    public Compte(double solde) {
        this.numCompte = ++nbDeCompte;
        this.solde = solde;
    }

    @Override public String toString() {
        return "N°"+this.numCompte + " Solde : " + this.solde+".";
    }
}
