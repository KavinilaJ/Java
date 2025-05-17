
package JDBCconnectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DbConnectivity {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/StudentDatabase", "root", "root");
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("insert into student values('vidhya', 22, 460, 'ST1003')");
            System.out.println("Rows affected: " + result);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
