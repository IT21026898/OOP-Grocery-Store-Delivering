package dp.model;

public class OrderDelivering {
	
	private int order_id;
	private String payment_method;
	private String location;
	private String username;
	private int odp_id;
	
	
	//Constructor
	public OrderDelivering() {
		
	}
	
	// Overloaded Constructor
	public OrderDelivering (int order_id, String payment_method, String location, String username, int odp_id) {

		this.order_id = order_id;
		this.payment_method = payment_method;
		this.location = location;
		this.odp_id = odp_id;
	}

	//getters to get values into variables
	public int getOrder_id() {
		return order_id;
	}

	public String getPayment_method() {
		return payment_method;
	}


	public String getLocation() {
		return location;
	}
	
	public String getUsername() {
		return username;
	}
	

	public int getOdp_id() {
		return odp_id;
	}


	
	
	

}
