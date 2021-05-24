package java01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J20210415_01_array {

	public static void main(String[] args) {
//		배열
//		형태 : int[] a = new int[100];
//		new를 생성한다는 것은 heap라는 영역에 공간을 생성해라 라는 뜻
//		stack 영역에 a라는 변수가 생성 → heap의 주소를 가린킨다
	
//		int cnt = 5;
//		int[] arr; //선언 : Stack에 생성
//		//배열은 heap에 생성
//		//자바는 동적배열
//		arr = new int[cnt]; // 객체 생성해서 주소를 arr에 대입 
//		arr[0] = 10;
//		System.out.println(arr[0]);
//		arr[5] = 100; // 5번 index는 없다 : 런타임 오류(컨파일 시점엔 미확인)

	
//		int[] arr = new int[5];
//		//1~5값을 대입 > 10~50 확장
//		for(int r=0; r<5; r++) {
//			arr[r] = (r+1)*10;
//			System.out.println(arr[r]);
//		}
		
		
//		int[] arr = new int[5];
//		for(int r=0; r<arr.length; r++) {
//			arr[r] = (r+1)*10;
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		선언과 초기화 : 반드시 사이즈 생략
//		int[] arr = new int[]{10,20,30};
//		int[] arr = {10,20,30}; //new int[] 생략 가능
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		 for ~ each문
//		for(int a: arr) { //arr 변수의 각 값을 a에 대입
//			System.out.println(a);
//		}
		
		
//		Arrsys 클래스 이용 문자열 출력
		
//		오버로딩 : 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도
//		매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.
//		System.out.println(Arrays.toString(arr)); //arr은 주소값을 가지고 있음, 오버로딩
//		System.out.println(arr.toString()); //오버라이딩
//		System.out.println(arr); //println메소드는 toString()실행
//		오버라이딩 : [부모를 가져다가 재정의해서 사용]
//		메소드의 이름이 같고, 매개변수의 개수나 타입이 달라야 한다.
//		주의할 점 : 리턴 값만 다른 것은 오버로딩을 할 수 없음
		
		
//		실습) 3명의 학생의 점수를 입력 받아서 배열에 대입하고 합계와 평균
//		int[] score = new int[3];
//		Scanner sc = new Scanner(System.in);
//		for (int i=0; i<score.length; i++) {
//			System.out.print("점수는?");
//			score[i]= sc.nextInt();
//		}
//		
//		System.out.println("--------------------");
//		
//		int sum = 0;
//		
//		for (int a : score){
//			sum += a;
//		
//		}
//		System.out.println("합계 :" + sum + "점");
//		System.out.printf("평균 :%.2f점", (double)sum/3);
		
		
//		문자열 배열
//		String[] arr = new String[] {"java", "python", "c"};
//		String[] arr = {"java", "python", "c"};
//		for (String s : arr) {
//			System.out.println(s);
//		}
		
		
//		실습)좋아하는 칼라 3개를 입력받아 배열에 저장하고 출력
//		String[] arr = new String[3];
//		Scanner sc = new Scanner(System.in);
		
//		for (int i=0; i<arr.length; i++) {
//			System.out.print(i+1 + ") 좋아하는 색깔은?");
//			arr[i] = sc.nextLine(); //공백처리
//		}
		
//		for (int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
	
	
//		실습) 피보나치 수열 n개
//		ex) 0 1 1 2 3 5 8 13 21 34 ... n개
//		Scanner sc = new Scanner(System.in);
//		System.out.print("마지막 수는?");
//		int n = sc.nextInt();
//		
//		int[] fibo = new int[n];
//		System.out.println(fibo[n]);
//		
//		
//		fibo[0] = 0; fibo[1] = 1;
//		
//		for (int i=0; i<fibo.length+1; i++) {
//			fibo[i+2] = fibo[i] + fibo[i+1];
//			
//		}
//		
//		for (int i=0; i<fibo.length+1; i++) {
//			System.out.println(fibo[i]);
//		}
		
		
//		실습) 피보나치 수열 정답
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수열갯수는?");
//		int n = sc.nextInt();
//		int[] fibo = new int[n];
//		fibo[0] = 0; fibo[1] = 1;
//		
//		for (int i=2; i<n; i++) {
//			fibo[i] = fibo[i-2] + fibo[i-1];
//			
//		}
//		
//		for(int f : fibo) {
//			System.out.print(f + " ");
//		}
		
		
//		실습) 시험 체점 프로그램
//		int[] right = {1,4,5,3,2};
//		int[] answer = {1,3,5,4,2};
		
//		int sum = 0;
//		for (int i=0; i<right.length; i++) {
//			if (right[i] == answer[i]) {
//				// System.out.println(i+1 + " 정답");
//				sum += 100/right.length;
//			}
//		}
//		System.out.println("점수: " + sum + "점");
		
		
//		배열의 복사
//		얇은 복사 : 주소만 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = src;
//		System.out.println(src);
//		System.out.println(dest);
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("dest:" + Arrays.toString(dest));
//		System.out.println("-------------------------------");
		
//		src[1] = 20; dest[3] = 40;
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("dest:" + Arrays.toString(dest));
		
		
//		깊은 복사 : 값을 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = new int[6];
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("dest:" + Arrays.toString(dest));
		
//		for (int i=0; i<src.length; i++) {
			
//			dest[i] = src[i];
//		}
//		dest[5] = 6;
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("dest:" + Arrays.toString(dest));
//		src = dest;
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("dest:" + Arrays.toString(dest));
		
//		프레임워크를 이용한 데이터 추가(맛보기편)
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		System.out.println(arr);
		
		
//		배열의 깊은 복사
//		int[] src = {1,2,3,4,5};
//		int[] dest = {0,0,0,0,0};
		

//		System.arraycopy(src, 2, dest, 0, 3);
//		System.out.println("src:" + Arrays.toString(src));
//		System.out.println("dest:" + Arrays.toString(dest));
		
		
		
		
		

		
		
		
//		실습) 최대값(최솟값) 출력
//		int[] arr = {4,6,7,2,5};
//		int max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println("최대값 :" + max);
//		
//		int min = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println("최솟값 :" + min);
		
		
		
//		4/16 문제풀이
//		1안)
//		int[] arr = {4,6,7,2,5};
//		
//		int max = arr[0];
//		for (int i=1; i<arr.length; i++) {
//			if (arr[i] > max) max = arr[i];
//		}
//		System.out.println("가장 큰 값 :" + max);
		
		
//		2안)
//		int[] arr = {4,6,7,2,5};
//		
//		int max = 0; //범위 안의 가장 작은값을 초기값으로
//		for (int i=0; i<arr.length; i++) {
//			if (arr[i] > max) max = arr[i];
//		}
//		System.out.println("가장 큰 값 :" + max);
		
		
		
		
//		실습) 선택정렬 
		//{2,4,5,6,7} 오름차순 정렬
		//{7,6,5,4,2} 내림차순 정렬
		//int[] sortArr = {4,6,7,2,5};
		// i(0) → i(1) ... 이동
		// j → j → j → j → j ... j가 이동하면 가장 작은 수 찾기!!
		// 2   6   7   4   5 ... 가장 작은 수와 자리 이동 후 i 자리 이동
		
//		int[] sortArr = {4,6,7,2,1};
		
//		for (int j=0; j<sortArr.length; j++) {
//			int min = sortArr[j];
//			int minIndex = j; //가장 작은 값의 index
//			for(int i = j+1; i<sortArr.length; i++) {
//				if (sortArr[i] < min) {
//					min = sortArr[i];
//					minIndex = i;
//				}
//			}
			
//			System.out.println(min);
//			System.out.println(minIndex);
//			//두 수를 바꾸기
//			sortArr[minIndex] = sortArr[j];
//			sortArr[j] = min;
//			System.out.println(Arrays.toString(sortArr) ); //출력
//		}
				
//		실습) 로또번호 맞추기
//		int no = 6;
//		실습) 로또번호 생성
//		1)
//		2)Random()
//		int[] lotto = {};
		
//		int의 범위
		System.out.println("Max: " + Integer.MAX_VALUE);
		System.out.println("Min:" + Integer.MIN_VALUE);
		
		int[] no = new int[6];
		Random rd = new Random();
		
		for(int i=0; i<no.length; i++) {
			boolean b = false; //기존에 존재 하지 않는다라는 가정			
			int r = rd.nextInt(45)+1;
			//기존에 번호가 등록되어 있다면 
			for(int j=0; j<i; j++) {
				if (no[j] == r) {
					i--;
					b = true; //존재 한다
					break;
				}
			}
			if (b) continue; //기존에 존재한다면
			// if (!b) no[i] = r; 존재하지 않는다면
			no[i] = r;
		}
		
		Arrays.sort(no); //오름차순 정렬
		System.out.println(Arrays.toString(no));
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	}

}
