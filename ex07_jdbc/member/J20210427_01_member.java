package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;

public class J20210427_01_member {

	public static void main(String[] args) {
		boolean logincheck = false; //로그인 여부
		String login_userid = ""; //로그인된 아이디
//		member 데이터 추가
		MemberDAO mdao = new MemberDAO(); //객체 생성
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------");
			System.out.println("[국제 회원관리 v1.0.0] [" + login_userid + "]");
			System.out.println("-------------------------");
			System.out.println("0.로그인");
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원삭제");
			System.out.println("4.단일회원조회");
			System.out.println("5.전체회원조회");
			System.out.println("9.종료");
			System.out.println("-------------------------");
			System.out.print("번호는?");
			int no = sc.nextInt();
			

				if (no == 0) { //로그인
//				userid, passwd 입력받기
						System.out.print("아이디는?");
						String userid = sc.next();
						System.out.print("비밀번호는?");
						String passwd = sc.next();
//				userid check :아이디가 존재하지 않습니다(selectOne)
						MemberDTO mdto = mdao.selectOne(userid);
//				System.out.println(mdto); //중간검사
						if (mdto == null) {
							System.out.println("입력한 아이디는 존재하지 않습니다");
							logincheck = false;
							login_userid = "";
						} else {
//					passwd check : 패스워드가 일치하지 않습니다(getter)
//					db(mdto)의 passwd와 입력한 passwd가 일치한다면 로그인 성공
							String pw = mdto.getPasswd();
							if (pw.equals(passwd)) {
								System.out.println("로그인 완료");
								logincheck = true;
								login_userid = userid;
							} else {
								System.out.println("패스워드가 일치하지 않습니다");
								login_userid = "";
							}					
						}
					

				
				
			} else if (no == 5) { //전체조회
				if (!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue;
				}
				List<MemberDTO> mlist = mdao.selectList();
				System.out.println();
				for(MemberDTO mdto : mlist) {
					System.out.println(mdto.getUserid() + "");
					System.out.println(mdto.getPasswd() + "");
					System.out.println(mdto.getBirthyear() + "");
					System.out.println(mdto.getRegdate() + "");
				}
				
			} else if (no == 4) { //한건조회
				if (!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue;
				}
				List<MemberDTO> mlist = mdao.selectList();
				System.out.println("--------------------");
				System.out.println("[등록된 아이디]");
				System.out.println("--------------------");
				for(MemberDTO mdto : mlist) {
					System.out.println(mdto.getUserid());
				}
				
				
				System.out.println("--------------------");
				System.out.print("조회할 회원아이디는?");
				String userid = sc.next();
				MemberDTO mdto = mdao.selectOne(userid);
				System.out.println(mdto.getUserid());
				System.out.println(mdto.getPasswd());
				System.out.println(mdto.getBirthyear());
				System.out.println(mdto.getRegdate());
				
				
			} else if (no == 1) { //추가
				System.out.println("--------------------");
				System.out.println("[회원가입]");
				
				String userid;
				while (true) {
					System.out.print("아이디는?");
					userid = sc.next();
//					아이디 중복체크
					MemberDTO mdto = mdao.selectOne(userid);
					if (mdto != null) //데이터가 있다면
						System.out.println("중복된 아이디입니다");
					else break;
					
				}
				System.out.print("비밀번호는?");
				String passwd = sc.next();
				sc.nextLine();
				System.out.print("생년월일은?");
				String birthyearS = sc.nextLine();
				int birthyear = 0; //생년월일을 입력안하면 0으로 기본값
				if (!birthyearS.equals("")) birthyear = Integer.parseInt(birthyearS);
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				int cnt = mdao.insert(mdto);
				if(cnt>0) {
					System.out.println("회원가입 완료");
				} else {
					System.out.println("회원가입 실패");
				}
				
				
				
			} else if (no == 2) { //수정
				System.out.println("--------------------");
				System.out.println("[개인정보 수정]");
				System.out.print("고객님의 아이디는?");
				String userid = sc.next();
//				로그인된 아이디 정보만 수정가능
				
//				기존정보 조회 후 수정정보와 같이 전달
				MemberDTO mdto = mdao.selectOne(userid);
				String passwd;
				int birthyear;
				
				System.out.print("변경할 비밀번호는?");
				passwd = sc.next();
				sc.nextLine();
				System.out.print("변경할 생년월일은?");
				String birthyearS = sc.nextLine();
				birthyear = 0;
				if (!birthyearS.equals("")) birthyear = Integer.parseInt(birthyearS);
				mdto = new MemberDTO();
				mdto.setUserid(userid);
				mdto.setPasswd(passwd);
				mdto.setBirthyear(birthyear);
				int cnt = mdao.update(mdto);
				if (cnt>0) {
					System.out.println("정보가 정상적으로 수정되셨습니다");
				} else {
					System.out.println("정확한 정보를 입력해주세요");
				}
				
				
				
			} else if (no==3) { //삭제
				System.out.println("--------------------");
				System.out.println("[회원탈퇴]");
				System.out.print("고객님의 아이디는?");
				String userid = sc.next();
//				로그인된 정보만 삭제가능
				if(!login_userid.equals(userid)) {
					System.out.println("삭제 권한이 없습니다");
					continue;
				}
				
				
				
				int cnt = mdao.delete(userid);
				if (cnt>0) {
					System.out.println("정상적으로 회원탈퇴 되셨습니다");
					login_userid = "";
				} else {
					System.out.println("정확한 정보를 입력해주세요");
				}
				
			} else if (no==9) {
				System.out.println("접속을 종료합니다");
				break;
			}
			
			
			
			
		}

		
//		M(DTO, DAO),V(html, css, js), C(s)
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
