<%@ page import="item.Patient" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LiPeijing
  Date: 2017/6/11
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testForFind</title>
    <style type="text/css">
        #test {
            align-content: center;
            text-align: center;
        }

        div {
            border: solid 1px black;
            text-align: center;
        }
    </style>
</head>
<body>
<div>
    <img src="images/icon.jpg">
</div>
<br>
<br>
<div id="test">
    <form action="FindServletForSearch" method="get">
        <h2>住院号：</h2>
        <input type="text" name="Pno"><br><br>
        <input type="submit" name="OK" onclick="OnClick()">
    </form>
</div>
</body>
</html>
