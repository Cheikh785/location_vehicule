import java.util.Scanner;

public class Admin extends Vendeur {
    private String login, password;

    public Admin(String login, String password) {
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

    public void ajoutVoiture(Vehicule v) {
        System.out.print("ajouté une Vehicule ");

    }

    public void modifVehicule(Vehicule v) {
        System.out.print("modifié un véhicule");
    }

    public void ajoutVendeur(Vendeur v) {
        System.out.print("ajouté un vendeur");
    }

    public void consultFacture(Facture f) {
        System.out.print("consulté une facture");

    }

    public static void connect() {
        String login, password;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("entrer le login et  password");
            login = sc.nextLine();
            password = sc.nextLine();
        } while (Connection.connect(login, password, "Admin"));
        sc.close();
    }

}
