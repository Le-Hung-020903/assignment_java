<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create New Category</title>
</head>
<body>
<h1>Create New Category</h1>
<form action="${pageContext.request.contextPath}/AddCategoryServlet" method="post">
    Category Name: <input type="text" name="categoryName"><br>
    <input type="submit" value="Create">
</form>
</body>
</html>
