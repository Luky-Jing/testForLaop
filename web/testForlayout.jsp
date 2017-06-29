<%--
  Created by IntelliJ IDEA.
  User: LiPeijing
  Date: 2017/6/11
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #header {
            background-color:black;
            color:white;
            text-align:center;
            padding:5px;
        }
        #nav {
            line-height:30px;
            background-color:#eeeeee;
            height:300px;
            width:100px;
            float:left;
            padding:5px;
        }
        #section {
            width:350px;
            float:left;
            padding:10px;
        }
        #footer {
            background-color:black;
            color:white;
            clear:both;
            text-align:center;
            padding:5px;
        }
    </style>
    <script type="text/javascript">

    </script>
</head>
<body>
<div id="header">
    <h1>City Gallery</h1>
</div>

<div id="nav">
    <input type="button" name="1" onclick="onClick" value="1"/> <br>
    <input type="button" name="2" onclick="onClick" value="2"/> <br>
    <input type="button" name="3" onclick="onClick" value="3"/> <br>
</div>

<div id="section">
    <h2 id="1">London</h2>
    <p id="2">
        London is the capital city of England. It is the most populous city in the United Kingdom,
        with a metropolitan area of over 13 million inhabitants.
    </p>
    <p id="3">
        Standing on the River Thames, London has been a major settlement for two millennia,
        its history going back to its founding by the Romans, who named it Londinium.
    </p>
</div>

<div id="footer">
    Copyright ? W3Schools.com
</div>

</body>
</html>
