package ex07_jdbc;


//dto : 데이터를 담아서 옮기는 목적
public class EmployeesDTO {
	private int empoyee_id;
	private String first_name;
	private String hire_date;
	private int salary;
	
	public EmployeesDTO() {
	}
	public EmployeesDTO(int empoyee_id, String first_name, String hire_date, int salary) {
		this.empoyee_id = empoyee_id;
		this.first_name = first_name;
		this.hire_date = hire_date;
		this.salary = salary;
	}
	public int getEmpoyee_id() {
		return empoyee_id;
	}
	public void setEmpoyee_id(int empoyee_id) {
		this.empoyee_id = empoyee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeesDTO [empoyee_id=" + empoyee_id + ", first_name=" + first_name + ", hire_date=" + hire_date
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}