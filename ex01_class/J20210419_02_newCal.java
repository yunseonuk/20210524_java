package ex01_class;
//결과값이 저장되는 계산기
class NewCal {
	//필드 : maker, result(결과값)
	String maker = "업글로벌 계산드";
	double result;
	//메소드 : 결과값에 더하는 기능
	//오버로딩 : 매개변수의 갯수나 형이 다른 경우 메소드의 이름 중복가능
	void add(double a) {
		System.out.println("double 메소드");
		result += a; //복합연산자
	}
	double add(double a, double b) {
		return a+b;
	}
	void add(int a) {
		System.out.println("int 메소드");
		result += a; 
	}
	void sub(double a) {
		result -= a;
	}
	void mul(double a) {
		result *= a;
	}
	void div(double a) {
		result /= a;
	}
}

public class J20210419_02_newCal {
	public static void main(String[] args) {

		NewCal nc1 = new NewCal();
//		System.out.println(nc1.result);
//		nc1.add(10);
//		System.out.println(nc1.result);
//		nc1.sub(3);
//		System.out.println(nc1.result);
//		nc1.mul(6.6);
//		System.out.printf("%.1f\n", nc1.result);
//		nc1.div(5.2);
//		System.out.printf("%.1f\n", nc1.result);
		
		System.out.println(nc1.add(20,10));
		nc1.add(100);
		nc1.add(100.12);
		
		
	}

}
