
public abstract class Employee {
	private String emp_name,emp_id,emp_salary;
	//getter & setter
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String attendence() {
		return "This is from attendence";
	}
	
	public abstract String salary();
}
