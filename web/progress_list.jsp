<%@ page import="item.Patient" %>
<%@ page import="java.util.List" %>
<%@ page import="item.ProgressNote" %><%--
  Created by IntelliJ IDEA.
  User: LiPeijing
  Date: 2017/6/10
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有病人信息</title>
    <style type="text/css">
        td {
            font-size: 12px;
        }
        h2 {
            margin: 0px
        }
    </style>
</head>
<body>
<table align="center" width="1300" border="1" bordercolor="white" bgcolor="black" cellpadding="1" cellspacing="1">
    <tr bgcolor="white">
        <td align="center" colspan="14">
            <h2>所有病人信息</h2>
        </td>
    </tr>
    <tr align="center" bgcolor="#e1ffc1" >
        <td><b>住院号</b></td>
        <td><b>记录日期</b></td>
        <td><b>当天情况</b></td>
        <td><b>生命体征</b></td>
        <td><b>药物使用</b></td>
        <td><b>服药时间</b></td>
        <td><b>辅助检查结果</b></td>
    </tr>
    <%
        // 获取病人信息集合
        List<ProgressNote> list = (List<ProgressNote>)request.getAttribute("list");
        // 判断集合是否有效
        if(list == null || list.size() < 1){
            out.print("没有数据！");
        }else{
            // 遍历病人集合中的数据
            for(ProgressNote progressNote : list){
    %>
    <tr align="center" bgcolor="white">
        <td><%=progressNote.getCno()%></td>
        <td><%=progressNote.getCdate()%></td>
        <td><%=progressNote.getCsituat()%></td>
        <td><%=progressNote.getCsign()%></td>
        <td><%=progressNote.getCuse()%></td>
        <td><%=progressNote.getCregimen()%></td>
        <td><%=progressNote.getCresult()%></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>