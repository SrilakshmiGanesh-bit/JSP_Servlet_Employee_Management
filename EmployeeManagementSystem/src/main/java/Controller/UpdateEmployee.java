package Controller;

import java.io.IOException;

import Model.Employee;
import Service.UpdateEmployeeservice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateemployee")
public class UpdateEmployee  extends HttpServlet{
	UpdateEmployeeservice updateemp=new UpdateEmployeeservice();
	

	public void doPost(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException {
		int empId=Integer.valueOf(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		int empAge=Integer.valueOf(request.getParameter("empAge"));
		String empDepartment=request.getParameter("empDepartment");
		double empSalary=Double.valueOf(request.getParameter("empSalary"));
		String empEmail=request.getParameter("empEmail");
		Employee employee=new Employee();
		
		
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpAge(empAge);
		employee.setEmpDepartment(empDepartment);
		employee.setEmpSalary(empSalary);
		employee.setEmpEmail(empEmail);
		
		String result=updateemp.updateemployee(employee);
		
		if("Data updated".equals(result)){
			response.sendRedirect("displayemployee");
		}
		else {
			request.getRequestDispatcher("Updateemployee.jsp").forward(request, response);
		}
		
		
        
        
		
	}
	

}
