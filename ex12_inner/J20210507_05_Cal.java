package ex12_inner;
interface Cal {
	int add(int a, int b);
//	int sub(int a, int b);
}
public class J20210507_05_Cal {
	public static void main(String[] args) {
//		익명클래스
		Cal cal1 = new Cal() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
//			@Override
//			public int sub(int a, int b) {
//				return a-b;
//			}
			
		};
		
		System.out.println("더하기 :" + cal1.add(20, 10));
//		System.out.println("빼기 :" + cal1.sub(20, 10));
		
//		람다식
//		한 개의 추상메소드만 가지고 있어야 한다.(함수적 인터페이스)
		Cal cal2 = (a,b) -> a+b;
		System.out.println("람다식 더하기 :" + cal2.add(20, 10));
		
		
	}

}
