package glearininginterface.com;


import glearningmodel.com.*;

public interface ICredentials {
	 public String generateEmailAddress(String firstname,String lastname,String department);
	 
	 public String generatePassword();
	 
	 public void showCredentials(Employee employee);
	 

}
