package ex01_class;
//핸드폰 클래스
//속성(필드) : 제품명, 용량, 화소
//생성자, getter, setter, toString

//this : 나 자신의 객체를 의미, 자신의 주소값을 가지고 있다
//this() :

class Phone {
	String name;
	int capacity;
	int pixel;
	
//	생성자(기본생성자)
	public Phone() {}
	
	public Phone(String name, int capacity, int pixel) {
		//나 자신의 생성자 호출, 반드시 가장 먼저 실행
		this(name, capacity);
		this.pixel = pixel;
	}
	
	public Phone(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", capacity=" + capacity + ", pixel=" + pixel + "]";
	}
	
	
}

public class J20210420_02_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 512, 12000);
		System.out.println(p1);
		p1.setCapacity(256);
		
		
	}

}
