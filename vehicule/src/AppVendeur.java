import java.util.Scanner;

public class AppVendeur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendeur");
        Vendeur.connect();
        sc.close();
    }
}
