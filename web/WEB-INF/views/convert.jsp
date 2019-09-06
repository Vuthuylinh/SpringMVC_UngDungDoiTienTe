<%--
  Created by IntelliJ IDEA.
  User: Linh Vu
  Date: 9/5/2019
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ConvertMoney</title>
</head>
<body>
<h3>Convert Money</h3>
<form method="post" action="/moneyConvert">
    USD: <input type="text" name="usd" >
    <br>
    <br>
    Rate: <input type="text" name="rate">
    <br>
    <br>
    <input type="submit" value="Convert">
</form>

</body>
</html>
