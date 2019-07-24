<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/7/19
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>报名页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="./css/bootstrap.css" rel="stylesheet">
    <script src="js/vue.js"></script>
    <style type="text/css">
        .basicInfo{
            padding-left: 150px;
        }
        .eduInfo{
            padding-left: 150px;
        }
        .rewardInfo{
            padding-left: 150px;
        }
    </style>
</head>
<body>
<div class="jumbotron">
    <h1>河南联通IT人才综合评测指标</h1>
</div>
<div class="container">
    <form>
        <div class="basicInfo">
            <table width="900"align="center">
                <h2 ><font color=black face="宋体" size="6">基本信息填写</h2>
                <tr>
                    <td align="right"><font color=#286090>员工编码：</font></td>
                    <td><input type="text" name="username">
                </tr>
                <br>
                <tr>
                    <td align="right"><font color=#286090>姓名：</font></td>
                    <td><input type="text" name="username">
                    <td align="right"><font color=#286090>性别：</font></td>
                    <td><input type="radio" name="sex" value="男" checked>男
                        <input type="radio" name="sex" value="女">女
                </tr>
                <tr>
                    <td align="right"><font color=#286090>出生年月：</font></td>
                    <td><input type="text" name="">
                    <td align="right"><font color=#286090>年龄：</font></td>
                    <td><input type="text" name="year" size="10">岁
                </tr>
                <tr>
                    <td align="right"><font color=#286090>政治面貌：</font></td>
                    <td><select name="favorite" size="1">
                        <option value="dy">中共党员</option>
                        <option value="ty">共青团员</option>
                        <option value="qz">群众</option>
                    </select>
                    </td>
                </tr>
            </table>
        </div>
        <div class="eduInfo">
            <table width="900"align="center">
                <h2><font color=black face="宋体" size="6">教育信息填写</h2>
                <tr>
                    <td align="right"><<font color=#286090>>最高学历/学位：</font></td>
                    <td><select name="" size="1">
                        <option value="qz">请选择</option>
                        <option value="dy">博士</option>
                        <option value="ty">研究生/硕士</option>
                        <option value="qz">本科/学士</option>
                        <option value="qz">其他</option>
                    </select>
                    </td>
                    <td align="right"><font color=#286090>证书及附件上传：<input type="file" name="" size="70"></font></td>

                    </td>

                </tr>

                <tr>
                    <td align="right"><font color=#286090>毕业学校：</font></td>
                    <td><input type="text" name="">
                    <td align="right"><font color=#286090>所学专业：</font></td>
                    <td><input type="text" name="">
                </tr>
                <tr>
                    <td align="right"><font color=#286090>所在分公司：</font></td>
                    <td><input type="text" name="">
                </tr>
                <tr>
                    <td align="right"><font color=#286090>部门：</font></td>
                    <td><input type="text" name="">
                    <td align="right"><font color=#286090>岗位：</font></td>
                    <td><input type="text" name="">
                </tr>
                <tr>
                    <td align="right"><font color=#286090>职称/职鉴：</font></td>
                    <td><select name="" size="1">
                        <option value="qz">请选择</option>
                        <option value="dy">高级（高级技师）及以上</option>
                        <option value="ty">中级</option>
                        <option value="qz">初级</option>
                        <option value="qz">无</option>
                    </select>
                    </td>
                    <td align="right"><font color=#286090>证书及附件上传：<input type="file" name="" size="70"></font></td>
                    </td>

                </tr>
                <tr>
                    <td align="right"><font color=#286090>入职时间：</font></td>
                    <td><input type="text" name="">
                    <td align="right"><font color=#286090>职级：</font></td>
                    <td><input type="text" name="">
                </tr>
                <tr>
                    <td align="right"><font color=#286090>年度考核：</font></td>
                    <td><select name="" size="1">
                        <option value="">近三年考核</option>
                        <option value="">三年全优</option>
                        <option value="">两年优一年称职</option>
                        <option value="">一年优两年称职</option>
                        <option value="">三年称职</option>
                    </select>

                </tr>
            </table>
        </div>
        <div class="rewardInfo">
            <table width="1000"align="center">
                <h2><font color=black face="宋体" size="6">荣誉信息填写</h2>
                <tr>
                    <td align="right"><<font color=#286090>>荣誉奖章：</font></td>
                    <td align=""><select name="" size="1">
                        <option value="">请选择</option>
                        <option value="">国家级技术能手、五一劳动奖章、劳动模范（先进工作者、标兵）</option>
                        <option value="">省、部、集团级技术能手、五一劳动奖章、劳动模范（先进工作者、标兵）</option>
                        <option value="">地、厅、省公司级技术能手、五一劳动奖章、劳动模范（先进工作者、标兵）</option>
                        <option value="">无</option>
                    </select>

                </tr>
                <tr>
                    <td align="right"><font color=#286090>年度考核：</font></td>
                    <td align=""><select name="" size="1">
                        <option value="">近三年考核</option>
                        <option value="">三年全优</option>
                        <option value="">两年优一年称职</option>
                        <option value="">一年优两年称职</option>
                        <option value="">三年称职</option>

                    </select>

                </tr>
                <tr>
                    <td align="right"><font color=#286090>技能竞赛：</font></td>
                    <td><select name="" size="1">
                        <option value="">近三年考核</option>
                        <option value="">三年全优</option>
                        <option value="">两年优一年称职</option>
                        <option value="">一年优两年称职</option>
                        <option value="">三年称职</option>
                    </select>

                </tr>
                <tr>
                    <td align="right"><font color=#286090>科技进步、创新奖：</font></td>
                    <td><select name="" size="1">
                        <option value="">近三年考核</option>
                        <option value="">三年全优</option>
                        <option value="">两年优一年称职</option>
                        <option value="">一年优两年称职</option>
                        <option value="">三年称职</option>
                    </select>

                </tr>
                <tr>
                    <td align="right"><font color=#286090>专利：</font></td>
                    <td><select name="" size="1">
                        <option value=""></option>
                        <option value="">实用新型专利</option>
                        <option value="">无</option>

                    </select>

                </tr>

                <tr>
                    <td align="right"><font color=#286090>工作经历：</font></td>
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
        </div>
    </form>
</div>
</body>
</html>
