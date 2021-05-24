package ex14_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class J20210507_03_buffer {

	public static void main(String[] args) throws IOException {
//		한줄씩 쓰기
		BufferedWriter bw = new BufferedWriter(new FileWriter("./data/bufferWriter.txt"));
		
		bw.write("홍길동,87,80,77");
		bw.newLine();
		bw.write("이순신,89,99,78");
		bw.newLine();
		
		bw.close();
		
		
//		한줄씩 읽기
		BufferedReader br = new BufferedReader(new FileReader("./data/bufferWriter.txt"));
		String s = null;
		while((s = br.readLine()) != null) {
			System.out.println(s);
			String[] data = s.split(",");
			System.out.println(Arrays.toString(data));
		}
		
		br.close();
		
		
		
	}

}
