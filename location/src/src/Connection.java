import java.sql.*;
import java.sql.DriverManager;

public class Connection {

    public static boolean connect(String login, String password, String database) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Location", "221shadow",
                    "passer");
            Statement sqlr = conn.createStatement();
            ResultSet rs = sqlr
                    .executeQuery("SELECT login,password FROM " + database + " WHERE login = \"" + login + "\"");
            rs.next();
            if (rs.getString(1).equals(login) && rs.getString(2).equals(password)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
