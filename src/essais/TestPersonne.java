package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne Elodie = new Personne("Casciola", "Elodie", new AdressePostale(11, "Grande rue", "78660", "Saint-Martin"));
        Personne Charles = new Personne("Bourtoire", "Charles", new AdressePostale(12, "Petite rue", "78660", "Saint-Martine"));
    }
}
