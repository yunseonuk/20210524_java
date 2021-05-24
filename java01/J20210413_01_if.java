package java01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {
//		 조건문 : if	
//		두 수를 입력 받아 큰 수를 출력하시오.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두 수는?");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a > b) {
//			System.out.println(a);			
//			System.out.println("a가 더 큽니다");
//		}
//		else; {
//			System.out.println(b);
//			System.out.println("b가 더 큽니다");
//		}
		
		
//		점수를 입력 받고 입력 받은 점수에 따라 등급을 출력하여 보시오(절대평가)
//		ex)점수는? 85 → B등급 입니다.
//		90점 이상 A, 80점 이상 B, 70점 이상 C, 70점 이상 D, 60점 미만 F
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수는?");
//		int score = sc.nextInt();
//		if (score >= 90)
//			System.out.println("A등급 입니다");
//		else if (score >= 80)
//			System.out.println("B등급 입니다");
//		else if (score >= 70)
//			System.out.println("C등급 입니다");
//		else if (score >= 60)
//			System.out.println("D등급 입니다");
//		else
//			System.out.println("F등급 입니다");
		
		
//		점수를 입력 받고 입력 받은 점수에 따라 등급을 출력하여 보시오(상대평가)
//		상위 15% A학점, 상위 35% B학점, 상위 50% C학점
//		예) 전체인원수? 90, 등수는? 20 → B학점 입니다.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("전체인원수는?");
//		int tot = sc.nextInt();
//		System.out.print("등수는?");
//		int grade = sc.nextInt();
//		 100 * 0.15 = 15 (A)
//		if (grade <= tot*0.15)
//			System.out.println("A등급");
//		else if	(grade <= tot*0.35)
//			System.out.println("B등급");
//		else if	(grade <= tot*0.50)
//			System.out.println("C등급");
//		else if	(grade <= tot*0.80)
//			System.out.println("D등급");
//		else
//			System.out.println("F등급");
		
		
//		실습) 화씨(F) <=> 섭씨(C)로 바꾸기
//		공식 : 1)화씨온도를 섭씨온도로
//		        	썹시온도 = (화씨온도 - 32) x 5/9
//				 2)섭씨온도를 화씨온도로
//		        	화시온도 = 섭씨온도 x 9/5 + 32
//		온도 : 10 C 또는 100 F
//		Scanner sc = new Scanner(System.in);
//		System.out.print("온도는?");
//		int t = sc.nextInt();
//		String s = sc.next();
//		System.out.println(t + " " + s);
		
//		s는 참조변수, 주소를 갖고 있기 때문에 
//		문자열 비교시 equals 메소드를 이용하여 비교하여야 한다!!
//		if (s.equals("C")) { //섭씨온도라면
//			System.out.println("화씨온도 :" + (t * (double)9 / 5 + 32) + "F");
//		} else if (s.equals("F")) { //화씨온도라면
//			System.out.println("섭씨온도 :" + ((t - 32) * (double)5 / 9) + "C");
//		} else { //그외
//			System.out.println("잘못된 온도");
//		}
		
		
//		실습) 두 수와 기호를 입력 받아 계산하는 프로그램을 출력하시오.
//		Scanner sc = new Scanner(System.in);
		
//		방법 1)
//		System.out.print("두 수는?");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.print("기호는?");
//		String sign = sc.next();
//		if (sign.equals("+")) {			
//			System.out.println(a+b);
//		} else if (sign.equals("-")) {
//			System.out.println(a-b);
//		} else if (sign.equals("*")) {
//			System.out.println(a*b);
//		} else if (sign.equals("/")) {
//			System.out.println((double)a/b);
//		} else {
//			System.out.println("잘못된 기호");
//		}
		
		
//		방법2) 예외값 처리하기
//		System.out.print("계산식은?");
//		try {
//			int a = sc.nextInt();
//			String sign = sc.next();
//			int b = sc.nextInt();
//			if (sign.equals("+"))
//				System.out.println("결과 :" + (a + b));
//			
//		} catch (InputMismatchException e){
//			System.out.println("숫자를 입력해 주세요");
//		}
		
		
//		방법3) 예외값 처리하기 2, 계산기(입력값 확인)
//		코드인스펙션 : 규율 : ==로 true, false를 비교하지 않는다.
//		System.out.print("숫자값은?");
//		System.out.println("숫자" + sc.hasNextInt());
//		if (sc.hasNextInt()) { //숫자라면
//			int a = sc.nextInt();
//			System.out.println(a);					
//		} else {
//			System.out.println("잘못된 숫자");
//		}
		
//		System.out.print("숫자값은?");
//		System.out.println("숫자" + sc.hasNextInt());
		
//		if (!sc.hasNextInt()) { //숫자가 아니라면
//			System.out.println("잘못된 숫자");
//		} else {
//			int a = sc.nextInt();
//			System.out.println(a);					
//		}
		
		
		Scanner sc = new Scanner(System.in);
//		실습) 중첩 조건문, 아이디&패스워드 체크
//		아이디와 패스워드를 입력 받아 로그인 성공여부를 결정짓는 프로그램을 만들어 보시오.
//		아이디를 입력해주세요:java, 패스워드를 입력해주세요 : 1234
//		아이디가 일치합니다, 패스워드가 일치합니다, 로그인 성공
		
//		System.out.print("아이디는?");
//		String myid = sc.next();
//		if (myid.equals("java"))
//			System.out.println("아이디 일치");
//		System.out.print("비밀번호는?");
//		String mypw = sc.next();
//		if (mypw.equals("1234"))
//			System.out.println("비밀번호 일치");
//		if (myid.equals("java"))
//			if (mypw.equals("1234"))
//				System.out.println("로그인 성공");
		
		
//		방식 2)
//		String myid = "java";
//		String mypw = "1234";
//		System.out.print("아이디는?");
//		String id = sc.next();
//		if (id.equals(myid)) {
//			System.out.print("비밀번호는?");
//			String pw = sc.next();
//			if (pw.equals(mypw)) 
//				System.out.println("로그인 성공");
//			else
//				System.out.println("비밀번호 불일치");
//			
//		}else
//			System.out.println("아이디가 불일치");
		
		
//		실습) 전기 사용 요금
//		월 사용량을 입력 받아 전기 요금을 계산해봅시다.
//		200kwh 이하 사용 : 910(기본요금) + (n * 88.3)
//		201~400kwh 사용 : 1,600(기본요금) + (200kwh * 88.3) + (201kwh - n * 182.9)
//		400kwh 초과 : 7,300(기본요금) + (200kwh * 88.3) + (201kwh ~ 400kwh * 182.9) + (401 이상 n * 275.6)
		
//		double sum;
//		System.out.print("월 사용량을 입력해주세요(단위 :kwh)");
//		int spa = sc.nextInt();
//		if (spa < 201) { 
//			sum = 910 + (spa * 88.3); 
//			System.out.println("전기요금 :" + Math.round(sum) + "원");
//		} else if (spa > 200 && spa < 401) {
//			sum = 1600 + (200 * 88.3) + ((spa-200) * 182.9);
//			System.out.println("전기요금 :" + Math.round(sum) + "원");
//		} else {
//			sum = 7300 + (200 * 88.3) + (200 * 182.9) + ((spa-400) * 275.6) ;
//			System.out.println("전기요금 :" + Math.round(sum) + "원");
//		}
		 
		
//		방법 2)
//		 won은 main 안에 있는 지역변수이며, 지역변수는 자동 초기화가 되지 않는다.
//		 즉, else가 없을 경우 won의 초기화가 자동으로 이루어지지 않기 때문에 변수에 별도로 초기화 작업을 해줘야 한다.
//		double won;
//		int use = 450; //사용량
//		double eleUse1 = 88.3; //1단계 전력량 요금
//		double eleUse2 = 182.9; //2단계 전력량 요금
//		double eleUse3 = 275.6; //3단계 전력량 요금
//		int base; //기본요금
//		if (use <= 200) { //1단계
//			base = 910;
//			won = base + use * eleUse1;
//		} else if (use <= 400) { //2단계
//			base = 1600;
//			won = base + (200 * eleUse1) + ((use-200) * eleUse2);
//		} else { //3단계
//			base = 7300; 
//			won = base + (200 * eleUse1) + (200 * eleUse2) + ((use-400) * eleUse3);
//		}
		
//		won = Double.parseDouble(String.format("%.0f", won));
//		System.out.println("사용요금 :" + String.format("%.0f", won) + "원");

//		System.out.println(won);
//		System.out.println(Math.floor(won)); //버림
//		System.out.println(Math.ceil(won)); //올림
//		System.out.println(Math.round(won)); //반올림
		
//		System.out.println("사용요금:" + Math.floor(won));
		
		
		
		
//		실습) 년을 입력받고 윤년 체크하기
//		1) 4로 나누어 떨어지는 해는 윤년으로 한다.
//		2) 100으로 나누어 떨어지는 해는 윤년이 아니다.
//		3) 400으로 나누어 떨어지는 해는 윤년으로 한다.
//		System.out.print("연도를 입력해주세요");
//		int year = sc.nextInt();
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("윤년이 아니다");			
//		}

		
		
//		1 - 0.05(0.95) & 1 + 0.05(1.05)
//		실습) 적정 체중 구하기
//		이름/신장/몸무게를 입력 받고 적정 체중 여부를 출력해주는 프로그램을 만들어 봅시다.
//		평균체중 = (키-100)*0.9, 오차범위 : +-5%
//		적정체중, 과체중, 저체중                                                                                                                                                                                                                                                                                     
//		System.out.print("이름은?");
//		String name = sc.nextLine();
//		System.out.print("신장과 몸무게는?");
//		double s = sc.nextDouble(), k = sc.nextDouble();	
//		double avg = (s - 100) * 0.9;
		
		
//		무작위의 수 추출
//		0보다 크거나 작으면서 1보다 항상 작은 값을 추출 [0 <= 랜덤값 < 1]
//		r * (end - start + 1) + start
//		double r = Math.random();
//		System.out.println((int)(r * (6-1+1) +1);
		
//		주사위 게임
//		예제) 5~10
//		System.out.println((int)(r * (10-5+1) + 5));	
//		예제) 11~20
//		System.out.println((int)(r * (20-11+1) + 11));
		
		
//		랜덤게임) 두 사람의 수를 받아 더 높은 수가 나오는 사람이 이기는 프로그램을 출력
//		int User1 = (int)(Math.random() * (3 - 1 + 1) + 1);
//		int User2 = (int)(Math.random() * (3 - 1 + 1) + 1);
//		System.out.println("User1 :" + User1);
//		System.out.println("User2 :" + User2);
//		if (User1 > User2)
//			System.out.println("User1 승");
//		else if (User2 > User1)
//			System.out.println("User2 승");
//		else
//			System.out.println("무승부");
//			
			
		int i = (int)(Math.random() * (3 - 1 + 1) + 1);
		if (i == 1)
			System.out.println("바위");
		else if (i == 2)
			System.out.println("가위");
		else
			System.out.println("보");
		int j = (int)(Math.random() * (3 - 1 + 1) + 1);
		if (j == 1)
			System.out.println("바위");
		else if (j == 2)
			System.out.println("가위");
		else
			System.out.println("보");
		
		if (i > j)
			System.out.println("User1 승");
		else if (j > i)
			System.out.println("User2 승");
		else
			System.out.println("무승부");
			
			
	}

}
