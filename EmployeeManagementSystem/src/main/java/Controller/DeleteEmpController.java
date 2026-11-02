package Controller;

import java.io.IOException;

import Model.Employee;
import Service.DeleteEmployee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteemp")
public class DeleteEmpController extends HttpServlet {
	Employee employee=new Employee();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int empId=Integer.valueOf(request.getParameter("empId"));
		employee.setEmpId(empId);
		DeleteEmployee delemp=new DeleteEmployee();
		
		String result=delemp.deleteemp(employee);
		if(result.equals("data deleted")) {
			response.sendRedirect("displayemployee");
		}
		else {
			request.getRequestDispatcher("Deleteemp.jsp").forward(request, response);
		}		
	}

}
