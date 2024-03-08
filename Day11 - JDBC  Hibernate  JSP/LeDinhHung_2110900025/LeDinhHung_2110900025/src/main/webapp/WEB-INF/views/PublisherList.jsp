<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Publisher List</title>
</head>
<body>
<h1>Publisher List</h1>
<table border="1">
    <tr>
        <th>Publisher ID</th>
        <th>Publisher Name</th>
        <th>Phone</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <%-- Loop through the list of publishers and display each publisher --%>
    <c:forEach var="publisher" items="${publisherList}">
        <tr>
            <td>${publisher.PublisherId}</td>
            <td>${publisher.PublisherName}</td>
            <td>${publisher.Phone}</td>
            <td>${publisher.Address}</td>
            <td><a href="EditPublisher?publisherId=${publisher.PublisherId}">Edit</a></td>
            <td><a href="DeletePublisher?publisherId=${publisher.PublisherId}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="CreatePublisher">Create New Publisher</a>
</body>
</html>
