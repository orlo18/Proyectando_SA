package statics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private Connection connection;
	
	private void conectar() {
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://hotel-stefan.cciptjamgvdf.us-east-1.rds.amazonaws.com:3306/proyectandosa?useSSL=false",
					"eclipse", "Hotel2020!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void desconectar() {
		try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
