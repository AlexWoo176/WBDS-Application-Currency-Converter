<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/5/2020
  Time: 6:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="${rate}"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="${usd}"/><br/>
    <input type="submit" id="submit" value="Converter"/>
    <h1>VND: ${result} </h1>
</form>
</body>
</html>
