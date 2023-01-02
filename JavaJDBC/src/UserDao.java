import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {
	public boolean insertIntoDB(UserTable st) throws ClassNotFoundException, SQLException {
		boolean s = false;
		Connection con = DBConnection.createConnection();
		String qry = "Insert into userTable values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(qry);
		ps.setInt(1, st.getUser_id());
		ps.setString(2, st.getUser_name());
		ps.setString(3, st.getEmail());
		ps.executeUpdate();
		s = true;
		con.close();
		return s;
	}

	public static ArrayList<UserTable> getDetails() throws ClassNotFoundException, SQLException {

		ArrayList<UserTable> studentList = new ArrayList<UserTable>();
		Connection con = DBConnection.createConnection();
		String qry = "Select * from userTable";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(qry);
		while (rs.next()) {
			UserTable student = new UserTable(rs.getInt(1), rs.getString(2), rs.getString(3));
			studentList.add(student);
		}
		con.close();
		return studentList;

	}

	public void updateDetails(String user_name, String email) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.createConnection();
		Statement st = con.createStatement();
		String q = String.format("update userTable set email = '%s' where user_name = '%s'", email, user_name);
		st.executeQuery(q);
		con.close();
	}
	
	public void deleteUser(int user_id) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.createConnection();
		Statement st = con.createStatement();
		String q = String.format("Delete from userTable where user_id = %s", user_id);
		st.executeQuery(q);
		con.close();
		
	}
}
