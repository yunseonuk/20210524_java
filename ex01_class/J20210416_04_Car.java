package ex01_class;

import java.util.Scanner;

//자동차 클래스
//속성 : name, color, power, speed
//기능 : powerToggle, speedUp, speedDown
class Car {
	//속성
	String name = "benz";
	String color = "black";
	boolean power;
	int speed = 0;
	
	//기능
	void powerToggle(){ //파워토글
		power = !power;
	}
	void speedUp() { //속력 Up : 100초과가 될 수 없다
		if (speed < 100) speed++;
		
	}
	
	void speedDown() { //속력 Down : 50미만이 될 수 없다
		if (speed > 50) speed--;
	}
	
}

public class J20210416_04_Car {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("파워:" + c1.power);
		System.out.println("속력:" + c1.speed);
		c1.powerToggle();
		System.out.println("파워:" + c1.power);
		
//		반복문으로 속도를 100까지 올렸다가 0으로 떨어뜨리기 !!
		for (int i=0; i<200; i++) {
			c1.speedUp();
		}
		System.out.println("속력:" + c1.speed);
		
		for (int i=0; i<200; i++) {
			c1.speedDown();
		}
		System.out.println("속력:" + c1.speed);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		
//		package : class를 모아놓은 집합
		
		
		
	}

}
