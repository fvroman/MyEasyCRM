<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>

<body>
<form:form action="saveCustomer" modelAttribute="customer" method="POST">
    Name <form:input path="firstName"/>
    Second Name <form:input path="secondName"/>
    Email <form:input path="email"/>
    <input type="submit"/>
</form:form>

</body>

</html>