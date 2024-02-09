package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeService {
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
	public void updateEmployee(EmployeeBean bean)  throws ClassNotFoundException, SQLException;
	public void deleteEmployee(EmployeeBean bean)throws ClassNotFoundException, SQLException;
	public void dispalyEmployee(EmployeeBean bean)throws SQLException,ClassNotFoundException;

	

}
