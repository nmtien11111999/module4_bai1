<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Client Details</title>
</head>
<body>
<h2>Client Details</h2>
<p>ID: ${client.id}</p>
<p>Name: ${client.name}</p>
<p>Email: ${client.email}</p>
<p>Address: ${client.address}</p>
<a href="${pageContext.request.contextPath}/admin/home">Back to List</a>
</body>
</html>
