package java01;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
//		 반복문 (for)
//		for (int i = 0; i<10; i++) {
//			System.out.println(i);
//		}
		
		
//		1~10까지 합을 구하시오
//		int sum = 0;
//		for (int i=1; i<11; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		실습) 업다운게임
//		1) 1~100사이의 수중 한개를 랜덤으로 추출
//		2) 사용자에게 정수 입력받기
//		3) 랜덤수와 비교해서 업 다운 출력
//		4) 2번과 3번을 5번 반복
//		5) 반복하면서 정답을 입력하면 사용자가 승리 // 5번 안에 정답을 입력 못하면 컴퓨터가 승리

//		강사님 방식)
//		int r = (int)(Math.random()*100 +1);
//		Scanner sc = new Scanner(System.in);
//		int a; 
//		boolean win = false; //성공여부(실패했다고 가정)
//		for(int i=0; i<5;i++) {
//			
//			System.out.printf("%d)숫자를 맞춰라:", i+1);
//
//			if (!sc.hasNextInt()) { //입력한 값이 숫자가 아니면
//				sc.nextLine(); //버퍼 비우기
//				i--;
//				continue; //반복문의 처음으로 다시 돌아가서 계속 진행
//			}
//			a = sc.nextInt();
//			//업/다운/성공
//			if (r>a) 
//				System.out.println("업");
//			else if(r<a) 
//				System.out.println("다운");
//			else {
//				System.out.println("성공");
//				win=true;
//				break;
//			}
//			
//		}
//		if (!win) System.out.println("실패");
		

//		나의 방식)
//		for (int i=0; i<6; i++) {
//			System.out.print("Guess the number?");
//			int an = sc.nextInt();
//			if (an != r) {
//				if (an < r) {
//					if (i<5) {
//						System.out.println("Up!");
//						continue;
//					} else {
//						System.out.println("Fail... Number is :" + r);
//					}
//				} else {
//					if (i<5) {
//						System.out.println("down!");
//						continue;
//					} else {
//						System.out.println("Fail... Number is :" + r);
//					}
//				}
//				
//			} else 
//				System.out.println("Victory!"); break;
//		}

		
		
		
//		실습1) 1부터 100까지 수 중에서 3의 배수만 출력하기
//		for (int i=1; i<101; i++) {
//			if (i%3==0)
//				System.out.println(i);
//		}

		
//		실습2) 단을 입력 받아 구구단을 출력하는 프로그램을 만들어 보시오
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단은?");
//		int dan = sc.nextInt();
//		for (int i=1; i<10; i++) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//		}
		
		
//		실습3) 소수 구하기
//		양의 정수를 입력 받아 정수가 소수인지 검사하시오.
//		소수란 1과 자기 자신만으로 나누어 떨어지는 수
//		1안)
//		int n = 9;
//		boolean s = true; //소수여부
//		for (int i=2; i<n; i++) {
//			if (n % i==0) {
//				System.out.printf(i + " " + "소수가 아닙니다\n", n); 
//				s = false;
//				break;
//			}
//		}
//		if (s) {
//			System.out.println("소수입니다");
//		}
		
		
//		2안)
//		int n = 9, i;
//		for (i = 2; i<n; i++) {
//			if (n % i==0) {
//				System.out.printf(i + " " + "소수가 아닙니다\n", n);
//				break;
//			}
//		}
//		if (i==5) {
//			System.out.println("소수입니다");			
//		}
		
		
//		1~n까지의 수중 소수만 출력하는 프로그램을 만드시오.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("마지막 수는?");
//		int a = sc.nextInt();
//		
//		boolean b; //소수여부
//		for (int i=2; i<a+1; i++) {
//			b = true; //소수라고 가정하고 시작
//			for (int j = 2; j<i; j++) {
//				if (i%j == 0) { //나누어 떨어지면 소수가 아님
//					b = false; //소수가 아님
//					break;
//				}
//			}
//			if (b) {
//				System.out.print(i + " ");
//			}
//		}
		

		
			
//		백준 2839번) 설탕배달 문제!! & 정답율 : 32.9%
//		상근이는 설탕공장에서 설탕을 배달하고 있는데, 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
//		설탕은 3kg과 5kg이 있으며, 최대한 적은 봉지로 배달을 하려고 한다.
//		예들 들어, 18kg 설탕을 배달하는 경우 3kg 6봉지를 가져가도 되지만, 5kg 3봉지와 3kg 1봉지를 배달하려고 한다.
//		N(킬로그램)kg을 배달해야 할 때, 어떤 봉지를 몇 개 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
//		만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력하시오.
		
//		int threekg, fivekg;
		Scanner sc = new Scanner(System.in);
		System.out.println("배달할 kg은?");
		int nkg = sc.nextInt();
		if (nkg % 5 == 0) {
			
		} else if (nkg % 3 == 0) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int nkg, count5, count3, rest; // 이동할 kg수, 5kg 봉지수, 3kg 봉지수, 나머지
//		이동해야할 kg수 입력
//		System.out.println("배달해야할 설탕의 무게(kg)는?");
//		Scanner sc = new Scanner(System.in);
//		nkg = sc.nextInt();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("주문할 봉지 수는? (단위 : kg)");
//		int sugar = sc.nextInt();
//		int t = 3, f = 5;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
