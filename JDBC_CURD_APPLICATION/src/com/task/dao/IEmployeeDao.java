package com.task.dao;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeDao {
	abstract public void insertEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException;
	abstract public void updateEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException;
	abstract public void deleteEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException;
	abstract public void displayEmployee(EmployeeBean bean) throws SQLException,ClassNotFoundException;

}
