package ex12_inner;
interface Item{
	void namePrint(String Itemname);	
}

//class ItemImpl implements Item {
//	@Override
//	public void namePrint(String Itemname) {
//		System.out.println(Itemname);
//	}
//}

public class J20210507_04_item {
	public static void main(String[] args) {
//		ItemImpl item = new ItemImpl();
//		item.namePrint("새우깡");
//	}
	
//	Item(인터페이스)를 상속받는 객체 생성
	Item item = new Item() {
		@Override
		public void namePrint(String Itemname) {
			System.out.println(Itemname);
		}
	};
	
	item.namePrint("새우깡");

}

}