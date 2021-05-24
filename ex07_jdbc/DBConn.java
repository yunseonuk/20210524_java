package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
//	컨넥션을 리턴하는 메소드
	static Connection conn;
	
	public static Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		try {
//		드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
//		컨넥션객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading fail");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("Connection fail...");
			e.printStackTrace();
		}
		return conn;
	}
}
