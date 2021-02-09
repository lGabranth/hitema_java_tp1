package banque;

import banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte c = new Compte(50.55d);
        Compte c2 = new Compte(678d);

        System.out.println(c);
        System.out.println(c2);
    }
}
