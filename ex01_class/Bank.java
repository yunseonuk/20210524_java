package ex01_class;

import java.util.Scanner;

//은행 클래스 : Bank
//필드: 은행명(bankname), 계좌번호(bankno), 잔액(balance)
//생성자, setter, getter

public class Bank {
	
	private String bankname;
	private String bankno;
	private int balance;
	
//	생성자의 오버로딩
//	Bank(){}
	public Bank(String bankname, String bankno) {
		super();
		this.bankname = bankname;
		this.bankno = bankno;
	}
	
	public Bank(String bankname, String bankno, int balance) {
		super();
		this.bankname = bankname;
		this.bankno = bankno;
		this.balance = balance;
	}

//	getter&setter 자동완성
	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankno() {
		return bankno;
	}

	public void setBankno(String bankno) {
		this.bankno = bankno;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
//	입금메소드
	void input(int money) {
		balance += money;
	}
	
//	출금메소드
	int output(int money) {
		if (balance - money < 0) {
			return -1;
		}else {
			balance -= money;
			return 0;
		}
	}
	
	
//	어노테이션
//	오버라이딩:부모 클래스의 메소드르 재정의
	
	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}
}