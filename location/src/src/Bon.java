
public class Bon {
    private String IdClient, IdVehicule;
    private Double duree;

    public Bon(String idClient, String idVehicule, Double duree) {
        IdClient = idClient;
        IdVehicule = idVehicule;
        this.duree = duree;
    }

    public Double getDuree() {
        return duree;
    }

    public void setDuree(Double duree) {
        this.duree = duree;
    }

    public String getIdClient() {
        return IdClient;
    }

    public void setIdClient(String IdClient) {
        this.IdClient = IdClient;
    }

    public String getIdVehicule() {
        return IdVehicule;
    }

    public void setIdVehicule(String IdVehicule) {
        this.IdVehicule = IdVehicule;
    }

}