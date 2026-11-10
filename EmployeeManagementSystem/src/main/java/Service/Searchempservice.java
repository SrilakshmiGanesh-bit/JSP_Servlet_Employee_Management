package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.DBconnection;
import Model.Employee;

public class Searchempservice {
	Connection con=DBconnection.dbconnect();
	String searchemp="select * from empdata where empDepartment=?";
	public ArrayList<Employee>  searchemplogic(Employee employee) {
		ArrayList<Employee> transfers=new ArrayList<Employee>();
		try {
			PreparedStatement ps=con.prepareStatement(searchemp);
			ps.setString(1, employee.getEmpDepartment());
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();// create object everytime we createthere is a data present otherwise stores in same object and overrides
				emp.setEmpId(rs.getInt("empId"));
				emp.setEmpAge(rs.getInt("empAge"));
				emp.setEmpName(rs.getString("empName"));
				emp.setEmpDepartment(rs.getString("empDepartment"));
				emp.setEmpSalary(rs.getDouble("empSalary"));
				emp.setEmpEmail(rs.getString("empEmail"));
				
				transfers.add(emp);
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return transfers;
		
		
	}

}
