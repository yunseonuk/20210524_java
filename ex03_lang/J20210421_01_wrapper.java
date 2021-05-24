package ex03_lang;

public class J20210421_01_wrapper {

	public static void main(String[] args) {
//		래퍼클래스
//		int a = 10;
//		System.out.println(String.valueOf(a) + 100);
		
//		String s = "10";
//		System.out.println(Integer.parseUnsignedInt(s) + 100);
//		System.out.println(Integer.valueOf(s) + 100);
	
		Integer a = 10; //Integer는 래퍼클래스, a : 객체
		Integer c = new Integer(10); //되도록 사용하지 않는다, 호환성 문제 발생 가능성 
		System.out.println(c);
		
//		int b = a; //오토박싱(int → Integer), 언박싱
//		System.out.println(a+b);
		
//		2진수 변환
//		int a = 255;
//		System.out.println(Integer.toBinaryString(a));
		
//		boolean 클래스
//		String s = "TRUE";
//		System.out.println(Boolean.parseBoolean(s));
		
		
		
	}

}
