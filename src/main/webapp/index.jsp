
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>河南联通人才评审系统</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <link rel="stylesheet" href="css/toastr.css" type="text/css" />
    <script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
    <script src="js/toastr.js" type="text/javascript"></script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.jsp" class="navbar-brand">河南联通人才评审系统</a></h1>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">欢迎登录  河南联通人才评审系统</a></li>
                <li><a href="AdminLoginOutServlet">安全退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>系统菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                        <li><a href="user.jsp"><i class="icon-font">&#xe008;</i>人才报名</a></li>
                        <li><a href="article.jsp"><i class="icon-font">&#xe005;</i>人才评审</a></li>
                        <li><a href="comment.jsp"><i class="icon-font">&#xe006;</i>评审规则管理</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
<footer class="footer">
    <div class="container">
        <p>
            Copyright &copy;2019 &nbsp;<a href="index.jsp">河南联通</a>版权所有
        </p>
    </div>
    <div id="gotop">
        <a class="gotop"></a>
    </div>
</footer>
</body>
</html>