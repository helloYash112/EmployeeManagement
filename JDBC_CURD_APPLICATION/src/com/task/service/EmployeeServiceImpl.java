package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		
		dao.insertEmployee(bean);
		
		
	}

	@Override
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		
		dao.updateEmployee(bean);
		
	}

	@Override
	public void deleteEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        EmployeeDaoImpl dao=new EmployeeDaoImpl();
        
		dao.deleteEmployee(bean);
		
	}

	
	
	@Override
	public void dispalyEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.displayEmployee(bean);
		
	}


}
