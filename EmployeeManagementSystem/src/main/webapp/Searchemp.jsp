<%@page import="java.util.ArrayList"%>
<%@ page import="Model.Employee" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search employee</title>
</head>
<body>
<%ArrayList<Employee> emps=(ArrayList<Employee>) request.getAttribute("resultdisplay");%>

<form action="searchemp" method="post">
<input placeholder="enter the department u need to display" type="text" name="empDepartment">
<button>Search</button>
</form>
<table>
<tr>
<th>EMPID</th>
<th>NAME</th>
<th>AGE</th>
<th>DEPARTMENT</th>
<th>SALARY</th>
<th>EMAIL</th>
</tr>
<% if(emps==null ){ %>
<p></p>
<%}else if(emps.isEmpty()){ %>
<p>No data present in the the department</p>
<% }else{ %>
<% for(Employee emp: emps){%>
<tr>
<td><%=emp.getEmpId() %></td>
<td><%=emp.getEmpName() %></td>
<td><%=emp.getEmpAge() %></td>
<td><%=emp.getEmpDepartment() %></td>
<td><%=emp.getEmpSalary() %></td>
<td><%=emp.getEmpEmail() %></td>  
</tr>
<%}}  %>
</table>
<%
System.out.println("Employee list: " + emps);
%>




</body>
</html>