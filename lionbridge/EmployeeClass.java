package com.lionbridge;

public class EmployeeClass {
public static void main(String [] args) {
		
		Employee emp1 = new Employee( "Raja", "Roy", 3350 );
		Employee emp2 = new Employee( "Jesi", "Gro", -2300 );
		
		// yearly salary
		System.out.println( "Yearly salary of : "+ emp1.getFirstName()+ " "+  emp1.getLastName()+" " + emp1.getMonthlySalary() );
		System.out.println( "Yearly salary of : "+ emp2.getFirstName()+" "+ emp2.getLastName()+" " + emp2.getMonthlySalary() );
		
	
		
		// salary after 10% raise
		System.out.println( " Giving 10% raise for employee " );
		System.out.println( "Yearly salary of : "+emp1.getFirstName()+ " "+ emp1.getLastName()+ " "+ emp1.getRaiseSalary() );
		System.out.println( "Yearly salary of : "+emp2.getFirstName()+ " "+ emp2.getLastName()+ " "+ emp2.getRaiseSalary() );
	} 
 

}
/*
Output 
Yearly salary of : Raja Roy 3350.0
Yearly salary of : Jesi Gro 0.0
 Giving 10% raise for employee 
Yearly salary of : Raja Roy 44220.0
Yearly salary of : Jesi Gro 0.0



*/

