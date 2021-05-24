package ex07_jdbc.sales;


public class ItemDTO {
	private String itemcode;
	private String itemname;
	private int price;
	private String bigo;
	private String regdate;
	
//	생성자
	public ItemDTO() {
	}
	
	public ItemDTO(String itemcode, String itemname, int price, String bigo, String regdate) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
		this.bigo = bigo;
		this.regdate = regdate;
	}

//	getter&setter
	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBigo() {
		return bigo;
	}

	public void setBigo(String bigo) {
		this.bigo = bigo;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

//	toString
	@Override
	public String toString() {
		return "ItemDTO [itemcode=" + itemcode + ", itemname=" + itemname + ", price=" + price + ", bigo=" + bigo
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	
	
	
}


