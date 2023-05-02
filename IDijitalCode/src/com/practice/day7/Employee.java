package com.practice.day7;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Employee {

	private String name;
	private Long employeeId, salary;
	private static String [] arrs;
	

	public Employee(String name, Long employeeId, Long salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}


	public Long getSalary() {
		return salary;
	}


	public void setSalary(Long salary) {
		this.salary = salary;
	}


	public static void topThree(Hashtable<Integer, Employee> hm) {
		arrs = null;
		for(int i = 1; i< hm.size(); i++) {
			if(i+1 <= hm.size()){
					if(hm.get(i).getSalary() < hm.get(i+1).getSalary()) {
						arrs[i] = hm.get(i+1).getName();
					}else {
						System.out.println(hm.get(i).getName());
					}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,Employee> hm=new Hashtable<>();
		hm.put(1, new Employee("A", 123l, 1000l));
		hm.put(2, new Employee("B", 321l, 15000l));
		
		System.out.println(hm.get(1).getSalary());
		System.out.println(hm.get(2).getSalary());
		topThree(hm);
		
	}

}
