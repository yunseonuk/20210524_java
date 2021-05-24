package ex07_jdbc;

//dto
public class Countries {
	private String countries_id;
	private String countries_name;
	private int region_id;
	
//	생성자
	public Countries() {
	}

	public Countries(String countries_id, String countries_name, int region_id) {
		this.countries_id = countries_id;
		this.countries_name = countries_name;
		this.region_id = region_id;
	}

//	setter/getter
	public String getCountries_id() {
		return countries_id;
	}

	public void setCountries_id(String countries_id) {
		this.countries_id = countries_id;
	}

	public String getCountries_name() {
		return countries_name;
	}

	public void setCountries_name(String countries_name) {
		this.countries_name = countries_name;
	}

	public int getRegion_id() {
		return region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
		
//toString
	@Override
	public String toString() {
		return "Countries [countries_id=" + countries_id + ", countries_name=" + countries_name + ", region_id="
				+ region_id + "]";
	}
	
	

	
	

}
