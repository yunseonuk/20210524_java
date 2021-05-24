package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210426_02_regionsSelect {

	public static void main(String[] args) {
//		컨넥션 객체 얻기
		Connection con = DBConn.getConn();
		List<RegionsDTO> list = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM REGIONS ORDER BY REGION_ID";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				RegionsDTO rdto = new RegionsDTO();
				int region_id = rs.getInt("region_id");
				String region_name = rs.getString("region_name");
				rdto.setRegion_id(region_id);
				rdto.setRegion_name(region_name);
				list.add(rdto);
			}
			
		} catch (SQLException e) {
			System.out.println("sql 예외");
			e.printStackTrace();
		}
		
//		System.out.println(list);
		for(RegionsDTO dto : list) {
//			System.out.println(dto);
			System.out.println(dto.getRegion_id() + " " + dto.getRegion_name());
			
		}
		
		
	}

}
