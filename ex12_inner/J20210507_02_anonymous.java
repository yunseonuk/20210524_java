package ex12_inner;
class Dog{
	void walking() {
		System.out.println("걸을 수 있다");
	}
}

//class HuntDog extends Dog{
////	오버라이딩
//	@Override
//	void walking() {
//		System.out.println("걸을 수 없다");
//	}
//}

public class J20210507_02_anonymous {
	public static void main(String[] args) {
//		HuntDog hdog = new HuntDog();
//		hdog.walking();
		
//		익명클래스 : 부모의 클래스로 재정의해서 생성(= 다형성)
//		1회성으로 쓸려고 할 때
		Dog hdog = new Dog() {
			@Override
			void walking() {
				System.out.println("걸을 수 없다");
			}
			
//			부모에 없는 메소드는 실행할 수 없다
//			즉, 오버라이딩만 의미가 있다
			void eating() {
				System.out.println("먹는다");
			}
		};
		hdog.walking();
		
		
		
	}

}
