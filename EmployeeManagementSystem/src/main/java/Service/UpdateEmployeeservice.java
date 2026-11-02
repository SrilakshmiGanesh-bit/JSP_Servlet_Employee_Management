package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.DBconnection;
import Model.Employee;

public class UpdateEmployeeservice {
	Connection con=DBconnection.dbconnect();
	String updatemp="update empdata set  empName=?, empAge=?, empDepartment=?, empSalary=?, empEmail=? where empId=?;";
	public String updateemployee(Employee employee) {
		String result=null;
		try {
			PreparedStatement ps=con.prepareStatement(updatemp);
			ps.setString(1, employee.getEmpName());
			ps.setInt(2, employee.getEmpAge());
			ps.setString(3, employee.getEmpDepartment());
			ps.setDouble(4, employee.getEmpSalary());
			ps.setString(5, employee.getEmpEmail());
			ps.setInt(6, employee.getEmpId());
			
			int row=ps.executeUpdate();
			if(row>0) {
				
				result="Data updated";
			}
			else {
				result="Data not inserted";
			}			
		}catch (SQLException e) {
			// TODO: handle exception
			result=e.getMessage();
		}
		return result;
	}

}
