package java01;

//자바 파일이름과 public class의 이름은 같아야 한다.
public class J20210412_01_main { //클래스의 이름
	
	//main(메소드) : 진입점 메소드
	public static void main(String[] args) {
		//자동완성 : sysout; ctrl + space;
		//아래복사 : ctrl + Alt + 아래키
		System.out.print("헬로우 자바!!"); //개행이 없다
		System.out.println("나의 나이는 " + 20); //개행 기능 포함
		//10 + 20 = 30;
		System.out.println(10 + " + " + 20 + " = " + (10 + 20));
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20); //포맷문자열 사용
		
	}

}
