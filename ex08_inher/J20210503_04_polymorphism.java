package ex08_inher;

class Shape{
	private int height;
	private int width;
	
	
	
	//다형성을 위해서 메소드 작성
	void printShape() {
		System.out.println("다각형");
	}
}


//사각형 클래스
class Rect extends Shape{
	@Override  //오버라이딩
	void printShape() {
		System.out.println("사각형");
	}
}


//삼각형 클래스
class Tria extends Shape {
	@Override  //오버라이딩
	void printShape() {
		System.out.println("삼각형");
	}
}


public class J20210503_04_polymorphism {

	public static void main(String[] args) {
//		다형성을 이용해서 메소드를 실행 하려면 반드시 오버라이딩이 되어 있어야 한다 → 컴파일 에러가 나지 않음
//		런타임(runtime)시에는 자식 메소드를 실행
		Shape rec = new Rect();
		rec.printShape();
		
		Shape tri = new Tria();
		tri.printShape();
	}

}
