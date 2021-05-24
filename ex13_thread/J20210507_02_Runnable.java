package ex13_thread;
//쓰레드 만들기 2

//class MyRunn implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("runnable 쓰레드 :" + i);
//		}
//	}
//}

public class J20210507_02_Runnable {
	public static void main(String[] args) {
//		MyRunn myRun = new MyRunn(); //실행 구현
//		Thread th = new Thread(myRun); //쓰레드 생성
//		th.start(); //쓰레드 시작
		
//		Runnable(인터페이스)을 상속을 받는 익명 클래스 생성
//		Runnable myrunn = new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=0; i<10; i++) {
//					System.out.println("runnable 쓰레드 :" + i);
//				}
//			}
//		};
//		
//		Thread th = new Thread(myrunn); //쓰레드 생성
//		th.start();
		
		
//		쓰레드 생성
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("thread :" + i);
				}
			}
		});
		
		th.start();
		
//		쓰레드 우선순위 : 1~10 (숫자가 클수록 높음)
//		쓰레드1 생성
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("쓰레드1 :" + i);
				}
			}
		});
		th1.setPriority(1); //우선순위 가장 낮다
		th1.start();
		
		
//		쓰레드2 생성
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("쓰레드2 :" + i);
				}
			}
		});
		th2.setPriority(10); //우선순위 가장 높다
		th2.start();
		
		
//		main 쓰레드에서 동작
		for(int i=0; i<10; i++) {
			System.out.println("main  쓰레드 :" + i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
