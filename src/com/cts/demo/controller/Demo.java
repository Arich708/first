package com.cts.demo.controller;

import com.cts.demo.model.Employee;

public class Demo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(1234567);
		emp.setEmpname("Alok");
		System.out.println("Employee Information\n...............................");
		System.out.println("Employee ID :"+emp.getEmpid());
		System.out.println("Employee name :"+emp.getEmpname());

	}

}
