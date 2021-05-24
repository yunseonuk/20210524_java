package ex08_inher;

//부모 클래스
class MyCar{
	static final String name = "제네시스 G80";
}

//타이어 부품
class Tire extends MyCar{
	private String company; //회사이름
	
	public Tire(String company){
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "타이어 회사 : " + company;
	}
}
//미러 부품
class Mirror extends MyCar{
	private String company;

	public Mirror(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "미러회사 : " + company ;
	}
}

//수리업체 클래스
class Repair{
//	부품을 체인지 해주는 메소드
//	다형성을 이용
	void changePart(MyCar c) {
		System.out.println(c + "교체 완료");
	}
	
//	void changePart(Mirror m) {
//		System.out.println(m + "교체 완료");
//	}
}

public class J20210504_02_Car {

	public static void main(String[] args) {
		System.out.println(MyCar.name);
		Tire t1 = new Tire("금호 ");
//		System.out.println(t1);		
		Mirror m1 = new Mirror("모비스 ");
//		System.out.println(m1);
		
		Repair r1 = new Repair();
		r1.changePart(t1);
		r1.changePart(m1);
		
	}

}
