package ex09_abstract;

import java.util.Scanner;

interface Call{
	void call();
}

interface Photo{
	void photo();
}

interface Memo{
	void memo();
}

//전화, 사진찍기
class Phone implements Call, Photo{
	@Override
	public void call() {
		System.out.println("전화걸기");
	}
	
	@Override
	public void photo() {
		System.out.println("512화소 사진찍기");
	}
	
	
	
}

//전화, 사진찍기, 메모
class NewPhone implements Call, Photo, Memo{
	@Override
	public void call() {
		System.out.println("전화걸기");
		
	}
	
	@Override
	public void photo() {
		System.out.println("1024화소 사진찍기");
		
	}
	
	@Override
	public void memo() {
		System.out.println("메모기능");
		
	}

	
}

//폰사용
class PhoneUse{
	void call(Call p) {
		p.call();
	}
	void photo(Photo p) {
		p.photo();
	}
	void memo(Memo p) {
		p.memo();
	}
}

public class J20210504_03_Phone {

	public static void main(String[] args) {
		PhoneUse pu = new PhoneUse();
		Phone oldp = new Phone();
		NewPhone newp = new NewPhone();
		pu.call(oldp);
		pu.call(newp);
		pu.memo(newp);
		
		
		
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println("---------------");
		System.out.println("국제폰");
		System.out.println("---------------");
		System.out.println("1. 카메라 기능");
		System.out.println("2. 통화 기능");
		System.out.println("3. 메모기능");
		System.out.println("9. 국제폰 종료");
		System.out.println("---------------");
		System.out.print("번호는?");
		sc.next();
		}

	}

}
