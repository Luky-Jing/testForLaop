<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>医生子系统</title>
    <style>
        * {
            margin:0;
            padding:0;
            overflow: hidden;
        }
        body {
            width: 100%;
            height: 100%;
        }

        #header {
            width:100%;
            height:45px;
            background-color:#FF9900;
            text-align:center;
            padding:5px;
        }
        #center {
            width:100%;
            height:200px;
            background-color:#FFCC00;
        }
        #nav {
            background: #7b7b7b;
            width: 200px;
            height: 690px;
            float: left;
        }
        #section {
            background: #FFF;
            width: 1330px;
            height: 690px;
            float: left;
        }
        #footer {
            width:100%;
            height:20px;
            background-color:#FFFF00;
            text-align:center;
        }
        button {
            background: url("images/button.png");
            width: 200px;
            height: 90px;
        }
        b {
            text-decoration-style: double;
        }
    </style>

    <script type="text/javascript">
        function onClick1() {
            document.getElementById("section_iframe").src="FindServlet";
        }
        function onClick2() {
            document.getElementById("section_iframe").src="search_patient.jsp";
        }
        function onClick3() {
            document.getElementById("section_iframe").src="FindServletForUpdate";
        }
        function onClick4() {
            document.getElementById("section_iframe").src="addprogress.jsp";
        }
        function onClick5() {
            document.getElementById("section_iframe").src="FindServletForProgress";
        }
    </script>
</head>
<body>
<div id="header">
    <h1>东方医院医生子系统</h1>
</div>
<div id="centor">
    <div id="nav">
        <button name="1" onclick="onClick1()"><font size="4px"><b>查看所有病人信息</b></font></button> <br><br>
        <button name="2" onclick="onClick2()"><font size="4px"><b>模糊查找病人信息</b></font></button> <br><br>
        <button name="3" onclick="onClick3()"><font size="4px"><b>修改病人诊断信息</b></font></button> <br><br>
        <button name="4" onclick="onClick4()"><font size="4px"><b>录入病人病程信息</b></font></button> <br><br>
        <button name="5" onclick="onClick5()"><font size="4px"><b>查看病人病程信息</b></font></button> <br><br>
    </div>

    <div id="section">
        <iframe src="FindServlet" id="section_iframe" width="1325px" height="680px"></iframe>
    </div>

</div>
<div id="footer">
    医生子系统————景雨洁 联系方式：12345678912
</div>
</body>
</html>
