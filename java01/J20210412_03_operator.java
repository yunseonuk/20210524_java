package java01;

public class J20210412_03_operator {

	public static void main(String[] args) {
		//연산자
		
		//삼항연산자
		//int a = 10;
		//양수 또는 음수 출력
		//String s1 = (a>0) ? "양수": "음수";
		//System.out.println(s1);
		
		
		//실습) 두 수중 큰 수를 출력하시오.
		//int a = 100, b = 50;
		//int max = (a>b) ? a : b;
		//System.out.println("큰값 :" + max);
		
		//실습) 세 수중 가장 큰 수 출력
		//int a = 20, b = 10, c = 30;
		//방식1)
		//int max = a > b ? a : b;
		//max = max > c ? max : c;
		//방식2) 삼항연산자 안의 삼항연산자
		//int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		//System.out.println(max);
		
		
		//실습) 짝홀수 출력하기
		//int odd = 10;
		//String no = odd%2==0 ? "짝수" : "홀수" ;
		//System.out.println(no);
		
		
		//실습) 세 과목이 모두 60점 이상이면 넘으면 합격 아니면 불합격
		//int kor = 90, eng = 85, math = 50;
		//출력방법1)
		//String ave = (kor >= 60 && eng >= 60 && math >= 60) ? "합격" : "불합격";
		//System.out.println(ave);
		//출력방법2)
		//System.out.println((kor >= 60 && eng >= 60 && math >= 60) ? "합격" : "불합격");
		
		
		
	}

}
