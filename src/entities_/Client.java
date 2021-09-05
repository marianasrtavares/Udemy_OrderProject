package entities_;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthday;
	
	
	public Client() {
		
	}
	SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");

	public Client(String name, String email, Date birthday) {
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}
	
	public String toString() {
	    return "Client:"+ this.name+" ("+sdf1.format(this.birthday)+") - "+this.email+"n";

	}
	

     
	
}
