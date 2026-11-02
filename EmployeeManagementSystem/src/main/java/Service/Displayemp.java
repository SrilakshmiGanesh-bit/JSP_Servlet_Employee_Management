package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.DBconnection;
import Model.Employee;

public class Displayemp {
	Connection con=DBconnection.dbconnect();
	String displayemp="select * from empdata";
	
	
	public ArrayList<Employee> displayEmp() {
		
		ArrayList<Employee> emptransfer=new ArrayList<Employee>();

		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(displayemp);
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpId(rs.getInt("empId"));
				emp.setEmpName(rs.getString("empName"));
				emp.setEmpAge(rs.getInt("empAge"));
				emp.setEmpDepartment(rs.getString("empDepartment"));
				emp.setEmpSalary(rs.getDouble("empSalary"));
				emp.setEmpEmail(rs.getString("empEmail"));	
				emptransfer.add(emp);
			}	
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return emptransfer ;
	}

}
