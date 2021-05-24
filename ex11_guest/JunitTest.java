package ex11_guest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testInsert() {
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = new GuestDTO("홍길동","hong@gmail.com","1111","가입인사");
		int cnt = gdao.insert(gdto);
		System.out.println(cnt + "건 추가");
	}

	@Test
	void testUpdate() {
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = new GuestDTO(2,"이순신","lee@gmail.com","2222","방가방가");
		int cnt = gdao.update(gdto);
		System.out.println(cnt + "건 수정");
	}

	@Test
	void testDelete() {
		GuestDAO gdao = new GuestDAOImpl();
		int cnt = gdao.delete(3);
		System.out.println(cnt + "건 삭제");
	}

	@Test
	void testSelectOne() {
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = gdao.selectOne(2);
		System.out.println(gdto);
		
	}

	@Test
	void testSeletList() {
		GuestDAO gdao = new GuestDAOImpl();
		List<GuestDTO> glist = gdao.selectList();
		System.out.println(glist);
		
	}

}
