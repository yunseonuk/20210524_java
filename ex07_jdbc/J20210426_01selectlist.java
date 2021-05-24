package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_01selectlist {
	static Connection conn; //필드 : 자동 초기화

	public static void main(String[] args) {
//		오라클 db연동
		
//		Connection conn = null; //지역변수 반드시 초기화 필요
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
		
		if (conn == null) return; //컨넥션 실패 시 종료
		
		
//		db 정보 select
		List<Countries> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM COUNTRIES";
			rs = stmt.executeQuery(sql);	//조회
			while (rs.next()) {
				String country_id = rs.getString("country_id"); 
				String country_name = rs.getString("country_name");
				int region_id = rs.getInt("region_id");
				Countries cot = new Countries(country_id, country_name, region_id);
				list.add(cot);
			}
			
			} catch (SQLException e) {
				System.out.println("sql문 예외");
			e.printStackTrace();
		} finally { //예외가 발생 하든지 안하든지 무조건 실행
			try {
				if (rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
//		출력
//		for문
		System.out.println(list);
		for (int i=0; i<list.size(); i++) {
			Countries c1 = list.get(i);
			System.out.println(c1.getCountries_id() + " " + c1.getCountries_name() + " " + c1.getRegion_id());
		}
		
//		for each문
		System.out.println("------------------------------");
		for(Countries c : list) {
			System.out.println(c.getCountries_id() + " " + c.getCountries_name() + " " + c.getRegion_id());
		}
		
		
		
	}

}







