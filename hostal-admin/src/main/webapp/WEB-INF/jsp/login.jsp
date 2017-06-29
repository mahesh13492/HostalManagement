<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Admin Login</title>
<body>
	<div class="pen-title">
		<h1>Admin Login Form</h1>
	</div>
	<!-- Form Module-->
	<div class="module form-module">
		<div class="toggle"></div>
		<div class="form">
			<h2>Login to your account</h2>
			<form:form method="POST" action="login.do" modelAttribute="Login">
				<form:input path="username" id="username" />
				<form:input path="password" id="password" />
			</form:form> 
			 
			 <%-- <form action="#"> 
				<input type="text" placeholder="Username" /> 
				<input type="password" placeholder="Password" /> 
				<input type="submit" value="Login" />
			</form>  --%>
		</div>
		<div class="cta">
			<a href="#">Forgot your password?</a>
		</div>
	</div>

</body>
</html>
