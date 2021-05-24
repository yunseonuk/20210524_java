package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestDAOImpl implements GuestDAO{

	@Override
	public int insert(GuestDTO gdto) {
		// 추가
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO GUEST (SEQ,NAME,EMAIL,PASSWD,CONTENT)\r\n" + 
				"VALUES(GUEST_SEQ.NEXTVAL,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,gdto.getName());
			pstmt.setString(2,gdto.getEmail());
			pstmt.setString(3,gdto.getPasswd());
			pstmt.setString(4,gdto.getContent());
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return cnt;
	}

	@Override
	public int update(GuestDTO gdto) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "UPDATE GUEST " + 
				"SET NAME = ?, " + 
				"EMAIL = ?, " + 
				"PASSWD = ?, " + 
				"CONTENT = ? " + 
				"WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,gdto.getName());
			pstmt.setString(2,gdto.getEmail());
			pstmt.setString(3,gdto.getPasswd());
			pstmt.setString(4,gdto.getContent());
			pstmt.setInt(5,gdto.getSeq());
			cnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return cnt;
	}

	@Override
	public int delete(int seq) {
		int cnt = 0;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM GUEST " + 
				"WHERE SEQ = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int seq) {
		GuestDTO gdto = null;
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "Select * from GUEST " + 
				"WHERE SEQ = ?";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				gdto = new GuestDTO();
				gdto.setSeq(seq);
				gdto.setName(rs.getString("name"));
				gdto.setEmail(rs.getString("email"));
				gdto.setPasswd(rs.getString("passwd"));
				gdto.setContent(rs.getString("content"));
				gdto.setRegdate(rs.getString("regdate"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
//		GuestDTO gdto = null;
		return gdto;
	}

	@Override
	public List<GuestDTO> selectList() {
		List<GuestDTO> glist = new ArrayList<>();
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM GUEST " + 
				"ORDER BY SEQ DESC";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				GuestDTO gdto = new GuestDTO();
				gdto.setName(rs.getString("name"));
				gdto.setEmail(rs.getString("email"));
				gdto.setPasswd(rs.getString("passwd"));
				gdto.setContent(rs.getString("content"));
				gdto.setRegdate(rs.getNString("regdate"));
				glist.add(gdto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
		
		
		return glist;
	}
}
