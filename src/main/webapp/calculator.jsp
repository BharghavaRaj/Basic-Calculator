<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator Page</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<form action="calc" method="post">
	<br>
		<h2 align="center">Simple Calculator</h2>
		<hr>
	<div class="row">
  		<div class="col">
    		<input type="number" class="form-control" name="fno" placeholder="enter first number" aria-label="First number"><br>
  </div>
  	<div class="col">
    		<input type="number" class="form-control" name="sno" placeholder="enter second number" aria-label="Second number">
  </div>
</div>

	<div align="justify">
	<button type="submit" name="btnAdd" class="btn btn-dark">Add +</button>
	<button type="submit" name="btnSub" class="btn btn-dark">Sub -</button>		
</div>	
<br>
		<h5>Result: <%= request.getAttribute("result") %></h5>
	</form>
</body>
<style>
	body
	{
		background-color: #9b9b9b;
	    display: flex;
	    justify-content: center;
	    align-items: center;
	    height: 100vh;
    }	
</style>
</html>