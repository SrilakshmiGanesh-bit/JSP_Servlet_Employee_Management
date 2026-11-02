package Controller;

import java.io.IOException;

import Model.Employee;
import Service.EmpAddService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/insertemp")
public class EmployeeAddController  extends HttpServlet{
	Employee employee=new Employee();
	EmpAddService empadd=new EmpAddService();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId=Integer.valueOf(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		int empAge=Integer.valueOf(request.getParameter("empAge"));
		String empDepartment=request.getParameter("empDepartment");
		double empSalary=Double.valueOf(request.getParameter("empSalary"));
		String empEmail=request.getParameter("empEmail");
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpAge(empAge);
		employee.setEmpDepartment(empDepartment);
		employee.setEmpDepartment(empDepartment);
		employee.setEmpSalary(empSalary);
		employee.setEmpEmail(empEmail);
		String result=empadd.insertemp(employee);
		if(result.equals("Data inserted")) {
//			request.setAttribute(result, "data added successfully");
//			request.getRequestDispatcher("Displayemp.jsp").forward(request, response);
			response.sendRedirect("displayemployee");
		}
		else {
//			request.setAttribute(result, "data not added");
			request.getRequestDispatcher("Addemp.jsp").forward(request, response);
		}
		 
			
		
	}
}
