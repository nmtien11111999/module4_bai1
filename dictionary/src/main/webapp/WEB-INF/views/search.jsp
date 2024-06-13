<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<br/>
<h1>Ứng dụng ừ điển</h1>
<form action="/dictionary/result" method="get">
    <label for="word">Word VN</label>
    <input type="text" id="word" name="word">
    <br>
    <input type="submit" value="result">
</form>
</body>
</html>