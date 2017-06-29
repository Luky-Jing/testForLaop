<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加病程</title>
    <style type="text/css">
        ul{list-style: none;}
        li{
            padding:5px;
            font-size: 12px;
        }
        body {
            align-content: center;
            text-align: center;
        }
        div {
            align-content: center;
            text-align: center;
        }
    </style>
    <script type="text/javascript">
        function check(form){
            with(form){
                if(Cno.value == ""){
                    alert("住院号不能为空！");
                    return false;
                }
                if(Cdate.value == ""){
                    alert("记录日期不能为空！");
                    return false;
                }
            }
        }
    </script>

</head>
<body>
<div style="text-align: center; align-content: center; border: 1px solid black">
    <div style="float: left; border: 1px solid red">
        <form action="ProgressServlet" method="post" onsubmit="return check(this);">
            <h2 style="width:350px;text-align: center;">添加病程信息</h2>
            <table border="1px">
                <tr>
                    <td>
                        住院号：
                    </td>
                    <td>
                        <input type="text" name="Cno">
                    </td>
                </tr>
                <tr>
                    <td>记录日期：</td>
                    <td><input type="text" name="Cdate"></td>
                </tr>
                <tr>
                    <td>当天情况：</td>
                    <td><textarea rows="5" cols="30" name="Csituat"></textarea></td>
                </tr>
                <tr>
                    <td>生命体征：</td>
                    <td><input type="text" name="Cuse"></td>
                </tr>
                <tr>
                    <td>药物使用：</td>
                    <td><input type="text" name="Csign"></td>
                </tr>
                <tr>
                    <td>服药时间：</td>
                    <td><input type="text" name="Cregimen"></td>
                </tr>
                <tr>
                    <td>辅助检查结果：</td>
                    <td><input type="text" name="Cresult"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="添　加"></td>
                </tr>
            </table>
        </form>
    </div>
    <div style="float: left">
        <img src="images/celan.jpg" height="370">
    </div>
</div>
</body>
</html>
