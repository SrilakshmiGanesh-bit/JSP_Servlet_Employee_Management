//package Service;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import Model.DBconnection;
//import Model.Employee;
//
//public class EmpAddService {
//
//    String insertempdata =
//            "INSERT INTO empdata "
//            + "(empId, empName, empAge, empDepartment, empSalary, empEmail) "
//            + "VALUES (?, ?, ?, ?, ?, ?)";
//
//    public String insertemp(Employee employee) {
//
//        System.out.println("EmpAddService method started");
//
//        Connection con = DBconnection.dbconnect();
//
//        System.out.println("Connection received by service: " + con);
//
//        if (con == null) {
//            return "Connection is NULL. Check DBconnection console errors.";
//        }
//
//        try {
//            PreparedStatement ps = con.prepareStatement(insertempdata);
//            
//
//            ps.setInt(1, employee.getEmpId());
//            ps.setString(2, employee.getEmpName());
//            ps.setInt(3, employee.getEmpAge());
//            ps.setString(4, employee.getEmpDepartment());
//            ps.setDouble(5, employee.getEmpSalary());
//            ps.setString(6, employee.getEmpEmail());
//
//            int row = ps.executeUpdate();
//            System.out.println("Rows affected: " + row);
//
//            if (row == 1) {
//                return "Employee inserted successfully";
//            } else {
//                return "Employee not inserted";
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return "SQL Error: " + e.getMessage();
//
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}




package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.DBconnection;
import Model.Employee;

public class EmpAddService {
	
	
	String insertempdata="insert into empdata(empId,empName,empAge,empDepartment,empSalary,empEmail)"
			+ "values(?,?,?,?,?,?)";
	public String insertemp(Employee employee) {
		String result=null;
		try {
			Connection con=DBconnection.dbconnect();
			PreparedStatement ps=con.prepareStatement(insertempdata);
			ps.setInt(1, employee.getEmpId());
			ps.setString(2,employee.getEmpName());
			ps.setInt(3, employee.getEmpAge());
			ps.setString(4, employee.getEmpDepartment());
			ps.setDouble(5, employee.getEmpSalary());
			ps.setString(6, employee.getEmpEmail());
			
			int row=ps.executeUpdate();
			if(row==1) {
				result="Data inserted";
				
			}
			else {
				result="not inserted";
			}
		}catch (SQLException e) {
			// TODO: handle exception
			result=e.getMessage();
		}
		
		
		return result;
	}

}
