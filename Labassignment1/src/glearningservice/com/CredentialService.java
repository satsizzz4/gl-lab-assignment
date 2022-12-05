package glearningservice.com;

import java.util.Random;

import glearininginterface.com.ICredentials;
import glearningmodel.com.*;

public class CredentialService implements ICredentials{
	


	public String generatePassword() {
		 
		String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnpqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="@#$%^&*_+/.?<>";
		
		String values= capitalLetters + smallLetters +specialCharacters+ numbers;
		 Random random = new Random();
		 
		 
		 String password="";
		
		 for(int i=0; i<8; i++) {
			
			 password += String.valueOf(values.charAt(random.nextInt(values.length())));
			 
			 
		 }
		 return password;
		
		
		
		 		
	}

	public String generateEmailAddress(String firstName,String lastName,String department)
	{
		return firstName+lastName+"@"+department+"gl.in";
	}
	 public void showCredential(Employee employee) {
		  System.out.println("Dear"+ employee.getFirstName()+ "your generated credentials are as follow");
		  System.out.println("Email\t\t"+employee.getEmail());
		  System.out.println("Password\t"+employee.getPassword());
		 
		 
		 
	 }

	@Override
	public void showCredentials(Employee employee) {
		
		System.out.println(employee.getEmail());
		System.out.println(employee.getPassword());
		
	}
	
	

}
