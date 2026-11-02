package Controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.Employee;
import Service.Displayemp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/displayemployee")
public class DisplayEmployeeController extends HttpServlet {

	Displayemp displayemp=new Displayemp();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Employee> displayresult=displayemp.displayEmp();
//		int empId=Integer.valueOf(request.getParameter("empId"));
//		String empName=request.getParameter("empName");
//		int  empAge=Integer.valueOf(request.getParameter("empAge"));
//		String empDepartment=request.getParameter("empDeparment");
//		double empSalary=Double.valueOf(request.getParameter("empSalary"));
//		String empEmail=request.getParameter("empEmail")
		request.setAttribute("displayemployees", displayresult);
		request.getRequestDispatcher("Displayemp.jsp").forward(request, response);
		
		

		
	}
	

}
