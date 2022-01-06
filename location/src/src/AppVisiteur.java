import java.util.Scanner;

public class AppVisiteur {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("Menu");
        System.out.println("1.  consulter vehicule disponible");
        System.out.println("2.  s'inscrire");
        System.out.println("3.  se connecter");
        Scanner sc = new Scanner(System.in);
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                Visiteur.consulter();
                break;
            case 2:
                Visiteur.inscrire();
                break;
            case 3:
                Client.connect();
                break;

            default:
                System.out.println("Veuiller choisir les options 1 , 2 ou 3");
                break;
        }
        sc.close();
    }
}