package ex04_generics;

//사각형 클래스

//필드 : 가로(int), 세로(int), 넓이(int)
//제네릭타입 : 인스턴스 생성시 형을 결정
//약자[T:Type, K:key, V:Value, E:Element]
class Rectangle<T>{
	private T width;
	private T height;
	private double area;

	
//	생성자
	
	public Rectangle(T width, T height) {
		super();
		this.width = width;
		this.height = height;
		area = getArea(width, height);
	}
	
	
//	setter
	public void setWidth(T width) {
		this.width = width;
	}
	
	public void setHeight(T height) {
		this.height = height;
	}
	
	
//	getter
	public T getWidth() {
		return width;
	}


	public T getHeight() {
		return height;
	}


	public double getArea(T width, T height) {
		double result = 0;
		if (width instanceof Integer) {
			result = (double)width * (double)height;
		}else if (width instanceof Double)
			result = (double)width * (double)height;
		return result;
	}
	
	
//	toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	
	

	
	
	
	
}
public class J20210422_01_generics {
	public static void main(String[] args) {
		//기본 생성자가 없기 때문에 값을 넣어줘야한다!!
		Rectangle<Integer> r1 = new Rectangle<>(5, 6);
		System.out.println(r1);
		
		Rectangle<Double> r2 = new Rectangle<>(5.5, 6.5);
		System.out.println(r2);

	}

}
