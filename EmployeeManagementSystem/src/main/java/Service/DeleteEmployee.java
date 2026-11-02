package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.DBconnection;
import Model.Employee;

public class DeleteEmployee {
	Connection con=DBconnection.dbconnect();
	String Delete="delete from empdata where empId=? ";
	public String deleteemp(Employee employee) {
		String result=null;
		try {
			PreparedStatement ps=con.prepareStatement(Delete);
			ps.setInt(1, employee.getEmpId());
			int row=ps.executeUpdate();
			if(row>0) {
				result="data deleted";
			}
			else {
				result="data not inserted";
			}
		}catch(SQLException e) {
			result=e.getMessage();
		}
		return result;
	}

}
