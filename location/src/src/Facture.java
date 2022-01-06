import java.util.Date;

public class Facture {

    private String idVehicule;
    private String idClient;
    private double km;
    private Date dateEmprunt;
    private Double montant;

    public Facture(String idVehicule, String idClient, double km, Date dateEmprunt, Double montant) {
        this.idVehicule = idVehicule;
        this.idClient = idClient;
        this.km = km;
        this.dateEmprunt = dateEmprunt;
        this.montant = montant;
    }

    public String getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(String idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

}
