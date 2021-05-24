package ex01_class;

import java.util.Arrays;

class Sum{
	//두 정수를 매개변수로 입력 받아서 합을 리턴하는 메소드
	int add (int a, int b) {
		return a+b;
	}
	//세 정수를 매개변수로 입력 받아서 합을 리턴하는 메소드
	int add (int a, int b, int c) {
		return a+b+c;
	}
	
	//배열을 매개변수로 받아서 합을 리턴하는 메소드
	int add(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		arr[arr.length-1] = sum; //마지막 index에 합계 넣기
		return sum;
	}
	
	
	
	//가변인자
	int addVarargs(int...arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//문자열을 가변인자로 받아서 출력
	void variableString(String... arr) {
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
	
}

public class J20210420_03_overloading {
	public static void main(String[] args) {
		Sum s = new Sum();
//		System.out.println(s.add(10, 20));
//		System.out.println(s.add(10, 20, 30));
		
//		System.out.println("--------------------");
		
		//배열
		int[] arr = {10,20,30,40,0};
		System.out.println("합계:" + s.add(arr));
		System.out.println(Arrays.toString(arr));
		
//		System.out.println("--------------------");
		
		//가변인자
//		System.out.println(s.addVarargs(10,20,30,40,50));
//		s.variableString("python", "java", "orcle", "c");
	
	
	
	}

}
