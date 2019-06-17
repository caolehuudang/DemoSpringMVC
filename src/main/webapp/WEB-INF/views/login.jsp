<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h2>Hello To DXC!</h2>
	<form:form action="validation" method="POST" modelAttribute="employeeLogin">
		
		<input name = "name" placeholder="name">
		
		<input name = "age" placeholder="age">
		
		<button name = "login">Login</button>
	</form:form>
</body>
</html>
