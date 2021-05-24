package ex01_class;

import java.util.Scanner;

//계산기
class Cal {
	//속성 : 필드
	String maker = "글로벌 계산기";
	
	//기능 : 메소드
	int add(int a, int b) { //더하기 : 더한 값을 리턴
		int r = a+b; //r = 지역변수, stack 영역에 생성
		return r;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
}

public class J20210419_01_Cal {

	public static void main(String[] args) {
		Cal c1 = new Cal(); // new로 만든 것은 heap 영역에 생성
		System.out.println(c1.maker);
		Scanner sc = new Scanner(System.in);
		int a = 20, b = 3;
		int r = c1.add(a, b);
		System.out.println("합계 :" + r);
		System.out.println("빼기 :" + c1.sub(a, b) );
		System.out.println("곱하기 :" + c1.mul(a, b) );		
		System.out.printf("나누기 : %.1f\n", c1.div(a, b));
		
		
	}

}
