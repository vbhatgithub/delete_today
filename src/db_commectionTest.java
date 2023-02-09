import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db_commectionTest {
	
	protected static boolean s_int = false;
	
	public synchronized static Connection getConnection(String dbURL,String userName,String password,String dbDriver) {
		
		try {
			Class.forName(dbDriver);
		}
		
		catch(ClassNotFoundException cfe) {
			throw new RuntimeException("cannot load the driver " + cfe);
		}
		
		try {
		Connection connection = DriverManager.getConnection(dbURL,userName,password);
		s_int = true;
		return connection;
		}
		catch(SQLException e) {
			throw new Exception("error while creatign a connection " + e);
		}
	}
	
	

}
