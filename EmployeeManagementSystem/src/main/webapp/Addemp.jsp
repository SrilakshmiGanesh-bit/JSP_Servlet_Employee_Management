<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add employee details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>
<body>
<form action="insertemp" method="post">
<input placeholder="enter your id" type="number" name="empId"><br>
<input placeholder="enter your name" type="text" name="empName"><br>
<input placeholder="enter your age" type="number" name="empAge"><br>
<input placeholder="enter your department" type="text" name="empDepartment"><br>
<input placeholder="enter your salary" type="number" name="empSalary"><br>
<input placeholder="enter your email" type="email" name="empEmail"><br>
<button class="bg-danger"  type="submit">Add Employee</button>


</form>
<a href="displayemployee" >Display Employee</a>



</body>
</html>