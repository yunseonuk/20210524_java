package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

//단위테스트
class JunitTest {
	MemberDAO mdao = new MemberDAO();
	
	@Test
	void testSelectList() {
		List<MemberDTO> mlist = mdao.selectList();
		System.out.println(mlist);
		assertNotEquals(0,mlist.size());
	}

	@Test
	void testSelectOne() {
		String userid = "park";
		MemberDTO mdto = mdao.selectOne(userid);
		System.out.println(mdto);
		assertNotNull(mdto); //mdto가 null이 아닐 때 성공
	}

	@Test
	void testInsert() {
		String userid = "java";
		String passwd = "1111";
		int birthyear = 2001;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.insert(mdto);
//		cnt가 0이 아니면 성공
//		assertNotEquals(0,cnt);
//		cnt가 0이면 성공
		assertEquals(1, cnt);
	}

	@Test
	void testUpdate() {
		String userid = "java";
		String passwd = "2222";
		int birthyear = 2020;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.update(mdto);
		assertEquals(1, cnt);
	}

	@Test
	void testDelete() {
		String userid = "java";
		int cnt = mdao.delete(userid);
		assertEquals(1, cnt); //실패
	}

	
	@Test
	void test() {
		String srt = "2020-04-28 15:09:26";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try {
//			Date d = sdf.parse(srt);
			System.out.println(sdf.format(sdf.parse(srt)));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}
