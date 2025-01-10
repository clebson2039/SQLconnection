import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

     public Connection getConnection(){
        try{
            return DriverManager.getConnection
            ("jdc:sqlserver://localhost:;databasename=;user=sa;password=");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
                
     }
}