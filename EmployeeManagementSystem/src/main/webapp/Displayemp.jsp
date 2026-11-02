<%@ page import="java.util.ArrayList" %>
<%@ page import="Model.Employee" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display employees</title>
</head>
<body>
<% ArrayList<Employee> emps=(ArrayList<Employee>) request.getAttribute("displayemployees"); %>

<table >
<tr>
<td>Emp ID</td>
<td>Emp Name</td>
<td>Emp Age</td>
<td>Emp Department</td>
<td>Emp Salary</td>
<td>Emp Email</td>
</tr>

<% for(Employee emp: emps){%>

<tr>
<td><%=emp.getEmpId() %></td>
<td><%=emp.getEmpName() %></td>
<td><%=emp.getEmpAge() %></td>
<td><%=emp.getEmpDepartment() %></td>
<td><%=emp.getEmpSalary() %></td>
<td><%=emp.getEmpEmail() %></td>
</tr>
<%} %>
</table>

<a href="Updateemployee.jsp">Update employee</a>
<a href="Deleteemp.jsp">Delete employee</a>
</body>
</html>