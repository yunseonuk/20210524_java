package ex10_interface;

import java.util.ArrayList;
import java.util.List;

////공산품 코너
//interface ProdcuctCorner{
//	void productNamePrint(String...s);
//	public List<String> getProductItem();
//	public void setProductItem(List<String> productItem);
//	
//	
////	public List<String> getProductItem(); 
////	public void setProductItem(String...s);
////	void productNamePrint();
//	
//}
//
////정육점 코너
//interface MeatCorner{
//	void meatNamePrint(String...s);
//	public List<String> getMeatItem();
//	public void setMeatItem(List<String> meatItem);
//
//}
//
////의류점 코너
//interface ClothCorner{
//	void clothNamePrint(String...s);
//	public List<String> getClothItem();
//	public void setProductItem(List<String> clothItem);
//}
//
////본사 클래스
//class HeadOffice {
//	private String companyName = "국제마트"; //회사이름
//	private String registrationNumber = "888-88-88888"; //사업자번호
//	void companyInfoPrint() {
//		System.out.println("★★★★★" + companyName + "★★★★★");
//		System.out.println("[NO]" + registrationNumber );
//	}
//}
//
////지점1 클래스
////extends : 상속
////implements : 인터페이스
//class Branch1 extends HeadOffice implements MeatCorner, ProdcuctCorner {
////	한 지점만 이 클래스를 쓸 경우 : 하드코딩, 여러 곳에서 쓸 경우 생성자로 받아서 
//	private String branchName = "신림점";
//	private List<String> meatItem;
//	private List<String> productItem = new ArrayList<>(); //공산품 상품 목록
//	
//	//세터, 게터
//	@Override
//	public List<String> getProductItem() {
//		return productItem;
//	}
//
//	@Override
//	public void setProductItem(String...s) {
//		for(String item : s) {
//			productItem.add(item);
//		}
//		
//	}
//
//	@Override
//	public List<String> getMeatItem() {
//		return meatItem;
//	}
//
//	@Override
//	public void setMeatItem(List<String> meatItem) {
//		this.meatItem = meatItem;
//		
//	}
//	
//	
//	@Override
//	public void productNamePrint(String...s) {
//		System.out.println("[" + branchName + "] 공산품 코너");
//		System.out.println("***");
//		for(String item : s) {
//			System.out.println(item + " ");
//		}
//		System.out.println();
//	}
//
//	@Override
//	public void meatNamePrint(String...s) {
//		System.out.println("[" + branchName + "] 정육점 코너");System.out.println("***");
//		for(String item : s) {
//			System.out.println(item + " ");
//		}
//		System.out.println();
//	}
//	
//}
//
////지점2 클래스
//class Branch2 extends HeadOffice{
//	
//}

public class J20210506_01_mart {

	public static void main(String[] args) {
//		Branch1 b1 = new Branch1(); //객체 생성
//		b1.companyInfoPrint();
//		System.out.println("--------------------");
////		공산품코너 : 가변인자
//		b1.productNamePrint("생활용품","문구","침구","가전");
//		b1.meatNamePrint("소고기","돼지고기","닭고기");
//		b1.setProductItem();
////		고기코너
		

	}

}
