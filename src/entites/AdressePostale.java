package entites;

public class AdressePostale {
    private int numeroDeRue;
    private String rue;
    private String codePostal;
    private String ville;

    public AdressePostale(int numeroDeRue, String rue, String codePostal, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
