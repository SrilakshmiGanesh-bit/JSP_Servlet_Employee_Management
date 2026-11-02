<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update employees data</title>
</head>
<body>
<form action="updateemployee" method="post">
<input placeholder="enter the id you need to update" type="number" name="empId">
<input placeholder="enter the emp name" type="text" name="empName">
<input placeholder="enter the emp age" type="number" name="empAge">
<input placeholder="enter the emp departmennt" type="text" name="empDepartment">
<input placeholder="enter the salary" type="number" name="empSalary">
<input placeholder="enter the email" type="email" name="empEmail">
<button>Update data</button>
</form>

</body>
</html>