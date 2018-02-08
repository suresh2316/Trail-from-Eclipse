package connection_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:sqlserver://fe80::d17e:7033:760c:6718%14:1433;DatabaseName=SURESH", "Suresh Babu", "");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from STUDENTS");

	}

}
