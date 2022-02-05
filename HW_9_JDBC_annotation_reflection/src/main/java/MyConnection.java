import java.sql.*;

/**
 * Класс MyConnection
 */
public class MyConnection {

	private static Connection connection;


	public static void connect() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/postgres",
				"postgres", "admin");


		} catch (ClassNotFoundException | SQLException e) {
			throw new SQLException("Unable to connect");
		}
	}


	public static void disconnect() {

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createTable(String title, String type) {

		try (Statement preparedStatement = connection.createStatement()
			) {

			preparedStatement.execute("CREATE TABLE" + title + " (id INT," + type + "  VARCHAR )");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insert(String title, String type) {
		try (PreparedStatement preparedStatement = connection.prepareStatement(
			"INSERT INTO ? VALUE ?")) {
			preparedStatement.setString(1, title);
			preparedStatement.setString(2, type);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}