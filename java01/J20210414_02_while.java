package java01;

import java.util.Scanner;

public class J20210414_02_while {

	public static void main(String[] args) {
//		반복문 : while
		
		
//		원의 넓이를 구하기, 0을 입력하면 종료
		
//		Scanner sc = new Scanner(System.in);
//		1안)
//		double r; // 반지름
//		while(true) {
//			System.out.print("반지름은?");
//			r = sc.nextDouble();
//			if (r==0) break;				
//			System.out.println("넓이는?" + r*r*3.14);
//		}
		
		
//		2안)
//		double r =1;
//		while(r!=0) {
//			System.out.print("반지름은?");
//			r = sc.nextDouble();
//			System.out.println("넓이는?" + r*r*3.14);
//		}
		
		
//		3안)
//		double r;
//		do {
//			System.out.print("반지름은?");
//			r = sc.nextDouble();
//			System.out.println("넓이는?" + r*r*3.14);
//		} while(r!=0); 
		
		
//		실습) 1~10까지 수를 더하기
//		int i = 0, isum = 0;
//		while(true) {
//			i++;
//			if (i>10) break;
//			isum += i;
//		}
//		System.out.println(isum);
		
//		실습 1-1) 수를 입력 받아 1~n까지 수를 더하는 프로그램을 출력하시오.
		int a = 0, s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("마지막 수는?");
		int n = sc.nextInt();
		while(true) {
			a++;
			if (a> n) break;
			s += a;
		}
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
