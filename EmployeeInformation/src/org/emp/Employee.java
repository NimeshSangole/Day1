package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName()
	{
		System.out.println("nimesh");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empName();
		 
		Company c=new Company();
		c.companyName();
		
		Client d=new Client();
		d.clientName();
		
		Project p=new Project();
				p.projectName();
		
	}

}