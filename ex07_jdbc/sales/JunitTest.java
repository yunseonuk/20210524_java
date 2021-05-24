package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list = sdao.dayItemSalesList();
//		출력
		
//		for each문
//		for (Map<String, Object> map : list) {
//			System.out.println(map.get("saledate") + " " + map.get("seq"));
//			System.out.println(map.get("itemcode"));
//			System.out.println(map.get("itemname"));
//			System.out.println(map.get("qty"));
//			System.out.println(map.get("amount"));
//			
//		}
		
		
//		for문
		for(int i=0; i<list.size(); i++) {
			Map<String, Object> map = list.get(i);
			System.out.println(map.get("saledate"));
			System.out.println(map.get("seq"));
			System.out.println(map.get("itemcode"));
			System.out.println(map.get("itemname"));
			System.out.println(map.get("qty"));
			System.out.println(map.get("amount"));
		}
		
		}
	
	
	
	
	
	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		
		String saledate = "20210429";
		saledate = saledate.substring(0,4) + "-"
		+ saledate.substring(4, 6) + "-"
		+ saledate.substring(6);
		System.out.println(saledate);
		List<Map<String, Object>> list = sdao.dayItemSalesTotal(saledate);
		System.out.println(list);
	}
	
	
	@Test
	void test3() {
//		SalesDAO sdao = new SalesDAO();
		
//		list = sdao.Item_Sales_View("2021-04-29");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

	