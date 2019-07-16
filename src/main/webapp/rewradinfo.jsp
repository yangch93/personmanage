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
    <table width="1000"align="center">
        <h2 align="center"><font color=red face="宋体" size="6">荣誉信息填写</h2>
        <br>
        <br>
        <tr>
            <td align="right"><font color=Brown>荣誉奖章：</font></td>
            <td align=""><select name="" size="1">
                <option value="">请选择</option>
                <option value="">国家级技术能手、五一劳动奖章、劳动模范（先进工作者、标兵）</option>
                <option value="">省、部、集团级技术能手、五一劳动奖章、劳动模范（先进工作者、标兵）</option>
                <option value="">地、厅、省公司级技术能手、五一劳动奖章、劳动模范（先进工作者、标兵）</option>
                <option value="">无</option>
            </select>

        </tr>
        <tr>
            <td align="right"><font color=Brown>年度考核：</font></td>
            <td align=""><select name="" size="1">
                <option value="">近三年考核</option>
                <option value="">三年全优</option>
                <option value="">两年优一年称职</option>
                <option value="">一年优两年称职</option>
                <option value="">三年称职</option>

            </select>

        </tr>
        <tr>
            <td align="right"><font color=Brown>技能竞赛：</font></td>
            <td><select name="" size="1">
                <option value="">近三年考核</option>
                <option value="">三年全优</option>
                <option value="">两年优一年称职</option>
                <option value="">一年优两年称职</option>
                <option value="">三年称职</option>
            </select>

        </tr>
        <tr>
            <td align="right"><font color=Brown>科技进步、创新奖：</font></td>
            <td><select name="" size="1">
                <option value="">近三年考核</option>
                <option value="">三年全优</option>
                <option value="">两年优一年称职</option>
                <option value="">一年优两年称职</option>
                <option value="">三年称职</option>
            </select>

        </tr>
        <tr>
            <td align="right"><font color=Brown>专利：</font></td>
            <td><select name="" size="1">
                <option value=""></option>
                <option value="">实用新型专利</option>
                <option value="">无</option>

            </select>

        </tr>

        <tr>
            <td align="right"><font color=Brown>工作经历：</font></td>
        </tr>
        <tr>
            <td colspan="4"  align="right"><textarea rows="10" cols="120"></textarea>
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2"><input type="button" value="报名" onclick="script:check()">
            </td>
            <td align="left" colspan="2"><input type="reset" value="重写">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
