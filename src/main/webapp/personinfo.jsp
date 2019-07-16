<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/5 0005
  Time: 下午 3:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body background="img/6.jpg">
<form name="frm" action="">
    <table width="900"align="center">
        <h2 align="center"><font color=red face="宋体" size="6">基本信息填写</h2>

        <br>
        <br>

        <tr>
            <td align="right"><font color=Brown>员工编码：</font></td>
            <td><input type="text" name="username">
        </tr>
        <br>
        <tr>
            <td align="right"><font color=Brown>姓名：</font></td>
            <td><input type="text" name="username">
            <td align="right"><font color=Brown>性别：</font></td>
            <td><input type="radio" name="sex" value="男" checked>男
                <input type="radio" name="sex" value="女">女
        </tr>
        <tr>
            <td align="right"><font color=Brown>出生年月：</font></td>
            <td><input type="text" name="">
            <td align="right"><font color=Brown>年龄：</font></td>
            <td><input type="text" name="year" size="10">岁
        </tr>
        <tr>
            <td align="right"><font color=Brown>政治面貌：</font></td>
            <td><select name="favorite" size="1">
                <option value="dy">中共党员</option>
                <option value="ty">共青团员</option>
                <option value="qz">群众</option>
            </select>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
