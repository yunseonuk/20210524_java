package ex01_class;

import java.util.Arrays;

//DTO
//책 클래스
//필드 : 책코드(String), 책명(String), 단가(int), 할인율(double)
//생성자, 게터, 세터, toString
//메소드 : 판매금액계산(매개변수:수량(int), 반환값:판매금액(int))
class Book{
	//필드
	private String bookcode;
	private String bookname;
	private int price;
	private double discount;
	
	
	//생성자(기본 포함)
	public Book() {}
	
	public Book(String bookcode, String bookname, int price, double discount) {
		super();
		this.bookcode = bookcode;
		this.bookname = bookname;
		this.price = price;
		this.discount = discount;	
	}
	
	
	//setter : 쓰기
	public void setBookcode (String bookcode) {
		this.bookcode = bookcode;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	//getter : 읽기
	public String getBookcode() {
		return bookcode;
	}
	
	public String getBookname() {
		return bookname;
	}


	public int getPrice() {
		return price;
	}


	public double getDiscount() {
		return discount;
	}
	
	
	

	//toString
	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", price=" + price + ", discount=" + discount
				+ "]";
	}
	
}

//서비스 클래스
//책 관리 클래스
class Manager {
	//판매금액 합계
	//b001 :0, boo2: 1
	private int[] tot = new int[10];
	
	int[] getTot () {
		return tot;
	}
	
	//판매금액 계산
	int saleCal(Book book, int qty, int index) {
//		System.out.println(book);
//		System.out.println(qty);
		String bookcode = book.getBookcode();
		int price = book.getPrice();
		double discount = book.getDiscount();
		
		int totPrice = (int)(price - price * discount) * qty;
			tot[index] += totPrice;
		
		
		return totPrice;
	}
}

public class J20210421_01_Book {
	public static void main(String[] args) {
		
		Book[] barr = new Book[10]; 
		barr[0] = new Book();
		
		barr[0].setBookcode("b001");
		barr[0].setBookname("java프로그래밍");
		barr[0].setPrice(30000);;
		barr[0].setDiscount(0.2);;
//		System.out.println(b1);
		
		
		barr[1] = new Book("b002", "python100제", 18000, 0.15);
		barr[2] = new Book("b003", "C언어 기본서", 23000 , 0.05);
		
		Manager mg = new Manager();
		System.out.println("책코드        책명         판매금액");
		System.out.println("----------------------------------------");
		System.out.printf("%-8s %-10s %8d\n", barr[0].getBookcode(), barr[0].getBookname(), mg.saleCal(barr[0], 3, 0));
		System.out.printf("%-8s %-10s %9d\n", barr[0].getBookcode(), barr[0].getBookname(), mg.saleCal(barr[0], 5, 0));
		System.out.printf("%-8s %-10s %12d\n", barr[1].getBookcode(), barr[1].getBookname(), mg.saleCal(barr[1], 2, 1));
		System.out.printf("%-8s %-10s %8d\n", barr[2].getBookcode(), barr[2].getBookname(), mg.saleCal(barr[2], 4, 2));

		System.out.println("----------------------------------------");
		
		System.out.println(Arrays.toString(mg.getTot()));
		
//		MVC 패턴
	
	
	
	
	}
	
}
