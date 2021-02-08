package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale(11, "Grande rue", "78660", "Saint-Martin");
        AdressePostale a2 = new AdressePostale(12, "Petite rue", "78660", "Saint-Martine");

        Personne Elodie = new Personne("Casciola", "Elodie", a1);
        Personne Charles = new Personne("Bourtoire", "Charles", a2);
    }
}
