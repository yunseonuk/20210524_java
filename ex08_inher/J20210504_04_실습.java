package ex08_inher;

import java.util.HashMap;
import java.util.Map;

//부모클래스
class Thing{
	
}

//자식클래스
class Note extends Thing{
	@Override
	public String toString() {
		return "노트";
	}
	
}

class Pen extends Thing{
	@Override
	public String toString() {
		return "펜";
	}
}


//입고클래스
class Enter{
//	재고 저장 맵
	Map<String, Integer> enMap = new HashMap<>();
//	입고 메소드
	void input(Thing th, int qty) {
		System.out.println(th.toString() + " " + qty + "입고");
		Integer stockQty = enMap.get(th.toString()); //기존 재고 조회
		if (stockQty == null) stockQty = 0; //재고가 없을 경우 초기화
		enMap.put(th.toString(), stockQty + qty); //재고 누적
	}
//	재고 출력 메소드
	void stockPrint(Thing th) {
		System.out.println(enMap);
		System.out.println(th.toString() + " 현재재고 : " + enMap.get(th.toString()) + "개");
	}
}

public class J20210504_04_실습 {

	public static void main(String[] args) {
		Enter enter = new Enter();
		Pen pen = new Pen();		
		enter.input(new Pen(), 10);
		enter.input(new Pen(), 20);
		enter.stockPrint(pen);
		
		Note note = new Note();
		enter.input(new Note(), 15);
		enter.input(new Note(), 30);
	    enter.stockPrint(note);
	}

}
