package dp.model;

//Abstract super class Employee 
abstract public class Employee {
	
	private  int dp_id;
	
	//Constructor
	public Employee() {
		super();
	}

	//getter
	public int getDp_id() {
		return dp_id;
	}

	//setter
	public void setDp_id(int dp_id) {
		this.dp_id = dp_id;
	}
	
	//abstract method
	abstract public void empLoggers();

}
