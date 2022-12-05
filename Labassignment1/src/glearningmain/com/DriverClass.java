package glearningmain.com;

import java.util.Scanner;
import glearininginterface.com.*;
import glearningmodel.com.*;
import glearningservice.com.*;

public class DriverClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Harshit","Chowdary");
		
		ICredentials cs= new CredentialService();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
        System.out.println("2.Admnin");
	    System.out.println("3.Human Resource");
		System.out.println("4.Legal");

		Scanner sc= new Scanner(System.in);
		int option=sc.nextInt();
		
		String generatedEmail=null;
		String generatedPassword=null;
		
		switch (option) {
		
		case 1:{
			generatedEmail = cs.generateEmailAddress( employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"tech");
			generatedPassword= cs.generatePassword();
			
			break;
			
		}
		
		case 2:
		{
			generatedEmail = cs.generateEmailAddress( employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"adm");
			generatedPassword= cs.generatePassword();
			break;
		}
		case 3:
		{
			generatedEmail = cs.generateEmailAddress( employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"hr");
		generatedPassword= cs.generatePassword();
			
			break;
			}
		case 4:
		{
			generatedEmail = cs.generateEmailAddress( employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"lg");
		generatedPassword= cs.generatePassword();
			break;
			}
		default:{
			System.out.println("Enter a valid option");
		}
		
		}
		
	employee.setEmail(generatedEmail);
	
	employee.setPassword(generatedPassword);
	cs.showCredentials(employee);
	sc.close();
	}
		
	
	
}
