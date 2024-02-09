package com.task.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.task.bean.EmployeeBean;
import com.task.service.EmployeeServiceImpl;

public class DemoCurd {
	static Scanner sc=null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		System.out.println("select your option");
		System.out.println("select 1 --> insert employee data");
		System.out.println("select 2 --> update employee data");
		System.out.println("select 3 --> delete employee data");
		System.out.println("select 4 --> read employee data");
		int testCase=sc.nextInt();
		switch(testCase) {
		case 1:{
			
			insertEmployee();
			break;
		}
		case 2:{
			updateEmployee();
			break;
		}
		case 3:{
			deleteEmployee();
			break;
		}
		case 4:{
			dispalyEmployee();
			break;
		}
		default :{
			System.out.println("enter sutable value");
			
		}
		
		
		}

	}

	private static void dispalyEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("ENTER EMPLOYEE ID TO FETCH RECORD");
		int id=sc.nextInt();
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpId(id);
		
		service.dispalyEmployee(bean);
		
	}

	private static void updateEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl ser=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		System.out.println("ENTER EMPLOYEE ID FOR UPDATE");
		int id=sc.nextInt();
		bean.setEmpId(id);
		System.out.println("WHAT YOU WANT TO UPDATE (name or adress)");
		System.out.println("SELECT 1 FOR NAME || SELECT 2 FOR ADDRESS");
		int option=sc.nextInt();
		switch(option) {
		case 1:{
			System.out.println("ENTER NEW NAME");
			String name=sc.next();
			bean.setEmpName(name);
			//bean.setEmpAddress("hello");
			//System.out.println(bean);
			ser.updateEmployee(bean);
			
			break;
			
		}
		case 2:{
			System.out.println("ENTER NEW ADDRESS");
			String add=sc.next();
			
			//bean.setEmpId(id);
			bean.setEmpAddress(add);
			ser.updateEmployee(bean);
			break;
		}
		
		
		default :{
			System.out.println("enter valid input");
		}
		
		}
		
	}

	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("ENTER EMPLOYEE ID TO DELETE RECORD");
		int id=sc.nextInt();
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpId(id);
		
		service.deleteEmployee(bean);
		
		
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {	
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		System.out.println("ENTER EMPLOYEE ID");
		int id=sc.nextInt();
		
		System.out.println("ENTER EMPLOYEE NAME");
		String name=sc.next();
		System.out.println("ENTER EMPLOYEE ADDRESS");
		String add=sc.next();
		EmployeeBean bean=new EmployeeBean(id,name,add);
		
		service.insertEmployee(bean);
		
	}

}
