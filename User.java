/*This class will contain User data such as username, IP address, an arraylist of files that the user has in their storage,
 * among other things that will be added as this is developed. My vision is to store users in a Hashmap, where IP addresses map to User
 * objects. 
 */

import java.util.ArrayList;

public class User{
	private String username;
	private String ipAddress; 
	private ArrayList<File> files;
	
	public User(String username, String ipAddress, ArrayList<File> files){
		this.username = username;
		this.ipAddress = ipAddress;
		this.files = files; 
	}

	public String getUsername(){
		return user.username; 
	}

	public String getIPAddress(){
		return this.ipAddress; 
	}

	public void setUsername(String username){
		this.username = username; 
	}
}