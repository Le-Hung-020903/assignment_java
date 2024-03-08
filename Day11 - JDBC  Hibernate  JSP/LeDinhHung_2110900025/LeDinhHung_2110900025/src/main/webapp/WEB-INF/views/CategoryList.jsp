<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Category List</title>
</head>
<body>
<h1>Category List</h1>
<table border="1">
    <tr>
        <th>Category ID</th>
        <th>Category Name</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <%-- Loop through the list of categories and display each category --%>
    <c:forEach var="category" items="${categoryList}">
        <tr>
            <td>${category.categoryId}</td>
            <td>${category.categoryName}</td>
            <td><a href="EditCategory.jsp?categoryId=${category.categoryId}">Edit</a></td>
            <td><a href="DeleteCategory.jsp?categoryId=${category.categoryId}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="CreateCategory.jsp">Create New Category</a>
</body>
</html>
