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
        <h2 align="center"><font color=red face="宋体" size="6">教育信息填写</h2>
        <br>
        <br>
        <tr>
            <td align="right"><font color=Brown>最高学历/学位：</font></td>
            <td><select name="" size="1">
                <option value="qz">请选择</option>
                <option value="dy">博士</option>
                <option value="ty">研究生/硕士</option>
                <option value="qz">本科/学士</option>
                <option value="qz">其他</option>
            </select>
            </td>
            <td align="right"><font color=Brown>证书及附件上传：<input type="file" name="" size="70"></font></td>

            </td>

        </tr>

        <tr>
            <td align="right"><font color=Brown>毕业学校：</font></td>
            <td><input type="text" name="">
            <td align="right"><font color=Brown>所学专业：</font></td>
            <td><input type="text" name="">
        </tr>
        <tr>
            <td align="right"><font color=Brown>所在分公司：</font></td>
            <td><input type="text" name="">
        </tr>
        <tr>
            <td align="right"><font color=Brown>部门：</font></td>
            <td><input type="text" name="">
            <td align="right"><font color=Brown>岗位：</font></td>
            <td><input type="text" name="">
        </tr>
        <tr>
            <td align="right"><font color=Brown>职称/职鉴：</font></td>
            <td><select name="" size="1">
                <option value="qz">请选择</option>
                <option value="dy">高级（高级技师）及以上</option>
                <option value="ty">中级</option>
                <option value="qz">初级</option>
                <option value="qz">无</option>
            </select>
            </td>
            <td align="right"><font color=Brown>证书及附件上传：<input type="file" name="" size="70"></font></td>

            </td>

        </tr>
        <tr>
            <td align="right"><font color=Brown>入职时间：</font></td>
            <td><input type="text" name="">
            <td align="right"><font color=Brown>职级：</font></td>
            <td><input type="text" name="">
        </tr>
        <tr>
            <td align="right"><font color=Brown>年度考核：</font></td>
            <td><select name="" size="1">
                <option value="">近三年考核</option>
                <option value="">三年全优</option>
                <option value="">两年优一年称职</option>
                <option value="">一年优两年称职</option>
                <option value="">三年称职</option>
            </select>

        </tr>
    </table>
</form>
</body>
</html>
