<%@ page import="item.Patient" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入病人诊断信息</title>
    <style type="text/css">
        form{margin: 0px;}
        td{font-size: 12px;}
        h2{margin: 2px}
    </style>
    <script type="text/javascript">
        function check(form){
            with(form){
                if(Diagnosis.value == ""){
                    alert("请输入更新！");
                    return false;
                }
                return true;
            }
        }
    </script>
</head>
<body>
<table align="center" width="1000" border="1" bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
    <tr bgcolor="white">
        <td align="center" colspan="14">
            <h2>所有病人信息</h2>
        </td>
    </tr>
    <tr align="center" bgcolor="#e1ffc1" >
        <td><b>住院号</b></td>
        <td><b>姓名</b></td>
        <td><b>身份证号</b></td>
        <td><b>性别</b></td>
        <td><b>出生日期</b></td>
        <td><b>家庭住址</b></td>
        <td><b>联系人</b></td>
        <td><b>联系电话</b></td>
        <td><b>主管医生编号</b></td>
        <td><b>诊断结果</b></td>
        <td><b>入住日期</b></td>
        <td><b>截至日期</b></td>
        <td><b>病房号</b></td>
        <td><b>床位号</b></td>
    </tr>
    <%
        // 获取病人信息集合
        List<Patient> list = (List<Patient>)request.getAttribute("list");
        // 判断集合是否有效
        if(list == null || list.size() < 1){
            out.print("没有数据！");
        }else{
            // 遍历病人集合中的数据
            for(Patient patient : list){
    %>
    <tr align="center" bgcolor="white">
        <td><%=patient.getPno()%></td>
        <td><%=patient.getPname()%></td>
        <td><%=patient.getPnum()%></td>
        <td><%=patient.getPsex()%></td>
        <td><%=patient.getPbirth()%></td>
        <td><%=patient.getPaddress()%></td>
        <td><%=patient.getContact()%></td>
        <td><%=patient.getPhone()%></td>
        <td><%=patient.getSno()%></td>
        <td><%=patient.getDiagnosis()%></td>
        <td><%=patient.getPdate()%></td>
        <td><%=patient.getEdate()%></td>
        <td><%=patient.getWno()%></td>
        <td><%=patient.getBno()%></td>
    </tr>

    <tr bgcolor="white">
        <td>修改诊断：</td>
        <td colspan="13">
            <form action="UpdateServlet" method="post" onsubmit="return check(this);">
                <input type="hidden" name="Pno" value="<%=patient.getPno()%>">
                <input type="text" name="Diagnosis" size="140">
                <input type="submit" value="修　改">
            </form>
        </td>
    </tr>
    <%

            }
        }
    %>
</table>
</body>
</html>
