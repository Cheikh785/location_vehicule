import java.util.Date;
import java.util.Scanner;

public class Vendeur {
    private String login, password;

    public Vendeur() {
    }

    public Vendeur(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void connect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le login et  password");
        String login = sc.next();
        String password = sc.next();
        Connection.connect(login, password, "Admin");
        sc.close();
    }

    public void genererFacture(Bon b) {
        // recuperer le tarif de la voiture via sql , prendre tarif*duree ,pour avoir le
        // montant
        // montant = 1221.22
        new Facture(b.getIdVehicule(), b.getIdClient(), b.getDuree(), new Date(), (Double) 1221.22);
    }

}
