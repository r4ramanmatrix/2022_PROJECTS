package connect_to_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionWithDB {

	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";

	static final String USERNAME = "new_user";
	static final String PASSWORD = "123456";

	public static void main(String[] args) {
		ConnectionWithDB obj1 = new ConnectionWithDB();
		obj1.getConnection();
	}

	public void getConnection() {
		Connection connection = null;
		Statement statement = null;
		String query = "SELECT FIRST_NAME from holly_maleactor where EMP_ID='250'";

		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("Connection successful!!");
			statement = connection.createStatement();
			ResultSet rSet = statement.executeQuery(query);
			while (rSet.next()) {
				System.out.println("FIRST NAME is:: " + rSet.getString("FIRST_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
