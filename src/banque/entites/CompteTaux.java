package banque.entites;

public class CompteTaux extends Compte {
    private double tx_remuneration;

    public CompteTaux(double solde, double tx_remuneration) {
        super(solde);
        this.tx_remuneration = tx_remuneration;
    }

    @Override public String toString() { return super.toString() + ". Le taux de rémunération est de " + this.tx_remuneration; }
}
