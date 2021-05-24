package ex04_generics;

//멤버 클래스
//필드 : 아이디(userid), 비밀번호(passwd)
class Member {
	private String userid;
	private String passwd;
	
//	생성자
	public Member(){}
	public Member(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", passwd=" + passwd + "]";
	}

	

}

//Vip 클래스
//필드 : 아이디(userid), 비밀번호(passwd), 할인율(rate) 
class Vip{
	private String userid;
	private String passwd;
	private double rate;
	
	//생성자
	public Vip(){}
	public Vip(String userid, String passwd, double rate) {
		this.userid = userid;
		this.passwd = passwd;
		this.rate = rate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Vip [userid=" + userid + ", passwd=" + passwd + ", rate=" + rate + "]";
	}
}



//	로그인 관리 클래스
class LoginManager<T>{
//	로그인 메소드
	void login(T member) {
		System.out.println(member);
		if (member instanceof Member) {
			System.out.println(((Member)member).getUserid() + "님 로그인");
		} else if (member instanceof Vip) {
			System.out.println(((Vip)member).getUserid() + "님 로그인");
		}
	}
}

public class J20210422_02_Member {
	public static void main(String[] args) {
		
		Member member = new Member("java", "1111");
//		System.out.println(member);
		Vip vip = new Vip("hong", "2222", 0.1);
//		System.out.println(vip);
		
//		로그인 객체 생성
		LoginManager<Member> lm = new LoginManager<>();
		lm.login(member);
		
		LoginManager<Vip> lmvip = new LoginManager<>();
		lmvip.login(vip);
	}

}
