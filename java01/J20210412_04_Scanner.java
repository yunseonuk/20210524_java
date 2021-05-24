package java01;

import java.util.Scanner;

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		// 사용자에게 입력받기
		//Scanner : 데이터를 읽어 오는 기능을 가진 클래스
		//Scanner sc = new Scanner(System.in);
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("정수는?");
		//int a = sc.nextInt();
		//System.out.println("입력받은 값은 : " + a);
		
		
		//반지름을 입력받아 원의 넓이 구하기
		//Scanner sc = new Scanner(System.in);
		//System.out.print("반지름은?");
		//double r = sc.nextDouble();
		//Math.PI : 원주율, PI : S(static)F(final) 상수
		//System.out.printf("원의 넓이는 : %.2f 입니다\n", r*r*Math.PI); 
		
		//문자열을 입력 받을 때
		//Scanner sc = new Scanner(System.in);
		//System.out.print("이름은?");
		//String name = sc.next(); //공백을 기준으로 읽어드림
		//System.out.println("당신의 이름은 " + name);
		
		//한줄을 읽어드리는 메소드(enter를 기준으로 읽기)
		// ctrl + space : 정보
		//Scanner sc = new Scanner(System.in);
		//System.out.print("이름은?");
		//String name = sc.nextLine();		
		//System.out.print("이름은?" + name);
		
		
		//실습) 나이와 이메일, 이름을 입력 받아 출력
		//Scanner sc = new Scanner(System.in);
		//System.out.print("나이는?");
		//int age = sc.nextInt(); //돌려주는 형과 저장할 변수의 형은 같아야 한다!!
		//System.out.print("이메일은?");
		//String email = sc.next(); //문자열(공백,엔터기준)
		//sc.nextLine(); //엔터처리(버퍼를 비우기 위해서)
		//System.out.print("이름은?");
		//String name = sc.nextLine(); //엔터를 기준으로 문자열 읽기
		//System.out.println(age + " " + email + " " + name);
		
		
		//실습)반, 이름, python, c, java 점수를 입력받아
		//총점과 평균을 구하여 출력
		Scanner sc = new Scanner(System.in);
		//char을 돌려주는 형은 없음, 한 글자를 받더라도 String으로
		//System.out.print("반과 이름은?");
		//String ban = sc.next();
		//String name = sc.nextLine(); //엔터 전에 값이 들어감으로 엔터처리 할 필요 없음!!
		//System.out.print("python, c, java 점수는?");
		//int python = sc.nextInt();
		//int c = sc.nextInt();
		//int java = sc.nextInt();
		//System.out.println("-------------------------------");
		//System.out.println("반 :" + ban);
		//System.out.println("이름 :" + name);
		//int sum = python + c + java;
		//double ave = (double)sum / 3; //정수와 정수의 계산의 값은 정수!! 명시적인 형 변환
		//System.out.println("총점은 :" + sum);
		//System.out.println("평균은 :" + Math.round(ave*100)/100.0);
		
		
		int python = 90;
		int c = 88;
		int java = 96;
		int sum = python + c + java;
		double avg = (double)sum/3;
		System.out.println(avg);
		System.out.println(avg*100);
		System.out.println(Math.round(avg*100));
		System.out.println((double)Math.round(avg*100)/100);
		
		
		//format메소드 이용
		System.out.println("포맷메소드 :" + String.format("%.2f", avg));
		
		
		
		
		

	}

}
