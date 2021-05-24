package ex14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class J20210507_02_charactor {

	public static void main(String[] args) {
//		 문자기반 : 문자데이터의 입출력을 다루는 스트림
//		char형 변수 : 2byte
//		자바는 모든문자 유니코드를 기준으로 표현
//		char c = '홍';
//		System.out.println(c);
		
//		문자단위로 쓰기
//		try-with 문
//		System.out.println("자".getBytes().length);
//		try(FileWriter fw = new FileWriter("./data/charSample.txt")) {
//			fw.write('A');
//			fw.write("자바");
//			fw.write("good");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		파일 읽기
//		int ch;
//		try(FileReader fr = new FileReader("./data/charSample.txt")){
//			while ((ch = fr.read()) != -1) {
//				System.out.print((char)ch);
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		주의 → 구분자 : 공백 or , 등
		
//		실습) 좋아하는 칼라를 입력받아 파일을 만들어 저장하고 파일을 읽어서 리스트를 출력
//		(Red, Orange, Yellow, Green, Blue, Navy, Purple, Sky-blue, Pink, White, Brown, Gray, Black)
		Scanner sc = new Scanner(System.in);
		try(FileWriter fw = new FileWriter("./data/colorSample.txt")) {
			while (true) {
				System.out.print("What's your favorite color?");
				String color = sc.next();
				if (color.equals("q")) break;
				fw.write(color);
				fw.write(",");					
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ch = null;
		try(BufferedWriter fr = new BufferedWriter(new FileWriter("./data/colorSample.txt"))){
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
//		엑셀 csv?
		
//		실습) 이름과 점수를 입력받아 파일을 만들어 저장하고 파일을 읽어서 합계과 평균을 구하기
//		문자를 숫자로 바꾸기
		
//		한줄 씩 쓰기
//		BufferedWriter : 문자단위 버퍼 보조
//		FileWriter : 파일에 문자단위로 출력
//		Scanner sc = new Scanner(System.in);
//		try~with문 : 파일 close 자동
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("./data/bufferWriter.txt"))){
//			while (true) {
//				System.out.print("이름,국,영,수?");
//				String data = sc.nextLine();
//				if (data.equals("quit")) {
//					System.out.println("종료합니다");
//					break;
//				}
//				bw.write(data);
//				bw.newLine(); //개행				
//			}
//		}catch (IOException e) {
//			System.out.println("예외 발생");
//		}
		
//		한줄 씩 읽기
//		try(BufferedReader br = new BufferedReader(new FileReader("./data/bufferWriter.txt"))) {
//			String s = null;
//			while((s=br.readLine()) != null) {
////				System.out.println(s);
//				String[] data = s.split(",");
////				System.out.println(Arrays.toString(data));
//				int sum = 0; //과목의 합계
//				for(int i=1; i<4; i++) {
//				sum += Integer.parseInt(data[i]);					
//				}
//				System.out.println("이름 :" + data[0]);
//				System.out.println("합계 :" + sum);
//				System.out.printf("평균 : %.2f\n", sum/3.);
//				System.out.println("--------------------");
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
