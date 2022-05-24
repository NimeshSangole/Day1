package org.emp;

public class Employee {
	public void empId()
	{
		System.out.println("Employee Id 12345");
	}
	public void empName()
	{
		System.out.println("Employee Name is Nimesh");
	}
	public void empDob()
	{
		System.out.println("Employee DOB is 5-8-1994");
	}
	public void empPhone()
	{
		System.out.println("Employee Phone Number is 8669060368");
	}
	public void empEmail()
	{
		System.out.println("Employee Email is nimeshsangole007@gmail.com");
	}
	public void empAddress()
	{
		System.out.println("Employee Address is Congress nagar pune");
	}
	public static void main(String[] args) {
		Employee s=new Employee();
		s.empId();
		s.empName();
		s.empDob();
		s.empPhone();
		s.empEmail();
		s.empAddress();
		
	}

}
