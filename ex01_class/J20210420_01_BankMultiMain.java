package ex01_class;

import java.util.Scanner;


public class J20210420_01_BankMultiMain {
	public static void main(String[] args) {
		//여러개의 계좌 등록 가능
		Scanner sc = new Scanner(System.in);
		Bank[] banks = new Bank[3]; //Bank 객체의 주소를 저장할수있는 공간 3개
		int custno = 0;
		while (true) {
			System.out.println("--------------------");
			System.out.println("국제은행");
			System.out.println("고객번호:" + custno);
			System.out.println("--------------------");
			System.out.println("0. 고객번호 등록");
			System.out.println("1. 계좌개설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 잔액보기");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.print("번호를 선택해주세요");
			int no = sc.nextInt();
			
			switch (no) {
			case 0:
				System.out.print("고객님의 번호를 입력해주세요");
				int number = sc.nextInt();
				custno = number; 
				break;
			case 1:
				System.out.print("통장이름은?");
				String bankname = sc.nextLine();
				sc.nextLine(); //버퍼 비우기
				System.out.print("계좌번호는?");
				String bankno = sc.nextLine();
				banks[custno-1] = new Bank(bankname, bankno);
				break;
				
			case 2: //입금
				if (banks[custno-1] == null) {
					System.out.println("계좌를 먼저 개설해주세요!");
					continue;
				}
				System.out.print("입금할 금액은?");
				int plus = sc.nextInt();
				banks[custno-1].input(plus);
				System.out.println(plus + "원 입금되었습니다");
				System.out.println("잔액:" + banks[custno-1].getBalance() + "원");
				break;
				
			case 3: //출금
				if (banks[custno-1] == null) {
					System.out.println("계좌를 먼저 개설해주세요!");
					continue;
				}
				System.out.print("출금할 금액은?");
				int minus = sc.nextInt();
				int result = banks[custno-1].output(minus);
				if (result == 0)
					System.out.println("정상 출금되었습니다");					
				else
					System.out.println("잔액이 부족합니다");
				System.out.println("잔액:" + banks[custno-1].getBalance() + "원");
				break;
				
			case 4: //잔액조회
				System.out.println("잔액:" + banks[custno-1].getBalance());
				break;
				
			case 9: //종료
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				
			default:
				System.out.println("잘못된 번호입니다");
				continue;
			}
		}
		
		
		
		
		
		
		
//		Bank b1 = new Bank("청약저축", "110-88-99");
//		System.out.println("계좌명:" + b1.getBankname());
//		System.out.println("계좌번호:" + b1.getBankno());
//		System.out.println("잔액:" + b1.getBalance());
//		println의 기능으로 toString 생략 가능
//		System.out.println(b1);
//		b1.input(1000);
//		System.out.println("잔액:" + b1.getBalance());
//		b1.output(500);
//		System.out.println("잔액:" + b1.getBalance());
//		
//		System.out.println("----------------------");
//		Bank b2 = new Bank("청약저축","999-99-99",10000);
//		b2.setBankname("디딤돌저축");
//		System.out.println("계좌명:" + b2.getBankname());
//		System.out.println("계좌번호:" + b2.getBankno());
//		System.out.println("잔액:" + b2.getBalance());
//		System.out.println(b2);
		
		
		
		
		
		
	}

}
