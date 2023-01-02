import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserTable ut = new UserTable(5, "ratnaji", "ratanji@gmai.com");
		UserDao dao = new UserDao();

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String mail = sc.next();
		int id = sc.nextInt();

		dao.updateDetails(name, mail);
		dao.deleteUser(id);

		boolean r = dao.insertIntoDB(ut);
		if (r) {
			System.out.println("Sucessfully insert into db");

		} else {
			System.out.println("Data not insert into db");

		}

		ArrayList<UserTable> gd = UserDao.getDetails();
		for (UserTable s : gd) {
			System.out.format("%-25s %-20s %-10s \n", s.getUser_id(), s.getUser_name(), s.getEmail());
		}
		
		sc.close();
	}
}
