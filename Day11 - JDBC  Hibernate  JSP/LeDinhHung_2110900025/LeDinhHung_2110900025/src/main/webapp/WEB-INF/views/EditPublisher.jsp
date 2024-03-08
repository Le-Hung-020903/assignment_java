<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Publisher</title>
</head>
<body>
<h1>Edit Publisher</h1>
<form action=${pageContext.request.contextPath}/EditPublisherServlet" method="post">
    <input type="hidden" name="publisherId" value="${publisher.PublisherId}">
    Publisher Name: <input type="text" name="publisherName" value="${publisher.PublisherName}"><br>
    Phone: <input type="text" name="phone" value="${publisher.Phone}"><br>
    Address: <input type="text" name="address" value="${publisher.Address}"><br>
    <input type="submit" value="Save Changes">
</form>
</body>
</html>
