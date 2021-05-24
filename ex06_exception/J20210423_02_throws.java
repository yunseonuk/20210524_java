package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_02_throws {

	static void arrayIndex(int index) {
		
		int[] arr = {10, 20, 30};
		try {
			System.out.println(arr[index]);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 index");
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
	
//	throws : 예외를 던진다
	static void arrayIndex_throws(int index) throws ArrayIndexOutOfBoundsException{
		int[] arr = {10, 20, 30};
		System.out.println(arr[index]);	
	}
	
//	파일을 읽기 메소드
//	예외던지기
	static void fileRead(String filename) throws FileNotFoundException {
		File file = new File(filename);
		System.out.println(file);
//		Scanner sc = new Scanner(file "utf-8"); 파일 utf-8로 저장시
		Scanner sc = new Scanner(file);
		System.out.println("파일 읽기 성공");
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(s);			
		}
	}
	
	
	public static void main(String[] args) {
//		throws : 예외던지기
//		J20210423_02_throws.arrayIndex(4);
		
//		try {					
//			J20210423_02_throws.arrayIndex_throws(4);
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("throws로 처리 : 잘못된 index");
//		} catch (Exception e) {
//			System.out.println("예외 발생");
//		}
		
//		파일읽기 메소드 호출
		try {			
			J20210423_02_throws.fileRead("sample.txt");
		} catch (Exception e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
