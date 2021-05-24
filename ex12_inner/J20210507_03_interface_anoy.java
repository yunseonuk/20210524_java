package ex12_inner;
//인터페이스는 객체 생성 불가 : 추상클래스(추상 메소드가 들어있음)
interface School{
	void namePrint();
}

// 인터페이스 상속 받는 하위 클래스는 객체 생성 가능
class HighSchool implements School{
	@Override
	public void namePrint() {
		System.out.println("국제 고등학교");
	}
}

public class J20210507_03_interface_anoy {

	public static void main(String[] args) {
		
		HighSchool hs = new HighSchool();
		hs.namePrint();
		
//		익명클래스 생성 :
//		School(인터페이스)를 상속을 받은 객체 생성
		School high = new School() {
			public void namePrint() {
				System.out.println("국제 고등학교");
			}
		};
		
		high.namePrint();
		
		
		
		
	}

}
