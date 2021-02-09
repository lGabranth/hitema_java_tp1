package banque.entites;

public abstract class Operation {
    protected String date_operation;

    public String getDate_operation() {
        return date_operation;
    }

    public void setDate_operation(String date_operation) {
        this.date_operation = date_operation;
    }

    public double getMontant_operation() {
        return montant_operation;
    }

    public void setMontant_operation(double montant_operation) {
        this.montant_operation = montant_operation;
    }

    protected double montant_operation;

    public Operation(String date_operation, double montant_operation) {
        this.date_operation = date_operation;
        this.montant_operation = montant_operation;
    }

    public abstract String GetType();

    @Override public String toString() { return this.date_operation + " : " + this.montant_operation + "€"; }
}
