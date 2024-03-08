<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Category</title>
</head>
<body>
<h1>Edit Category</h1>
<form action="${pageContext.request.contextPath}/EditCategoryServlet" method="post">
    <input type="hidden" name="categoryId" value="${category.categoryId}">
    Category Name: <input type="text" name="categoryName" value="${category.categoryName}"><br>
    <input type="submit" value="Save Changes">
</form>
</body>
</html>
