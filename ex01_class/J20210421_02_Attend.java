package ex01_class;

import java.text.SimpleDateFormat;
import java.util.Date;

//수강생 클래스
//필드 : 코드, 이름, 수강과목
class Attendee {
	private String code;
	private String name;
	private String subject;
	
	//생성자
	public Attendee() {}

	public Attendee(String code, String name, String subject) {
		this.code = code;
		this.name = name;
		this.subject = subject;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Attendee [code=" + code + ", name=" + name + ", subject=" + subject + "]";
	}
	
	

	
}

//수강 클래스
//메소드 : 입실 출력, 퇴실 출력
class LectureManager {
//	클래스필드, 클래스변수
//	클래스가 메모리에 로딩될 때 생성, 프로그램이 종료 시 소멸
	static final String collegeName = "국제학원"; 
//	static final : 상수(반드시 선언과 동시에 초기화)
//	인스턴스필드, 객체변수
//	인스턴스 생성 시 생성, 객체 소멸 시 소멸
	static final int buildYear = 2001;
	static final int day;
	static { //static 블럭을 이용해서 초기화
		//db에서 가져오거나 파일에서 가져오거나 등등..
		Date now = new Date(); //현재날짜 가져오기
		SimpleDateFormat sf = new SimpleDateFormat("dd");
		day = Integer.parseInt(sf.format(now));
	}
	
	//입실
	static void enter(Attendee att) { //지역변수
		System.out.println(day + "일 " + att.getSubject() + " " + att.getName() + "님 입실");
	}
	
	//퇴실
	static void exit(Attendee att) {
		System.out.println(day + "일 " + att.getSubject() + " " + att.getName() + "님 퇴실");
	}
	
	
	
	
	
}

public class J20210421_02_Attend {
	public static void main(String[] args) {
		
		System.out.println(LectureManager.collegeName); //객체를 생성하지 않고 클래스로 접근해서 그 안의 값을 불러올 수 있다
		System.out.println(LectureManager.buildYear + "개원");
		
		Attendee attd = new Attendee("A001", "홍길동", "자바");
		System.out.println(attd);
		
		LectureManager.enter(attd);
		LectureManager.exit(attd);
		
		
		
		
		
	}
}
