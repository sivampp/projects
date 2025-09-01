package com.emp;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {


    public Employee(Long id, String firstName, String lastName, String dOB, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dOB = dOB;
        this.salary = salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Long id;
    String firstName;
    String lastName;
    String dOB;
    double salary;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getdOB() {
        return dOB;
    }

    public double getSalary() {
        return salary;
    }

    boolean equals(Employee obj){

            if(this.getFirstName().equalsIgnoreCase(obj.getFirstName().toLowerCase())){
                return true;
            }
        return false;
    }

    public int compareTo(Employee emp){

        return this.firstName.compareTo(emp.getFirstName());


    }
    
    public int compare(Employee e1, Employee e2) {
		if(e1.id > e2.id)
		{
			return 1;
		}
			
		else 
			{
			return -1;
			}
	}
    
    	public Comparator<Employee> com = new Comparator<Employee>() {
    	public int compare(Employee e1, Employee e2) {
    		if(e1.id > e2.id)
    		{
    			return 1;
    		}
    			
    		else 
    			{
    			return -1;
    			}
    	}
    	};
   

    
}
