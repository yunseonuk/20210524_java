package ex01_class;
//원 클래스
//필드 : 반지름, 원의넓이
//overloading
//반지름과 원주율을 입력받아 원의 넓이를 구하는 메소드를 작성하시오.
//(단, 반지름은 정수 또는 실수형일 수 있고, 원주율을 입력 받지 않으면 3.14로 정한다.)

class Circle{
	private double radius; //반지름
	private double area; //넓이
	
	
	// python의 생성자
	// def__init__(self) :
	
	//생성자
	Circle (){}
	Circle(double radius){
		this.radius = radius; //this는 필드의 주소를 찾아가 변수값을 넣어주는 역할
		areaCal(radius); //생성자에서 메소드 실행
	}
	
	
	//게터
	double getArea() {
		return area;
	}
	
	
	//메소드 : 원의 넓이를 구하는 메소드
	double areaCal(double radius) { //원의 넓이 계산 메소드
		area = radius * radius * Math.PI; //Math.PI : 원주율
		return area;
	}
	
	double areaCal(int radius) { 
		area = radius * radius * Math.PI;
		return area;
	}
	
	double areaCal(double radius, double pi) {
		area = radius * radius * pi;
		return area;
	}
	
	double areaCal(int radius, double pi) {
		area = radius * radius * pi;
		return area;
	}
	
	//toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}
	
	
	
}




public class J20210420_05_Area {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		System.out.println(c1);
		
		System.out.println("넓이:" + c1.areaCal(10.5));
		System.out.println("넓이:" + c1.areaCal(10.5, 3.14));
	}

}
