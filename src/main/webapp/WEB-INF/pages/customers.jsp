<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Bibibi Lili</title>

    <link type="text/css" rel = "stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
Customers
    <div id = "container">
        <input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd';return 'false';"
               class="addButton"/>
        <div id = "content">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>

                <c:forEach var="tempCustomer" items = "${customers}">
                    <tr>
                        <td>${tempCustomer.firstName}</td>
                        <td>${tempCustomer.secondName}</td>
                        <td>${tempCustomer.email}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

</body>
</html>
