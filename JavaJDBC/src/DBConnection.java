import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection con;
//	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//  Connection con = DriverManager.getConnection(url,username,password);

	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@PSL-6V77XM3:1521:orcl", "system", "root");
		return con;
	}

}