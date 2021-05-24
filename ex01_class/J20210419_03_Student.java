package ex01_class;

import java.util.Arrays;
import java.util.Scanner;

//학생 클래스
//필드 : 반(group), 이름(name), 점수(score배열)(파이썬, c, 자바), 합계(sum)
//	기능(메소드) : 합계(sumCal) ,평균을 계산해서 반환(avgCal)
class Student{
	String group = "codingban";
	String name = "hong gil dong";
	int[] score = new int[3];
	int sum;
//	method의 overloading
//	call_by_value
	void sumCal(int a, int b, int c) { //합계
		sum = 0;
		score[0] = a; score[1] = b; score[2] = c;
		sum = a+b+c;
	}
	
//	call_by_reference
	void sumCal(int[] score) { //합계
		 sum = 0;
		 this.score = score; //변수명이 같은 경우 지역변수 우선 //얇은 복사
		 for (int i=0; i<score.length; i++) {
			 sum += score[i];
		 }
	}
	
	//평균구하기
	double avgCal() {
		double avg = (double)sum/score.length;
		return (double)Math.round(avg*100)/100;
	}
	
	
}
public class J20210419_03_Student {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sumCal(79, 89, 88);
		System.out.println(Arrays.toString(s1.score));
		System.out.println("합계:" + s1.sum);
		s1.sumCal(new int[] {89, 90, 99});
		System.out.println(Arrays.toString(s1.score));
		System.out.println("합계:" + s1.sum);
		System.out.println("평균:" + s1.avgCal());
	}

}
