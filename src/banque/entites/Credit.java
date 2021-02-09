package banque.entites;

public class Credit extends Operation {

    public Credit(String date_operation, double montant_operation) {
        super(date_operation, montant_operation);
    }

    @Override
    public String GetType() {
        return "CREDIT";
    }
}
