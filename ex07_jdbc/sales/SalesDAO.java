package ex07_jdbc.sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex07_jdbc.DBConn;

public class SalesDAO {
//	일일 상품 판매 리스틍
	List<Map<String, Object>> dayItemSalesList(){
		List<Map<String, Object>> list = new ArrayList<>();
		
//		connection객체 생성
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT ");
		sb.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) ");
		sb.append("ORDER BY S.SALEDATE, S.SEQ");
		
//		String sql = "SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT\r\n" + 
//				"FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE)\r\n" + 
//				"ORDER BY S.SALEDATE, S.SEQ";
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
//				System.out.println(saledate + " " + seq + " " + itemcode + " " + itemname + " " + qty + " " + amount);
//				매출 한 건 데이터 저장
				Map<String, Object> map = new HashMap<>();
				map.put("saledate", saledate);
				map.put("seq", seq);
				map.put("itemcode", itemcode);
				map.put("itemname", itemname);
				map.put("qty", qty);
				map.put("amount", amount);
				list.add(map);
				
				
			}
		} catch (SQLException e) {
//			
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
// 	일일 상품별 집계 판매
//	① 메소드 생성
	void daysalse(){
//		② connection 객체 생성
		Connection conn2 = DBConn.getConn();
//		③ PreparedStatement(pstmt)
		PreparedStatement pstmt2 = null;
//		④ ResultSet(rs)
		ResultSet rs2 = null;
		
//		⑤StringBuffer 객체 생성
		StringBuffer sb2 = new StringBuffer();
//		⑥ append 이용
		sb2.append("SELECT S.SALEDATE, S.ITEMCODE, MAX(I.ITEMNAME)ITEMNAME, SUM(S.QTY)OTY, SUM(S.AMOUNT)AMOUNT");
		sb2.append("FROM SALES S INNER JOIN ITEM I ON(S.ITEMCODE = I.ITEMCODE)");
		sb2.append("GROUP BY S.SALEDATE, S.ITEMCODE");
		sb2.append("ORDER BY S.SALEDATE, S.ITEMCODE");
		
		try {
//			⑦
			pstmt2 = conn2.prepareStatement(sb2.toString());
//			⑧
			rs2 = pstmt2.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
// 		상품마스터 평균 단가
// 		메소드
	List<Map<String, Object>> dayItemSalesTotal(String saledate){
			List<Map<String, Object>> list = new ArrayList<>();
			
			Connection conn = DBConn.getConn();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(S.AMOUNT,0)AMOUNT, NVL(I.BIGO,' ')BIGO, I.REGDATE ");
			sb.append("FROM ITEM I LEFT JOIN ");
			sb.append("(SELECT ITEMCODE, SUM(AMOUNT)AMOUNT ");
			sb.append("FROM SALES ");
			sb.append("WHERE SALEDATE = ? ");
			sb.append("GROUP BY ITEMCODE)S ");
			sb.append("ON (I.ITEMCODE = S.ITEMCODE) ");
			sb.append("ORDER BY I.ITEMCODE");
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, saledate);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					Map<String, Object> map = new HashMap<>();
					map.put("itemcode", rs.getString("itemcode"));
					map.put("itemname", rs.getString("itemname"));
					map.put("price", rs.getString("price"));
					map.put("amount", rs.getString("amount"));
					map.put("bigo", rs.getString("bigo"));
					map.put("regdate", rs.getString("regdate"));
					list.add(map);

					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			return list;
	}
		 
	
//		view를 이용해서
		void Item_Sales_View(String saledate){
			List<Map<String, Object>> list = new ArrayList<>();
			
			Connection conn = DBConn.getConn();
			PreparedStatement ptsmt = null;
			ResultSet rs = null;
			
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT * FROM DAY_ITEM_SALES_VIEW ");
			sb.append("WHERE SALEDATE = ?");
			
			try {
				ptsmt = conn.prepareCall(sb.toString());
				rs = ptsmt.executeQuery();
				while (rs.next()) {
					Map<String, Object> map = new HashMap<>();
					map.put("itemcode", rs.getString("itemcode"));
					map.put("itemname", rs.getString("itemname"));
					map.put("price", rs.getString("price"));
					map.put("amount", rs.getString("amount"));
					map.put("bigo", rs.getString("bigo"));
					map.put("regdate", rs.getString("regdate"));
					map.put("saledate", rs.getString("saledate"));
					list.add(map);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
		 
		 
		 
		 
		 
}
	





















































