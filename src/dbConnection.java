import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	
	protected static boolean s_int = false;
	
	public  int a ;
	
	public static synchronized Connection getConnection(String dbURL,String userName,String password,String dbDriver) throws Exception{
		int b;
		
		try {
			Class.forName(dbDriver);
			
		}
		
		catch(ClassNotFoundException e) {
		throw new RuntimeException("cannnot load the db driver " + dbDriver + e);
	}
	
		try {
	Connection connection = DriverManager.getConnection(dbURL,userName,password);
	s_int=true;
	return connection;
		}
		
		catch(SQLException e) {
			throw new Exception("error while creating an exception" + e);
		}
}
}

/*

Connection connection = null;
PreparedStatement statement = null;
Resultset resultset = null;


connection = DBConnectionPool.getConnection();

statement = connection.prepareStatement(sql);

resultset = statment.executeQuery;

*/