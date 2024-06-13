<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Client List</title>
</head>
<body>
<h2>Client List</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="client" items="${clients}">
        <tr>
            <td>${client.id}</td>
            <td>${client.name}</td>
            <td>${client.email}</td>
            <td>${client.address}</td>
            <td>
                <a href="${pageContext.request.contextPath}/admin/client/${client.id}">View</a>
                <a href="${pageContext.request.contextPath}/admin/edit/${client.id}">Edit</a>
                <form action="${pageContext.request.contextPath}/admin/delete/${client.id}" method="post" style="display:inline">
                    <input type="submit" value="Delete"/>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/admin/create">Create New Client</a>
</body>
</html>