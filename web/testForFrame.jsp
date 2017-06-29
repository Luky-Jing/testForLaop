<%--
  Created by IntelliJ IDEA.
  User: LiPeijing
  Date: 2017/6/11
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function OnClick() {
            document.getElementById("testframe").src="patient_list.jsp";
        }
    </script>

    <style type="text/css">
        div {
            border: #000 solid 5px;
            width: auto;
            height: auto;
        }
    </style>
</head>
<body>
<div>
    <div>header</div>
        <div>
            <div style="float: left; height: auto; width: 100px"></div>
            <div style="float: left; height: auto; width: 500px"></div>
        </div>
    <div style="position: fixed; bottom: 0px"></div>
</div>
</body>
</html>
