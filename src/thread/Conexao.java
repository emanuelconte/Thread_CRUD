package thread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/thread", "postgres", "admin");
    }
    
    /*
    private void createTableIfNotExists() {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS usuario"
                + "  (id            INTEGER(10),"
                + "   nome          VARCHAR,"
                + "   email         VARCHAR,"
                + "   datanasc      VARCHAR,"
                + "   sexo          VARCHAR,"
                + "   peso          INTEGER,"
                + "   altura        INTEGER)";

        try {
            Statement stmt = getConnection().createStatement();
            stmt.execute(sqlCreate);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
}
