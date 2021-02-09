package banque;

import banque.entites.Credit;
import banque.entites.Debit;
import banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = { new Debit("09/02/2021", 50), new Debit("08/02/2021", 100), new Credit("01/02/2021", 1700), new Credit("04/02/2021", 200) };

        double solde = 0;

        for(Operation o:operations) {
            System.out.println(o.GetType() + "|" + o);
            solde = (o.GetType() == "CREDIT") ? solde + o.getMontant_operation() : solde - o.getMontant_operation();
        }

        System.out.println(solde);
    }
}
