//	1.Array List, 2. Map
package ex05_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class J20210422_01_list {
	public static void main(String[] args) {
//		List<E>
//		저장순서가 있다(index가 있다)
//		데이터 중복 허용
//		1) Array List : 배열구조 : 검색 시 유리 / 추가 및 삭제 어렵다(느리다)
//		ctrl + shift + 5?
//		ArrayList<Integer> arrlist = new ArrayList<>();
//		arrlist.add(10);
//		arrlist.add(20);
//		arrlist.add(30);
//		System.out.println(arrlist.size());
		
//		for문
//		for (int i=0; i<3; i++) {
//			arrlist.add((i+1)*10);
//		}
//		System.out.println(arrlist);

//		remove 일부값 삭제
//		arrlist.remove(1);
//		System.out.println(arrlist);
		
//		add : 일부값 삽입
//		arrlist.add(1, 50);
//		System.out.println(arrlist);
		
//		set : 일부값 변경
//		arrlist.set(0, "영심이");
//		System.out.println(arrlist);
		
//		for문
//		for (int i=0; i<arrlist.size(); i++) {
//			System.out.println(arrlist.get(i));
//		}
		
//		for each문
//		for(int vs : arrlist) {
//			System.out.println(vs);
//		}
		
		
//		실습) 이름을 입력을 받아 ArrayList 만들기
//		List<String> arrName = new ArrayList<>();
//		Scanner sc = new Scanner(System.in); 
//		while (true) {
//			System.out.print("이름은?");
//			String name = sc.nextLine();
//			//문자비교 equals
//			if (name.equals("")) break; //System.exit(0); 시스템이 종료되서 출력할 수 없음!!
//			arrName.add(name);				
//		}	
//		
//		for(int i=0; i<arrName.size(); i++) {
//			System.out.println(i+1 + "번) " + arrName.get(i));			
//		}
		
//		삭제
//		1안)
//		arrName.add("hong"); arrName.add("park"); arrName.add("park"); arrName.add("park");
//		System.out.println(arrName);
//		System.out.print("삭제할 이름은?");
//		String name = sc.next();
//		for (int i=0; i<arrName.size(); i++) {
//			if(arrName.get(i).equals(name)) {
//				arrName.remove(i);
//				i--;
//			}
//		}
//		System.out.println(arrName);
		
		
//		2안)
//		반복자 : iterator : 인덱스를 사용하지 않음
//		arrName.add("hong"); arrName.add("park"); arrName.add("park"); arrName.add("park");
//		System.out.println(arrName);
//		System.out.print("삭제할 이름은?");
//		String name = sc.next();
//		반복자 생성
//		Iterator<String> it = arrName.iterator();
//		while(it.hasNext()) {
//			String n = it.next();
//			if (name.equals(n)) it.remove();
//		}
//		System.out.println(arrName);
		

//		Arrays.asList() : 고정길이 배열 반환
//		List<String> list = new ArrayList<String> (Arrays.asList("red", "blue", "yellow"));
//		list.remove(1);
//		System.out.println(list);
		
//		실습)
//		선언과 동시에 초기화
//		List<String> list = Arrays.asList("red", "blue", "yellow");
//		System.out.println(list);
		
//		Iterator를 사용하여 출력하기
//		반복자 생성
//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		실습)반 학생들의 키를 입력 받아 평균을 구하시오
//		List<Double> heiList = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		
//		double sum = 0;
//		while (true) {
//			System.out.print("키는?");
//			double height = sc.nextDouble();
//			if (height == 0) break;
//			heiList.add(height);
//			sum += height;
//		}
//		
//		System.out.println("평균키는: " + sum);
//		System.out.println(heiList.size());
//		System.out.println(sum/heiList.size());

//		System.out.println(100.0/0); //무한, Infinity
//		System.out.println(100/0); //예외
		
		
//		2)LinkedList : 리스트 기반
//		각 요소가 자신의 이전요소의 주소와 다음 요소의 주소를 가지고 있다
//		추가, 삭제가 쉽고, 검색 성능 저하(느리다)
		List<String> linkList = new LinkedList<>();
		linkList.add("python");
		linkList.add("c");
		linkList.add("java");
		System.out.println(linkList);
		
		for (int i=0; i<linkList.size(); i++) {
			System.out.println(linkList.get(i));
		}
		
		
		
		
	}
}
