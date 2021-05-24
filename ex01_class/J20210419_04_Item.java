package ex01_class;

import java.util.Scanner;

//상품클래스(Item)
//필드:itemcode(코드), itemname(이름), price(단가)
//메소드 :
//1) 판매금액 계산 : 매개변수(판매수량), 리턴값(판매금액)
class Item{
	//private 접근제한자 : 클래스 내부에서만 접근 가능
	//은닉화, 캡슐화
	private String itemcode;
	private String itemname;
	private int price;
	int amount (int qty) {
		return price * qty;
	}
	//메소드를 이용해서 접근
	//세터(setter)
	//this는 객체 자신
	void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	void setItemname(String itemname) {
		this.itemname = itemname;
	}
	void setPrice(int price) {
		this.price = price;
	}
	//getter
	String getItemcode() {
		return itemcode;
	}
	String getItemname() {
		return itemname;
	}
	int getPrice() {
		return price;
	}
	
	
}


public class J20210419_04_Item {

	public static void main(String[] args) {
		Item item = new Item();
		item.setItemcode("8801");
		item.setItemname("사이다");
		item.setPrice(800);
		System.out.println(item.getItemcode() 
				+ " " + item.getItemname() 
				+ " " + item.getPrice() 
				+" 판매금액: " + item.amount(5) + "원");
		
		
		Item item2 = new Item();
		item2.setItemcode("8802");
		item2.setItemname("콜라");
		item2.setPrice(1200);
		System.out.println(item2.getItemcode() 
				+ " " + item2.getItemname()
				+ " " + item2.getPrice()
				+ " 판매금액:" + item2.amount(10) + "원");
		
		System.out.printf("%,d\n", item2.getPrice());
	}

}
