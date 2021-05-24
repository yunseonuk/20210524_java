package java01;

import java.util.Scanner;

public class J20210416_01_array2 {

	public static void main(String[] args) {
//		2차원 배열
//		형태 : int[][] a = new int[3][4]; //3행 4열의 배열
//		stack영역에 int[][] a가 생성, a는 주소를 가지고 있는 참조변수
//		new : heap에 객체를 생성
		
//		int[][] arr = new int[3][4];
//		int[][] arr = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //선언과 동시에 초기화, 배열의 크기는 생략
//		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //new int[][]는 생략 가능
//		System.out.println(arr[1][2]); //배열 안의 값을 가져오는 방법
		
		
//		반복문을 이용해 값을 출력
//		for(int i=0; i<3; i++) {
//			for (int j=0; j<4; j++)
//				System.out.println(arr[i][j]);
//			}
				
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++)
//				System.out.printf("%2d ", arr[i][j]);
//			System.out.println();
//		}
		
		
//		for each
//		for(int[] a : arr){
//			for(int b : a) {
//				System.out.println(b);
//			}
//		}

		
//		반복문을 이용해 값을 입력
//		입력 1안)
//		int[][] arr = new int[3][4];
//		1~12 대입 : 반복문을 이용해서
//		int no = 0;
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				arr[i][j] = ++no;
//				System.out.println(arr[i][j]);
//			}
//		}
		
		
//		2안)
//		int[][] arr = new int[3][4];
//		
//		for (int i=0; i<arr.length; i++) {
//			for (int j=0; j<arr[i].length; j++) {
//				arr[i][j] = (i*4)+(j+1);
//				System.out.println(arr[i][j]);
//			}
//		}
			
			
//		실습) 2명 학생의 국,영,수 점수를 입력 받아 배열에 저장하고
//		각자의 합계와 평균을 구하는 프로그램을 작성해 봅시다.
//		추가로 과목별로도 평균을 구해봅시다
		
//		1안)
//		int[][] score = new int[2][3];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<score.length; i++) {
//			System.out.printf("[%d]번\n", i+1);
//			System.out.println("국어 영어 수학?");
//			for(int j=0; j<score[i].length; j++) {
//				score[i][j]= sc.nextInt();
//			}
//		}
		
		
//		2안)
//		String[] sub = {"국어","영어","수학"};
//		int[][] score = new int[2][3];
//		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<score.length; i++) {
//			System.out.printf("[%d]번?\n", i+1);
			
//			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("%s", sub[j]);
//				score[i][j]= sc.nextInt();
//			}
//		}
		
//		System.out.println("-------------------------------");
		
//		출력 1안)
//		for (int[] std : score) {
//			int sum = 0;
//			for(int s : std) {
//				//System.out.println(s);
//				sum +=s;
//			}
//			//합계
//			System.out.println("합계 :" + sum);
//			System.out.println("평균 :" + (double)sum/3);
//		}
		
//		출력 2안)
//		for(int i=0; i<score.length; i++) {
//			int sum = 0;
//			for(int j=0; j<score[i].length; j++) {
//				sum +=score[i][j];
//			}
//			System.out.printf("[%d]합계 : %d 평균 : %.2f\n",i+1,sum,(double)sum/score[i].length);
//		}
		
		
//		System.out.println("-------------------------------");
		
//		과목별 합계 및 평균 구하기!
//		for(int j=0; j<score[0].length; j++) {
//			int sum=0;
//			for(int i=0; i<score.length; i++) {
//				sum += score[i][j];
//			}
			
//			System.out.printf("[%s]합계 : %d 평균 : %.2f\n", sub[j], sum, (double)sum/score.length);
//			System.out.println("-------------------------------");
//		}	
	}

}
