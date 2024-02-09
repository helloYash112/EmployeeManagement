package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.service.IEmployeeService;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst=null;
	

	@Override
	public void insertEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {		
		int empId=bean.getEmpId();
		String empName=bean.getEmpName();
		String empAddress=bean.getEmpAddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("insert into emp values(?,?,?)");
		 pst.setInt(1, empId);
		 pst.setString(2, empName);
		 pst.setString(3, empAddress);
		  pst.executeUpdate();
		  System.out.println("insert one record successfully");
		  
	}


	@Override
	public void updateEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpId();
		String empName=bean.getEmpName();
		
		
		
		Connection connect=DBUtil.getDBConnection();
		
		if(bean.getEmpAddress()==null)
		{
		
		pst=connect.prepareStatement("update emp set empname=? where empid=?");
		pst.setString(1, empName);
		
		pst.setInt(2, empId);
		pst.executeUpdate();
		System.out.println("NAME SUCCESSFULLY");
		}else
		{
			
			pst=connect.prepareStatement("update emp set empaddress=? where empid=?");
			
			pst.setString(1, bean.getEmpAddress());
			pst.setInt(2, empId);
			pst.executeUpdate();
			System.out.println("ADDRESS UPDATE SUCCFESSFULLY");
			
		}
	}


	@Override
	public void deleteEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		
		int id=bean.getEmpId() ;
		
		Connection con=DBUtil.getDBConnection();
		pst=con.prepareStatement("delete from emp where empid=?");  
		pst.setInt(1, id);
		pst.executeUpdate();
		System.out.println("DATA DELETED SUCESSFULLY");
	}


	@Override
	public void displayEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
        int id=bean.getEmpId() ;
		
		Connection con=DBUtil.getDBConnection();
		pst=con.prepareStatement("select * from emp where empid=?");  
		pst.setInt(1, id);
	    
		ResultSet rs=pst.executeQuery();
		System.out.println("EMPID   EMPNAME   EMPADDERESS");
		System.out.println("=====   =======   ===========");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"       "+rs.getString(3));
		}
		pst.close();
		System.out.println("DATA FETCH COMPLETED SUCESSFULLY");
		
		
	}


	

}
