import java.util.Scanner;

public class AppAdmin {
    public static void menu() {
        System.out.println("1.Gestion vendeur");
        System.out.println("2.Gestion de voiture");
        System.out.println("3.consulter les factures");
        System.out.println("4.consulter les bons");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Admin");
        Admin.connect();
        // AppAdmin.menu();

        sc.close();
    }
}
