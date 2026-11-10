package Controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.Employee;
import Service.Searchempservice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/searchemp")
public class Searchempcontroller extends  HttpServlet{
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Employee employee=new Employee();
	Searchempservice searchempservice=new Searchempservice();
	String empDepartment=request.getParameter("empDepartment");
	
	employee.setEmpDepartment(empDepartment);
	
	ArrayList<Employee> result=searchempservice.searchemplogic(employee);
	
	request.setAttribute("resultdisplay", result);
	
	request.getRequestDispatcher("Searchemp.jsp").forward(request, response);;
	
	
}
}
