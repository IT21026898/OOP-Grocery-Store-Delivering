package dp.util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dp.model.DeliveryPerson;
import dp.model.OrderDelivering;

import java.util.logging.Level;
import java.util.logging.Logger;


public class DeliveryPersonDBUtil {
	
	private static boolean isSuccess;
	private static Connection CONSTANT_CON = null;
	private static Statement CONSTANT_STMT = null;
	private static ResultSet result = null;
	
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(DeliveryPersonDBUtil.class.getName());
	
	
	
	//get delivery person details as an array list 
	public static List<DeliveryPerson> validateup (String userName, String password) {
		
	//create new array list object	
	ArrayList<DeliveryPerson> deliveryP = new ArrayList<>();
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			String sql = "SELECT * FROM deliveryperson WHERE username = '"+userName+"' AND password = '"+password+"'";
			result = CONSTANT_STMT.executeQuery(sql);
			
			//method next() return true if above query is correct
			if(result.next()) {

				int ID = result.getInt(1);
				String username = result.getString(2);
				String pwd = result.getString(3);
				String name = result.getString(4);
				String phone = result.getString(5);
				String email = result.getString(6);
				String address = result.getString(7);
				String dob = result.getString(8);
				
				// passing above variables into the overloaded constructor
				DeliveryPerson delivery1 = new DeliveryPerson(ID, username, pwd, name, phone, email, address, dob);
				
				//Pass the customer object into the array list object
				deliveryP.add(delivery1);
			}
		}
		catch (Exception e) {
			/** Logger to trace out errors in the application **/
			log.log(Level.SEVERE, e.getMessage());
		}
		
		//return the array list object
		return deliveryP;
		
}
	
	//checks if delivery person username, password are correct and output a boolean value
	public static boolean validate(String userName, String password) {
	
	try {
		CONSTANT_CON= DBconnect.getConnection();
		CONSTANT_STMT = CONSTANT_CON.createStatement();
		
		String sql = "SELECT * FROM deliveryperson WHERE username = '"+userName+"' AND password = '"+password+"' ";
		result = CONSTANT_STMT.executeQuery(sql);
		
		if(result.next()) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		log.log(Level.SEVERE, e.getMessage());
	}
	
	
	return isSuccess;
	}
	
	//get delivery person details as a object of DeliveryPerson class
	public static DeliveryPerson getDeliveryPerson (String userName) {
		
		DeliveryPerson delPerson = new DeliveryPerson();
		
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			String sql = "SELECT * FROM deliveryperson WHERE username = '"+userName+"'";
			result = CONSTANT_STMT.executeQuery(sql);
			
			
			if(result.next()) {
				int ID = result.getInt(1);
				String username = result.getString(2);
				String pwd = result.getString(3);
				String name = result.getString(4);
				String phone = result.getString(5);
				String email = result.getString(6);
				String address = result.getString(7);
				String dob = result.getString(8);
				
				delPerson = new DeliveryPerson(ID, username, pwd, name, phone, email, address, dob);

			}
		}
		catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return delPerson;
		
		
		
	}
	

	//checks insert operation success
	public static boolean insertDeliveryPerson (String name, String phone, String email, String address, String dob, String username, String password) {
		
		isSuccess = false;
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			String sql = "INSERT INTO deliveryperson VALUES (0,'"+username+"','"+password+"','"+name+"','"+phone+"','"+email+"','"+address+"','"+dob+"')";
			
			int result = CONSTANT_STMT.executeUpdate(sql);
			
			if(result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch (Exception e)  {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		
		return isSuccess;
		
	}
	
	//checks update operation success

	public static boolean updateDPProfile (String id, String name, String phone, String email, String address, String dob, String username, String password) {
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			String sql = "UPDATE deliveryperson SET username ='"+username+"', password ='"+password+"', name ='"+name+"', phone ='"+phone+"', email ='"+email+"', address ='"+address+"', dob ='"+dob+"'"+ "WHERE dp_id= '"+id+"'";
			
			int result = CONSTANT_STMT.executeUpdate(sql);
			
			if(result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch (Exception e)  {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	
	//get delivery person details as an array list object

	public static List<DeliveryPerson>  getDPDetails (String id) {
		
		int dp_id = Integer.parseInt(id);
		
		ArrayList<DeliveryPerson> deliveryp = new ArrayList<>();
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			String sql = "SELECT * FROM deliveryperson WHERE dp_id = '"+dp_id+"'";
			result = CONSTANT_STMT.executeQuery(sql);
			
			while(result.next()) {
				int ID = result.getInt(1);
				String username = result.getString(2);
				String pwd = result.getString(3);
				String name = result.getString(4);
				String phone = result.getString(5);
				String email = result.getString(6);
				String address = result.getString(7);
				String dob = result.getString(8);
				
				DeliveryPerson d = new DeliveryPerson(ID, username, pwd, name, phone, email, address, dob);
				deliveryp.add(d);

			}
		}
		catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return deliveryp;
	}
	
	
	//checks delete operation success

	public static boolean deleteDPProfile (String id) {
		
		int dp_id = Integer.parseInt(id);
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			String sql = "DELETE  FROM deliveryperson WHERE dp_id = '"+dp_id+"'";
			int result = CONSTANT_STMT.executeUpdate(sql);
			
			if (result > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		
		return isSuccess;
	}


	//validate the order assigned to each delivery person

	public static boolean validateOrder(String od_id) {
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			String sql = "SELECT * FROM pending_deliveries WHERE odp_id = '"+od_id+"' ";
			result = CONSTANT_STMT.executeQuery(sql);
			
			if(result.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		
		return isSuccess;
	}
	
	//retrieve pending order details via an array list object
	public static List<OrderDelivering> getOrder(String od_id) {

		ArrayList<OrderDelivering> orderD = new ArrayList<>();
		//OrderDelivering delO = new OrderDelivering();
		
		try {
			CONSTANT_CON = DBconnect.getConnection();
			CONSTANT_STMT = CONSTANT_CON.createStatement();
			
			
			
			String sql = "SELECT * FROM pending_deliveries WHERE odp_id = '"+od_id+"'";
			result = CONSTANT_STMT.executeQuery(sql);
			
			
			if(result.next()) {
				int order_id = result.getInt(1);
				String payment_method = result.getString(2);
				String location = result.getString(3);
				String username = result.getString(4);
				int odp_id = result.getInt(5);
				
				OrderDelivering od = new OrderDelivering(order_id, payment_method, location, username, odp_id);
				orderD.add(od);

			}
			
		}
		catch (Exception e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return orderD;
	}
	

	
	
}
