package ex07_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210427_01_emp {

	public static void main(String[] args) {
//		사원(employees)테이블에서 연봉이 10000이상인 사원 조회
//		employee_id, first_name, salary 조회
//		연봉의 내림차순으로 정렬
		
		Connection con = DBConn.getConn();
		List<EmployeesDTO> list = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, SALARY\r\n" + 
					"FROM EMPLOYEES\r\n" + 
					"WHERE SALARY >= 10000\r\n" + 
					"ORDER BY SALARY DESC";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				String hire_date = rs.getString("hire_date");
//				Date hire_date = rs.getDate("hire_date");
				int salary = rs.getInt("salary");
				EmployeesDTO edto = new EmployeesDTO(employee_id,first_name,hire_date,salary);
				list.add(edto);
			}
			
			
		} catch (SQLException e) {
			System.out.println("sql 예외제외");
			e.printStackTrace();
		}finally { //예외가 발생 하든지 안하든지 무조건 실행
			try {
				if (rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println(list);
		for (EmployeesDTO dto : list) {
			System.out.println(dto);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
