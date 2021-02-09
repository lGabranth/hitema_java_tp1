package banque;

import banque.entites.Compte;
import banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte c = new Compte(50.55d);
        Compte c2 = new CompteTaux(630.5d, 1.2d);
        Compte[] comptes = { c, c2 };

        for(Compte co:comptes) System.out.println(co);
    }
}
