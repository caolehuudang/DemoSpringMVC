<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h2>Register</h2>
	<form:form action="regiterAction" method="POST" modelAttribute="employeeRegister">
		
		<input name = "name" placeholder="name">
		
		<input name = "age" placeholder="age">
		
		<input name = "address" placeholder="address">
		
		<button name = "register">Register</button>
	</form:form>
</body>
</html>
