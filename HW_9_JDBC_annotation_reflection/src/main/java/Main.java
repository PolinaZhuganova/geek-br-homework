import java.lang.reflect.Field;
import java.sql.SQLException;


/**
 * Класс Main
 */
public class Main {
	static String tableTitle = null;
	static String columnName = null;

	public static void main(String[] args) throws SQLException {

		Class table = MyTable.class;
		Field [] fields = table.getDeclaredFields();

		for (var f:fields) {
			if(f.isAnnotationPresent(Table.class)){
				tableTitle = f.getName();
			}else if (f.isAnnotationPresent(Column.class)){
				columnName = f.getName();
			}
		}
		MyConnection.connect();
		MyConnection.createTable(tableTitle, columnName);
		MyConnection.insert(tableTitle,"pony");
		MyConnection.insert(tableTitle,"hamster");
		MyConnection.insert(tableTitle,"Cat");
		MyConnection.disconnect();


	}
}