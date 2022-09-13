<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lista de Usuarios</title>
</head>
<body>
<h2>Lista de Usuarios</h2>
<ul>
    <c:forEach items="${users}" var="u">
        <li>${u.username}</li>
    </c:forEach>
</ul>

</body>
</html>