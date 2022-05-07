package BasicWeb;

import java.util.HashMap;
import java.util.Map;

public class UserCredentials {

	static String username;

	static String password;
	
	static Map<String, String> Empdata;

	public static void main(String[] args) {

		Empdata = new HashMap<String, String>();

		Empdata.put("customer", "nayana.28mr@gmail.com:test@123");
		Empdata.put("seller", "smira@gmail.com:mnr@123");
		Empdata.put("retailer", "darshan@gmail.com:ttt@123");

		UserCredentials US = new UserCredentials();

		String obj= US.toString();
		
		System.out.println(obj);
		
		try {
			US= null;
			
		}
		catch( Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		US.doLogin(username, password);

		US.doLogin("seller");

	}

	public void doLogin(String username, String password) {
		username = Empdata.get("retailer").split(":")[0].trim();
		password = Empdata.get("retailer").split(":")[1].trim();
		System.out.println("The username ==>" + username + " and password ==>" + password);
	}

	public void doLogin(String role) {

		username = Empdata.get(role).split(":")[0].trim();
		password = Empdata.get(role).split(":")[1].trim();

		System.out.println("The username ==>" + username + " and password ==>" + password);

	}
}
