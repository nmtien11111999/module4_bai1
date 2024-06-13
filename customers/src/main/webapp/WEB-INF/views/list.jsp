<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<h1>Currency Converter </h1>
<form action="/admin/result" method="post">
    <label for="rate">Rate: </label>
    <input type="text" id="rate" name="rate">
    <br>
    <label for="usd">USD</label>
    <input type="text" id="usd" name="usd">
    <br>
    <input type="submit" value="result">
</form>
</body>
</html>