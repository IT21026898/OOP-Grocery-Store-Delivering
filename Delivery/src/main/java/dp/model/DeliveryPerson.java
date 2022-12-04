package dp.model;

public class DeliveryPerson extends Employee{
	
	private  int dp_id;
	private String username;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String dob;
	
	//Constructor
	public DeliveryPerson() {
		super();
	}
	
	// Overloaded Constructor
	public DeliveryPerson(int dp_id, String username, String password, String name, String phone, String email, String address,
			String dob) {
		this.dp_id = dp_id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.dob = dob;
	}

	//getters
	
	public int getDp_id() {
		return dp_id;
	}

	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}
	
	@Override
	public void empLoggers() {
		System.out.println("Abstract method overrided");
	}


	
	
	

}

