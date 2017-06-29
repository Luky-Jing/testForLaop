<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>医生子系统登陆</title>
    <style type="text/css">
        #center {
            border: #000 solid 5px;
            background: url("images/background.jpg");
            width: 734px;
            height: 600px;
        }

        #title {
            text-align: center;
        }

        body {
            text-align:center
        }
        #center {
            margin: 0 auto;
            width: 735px;
            height: 601px;
            border: 1px solid #F00
        }
    </style>

    <script style="text/javascript">
        function OnClick() {
            if (document.getElementById("username") == "") {
                alert("请输入用户名！");
                return false;
            }
            i = request.getAttribute("resul");
            if (i == 1) {
                alert("密码错误！");
                return false;
            }
        }
    </script>
</head>
<body>
<div id="center" style="font-family: 方正舒体;">
    <form action="LoginServlet" method="post">
        <h1 id="title">用户登录</h1>
        <div style="text-align: center">
            <b>用户名：</b><input type="text" name="username" id="username"><br /><br />
            <b>密　码：</b><input type="password" name="password" id="password"><br /><br />
            <input type="submit" value="登　录" id="button" onclick="OnClick()"/>
        </div>
    </form>
</div>
</body>
</html>
