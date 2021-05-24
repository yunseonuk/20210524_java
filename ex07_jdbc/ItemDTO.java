package ex07_jdbc;

import java.util.Date;

public class ItemDTO {
	private String itemcode;
	private String itemname;
	private int price;
	private String bogo;
	private Date regdate;
	
	public ItemDTO() {
	}
	public ItemDTO(String itemcode, String itemname, int price, String bogo, Date regdate) {
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.price = price;
		this.bogo = bogo;
		this.regdate = regdate;
	}
	
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
	public String getBogo() {
		return bogo;
	}
	public void setBogo(String bogo) {
		this.bogo = bogo;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "itemDTO [itemcode=" + itemcode + ", itemname=" + itemname + ", price=" + price + ", bogo=" + bogo
				+ ", regdate=" + regdate + "]";
	}
	
	
	
	

}
