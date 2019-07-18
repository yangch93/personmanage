<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/7/17
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="./css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
        }

        .form-signin {
            max-width: 300px;
            padding: 19px 29px 29px;
            margin: 0 auto 20px;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
            box-shadow: 0 1px 2px rgba(0,0,0,.05);
        }
        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }
        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }

    </style>
    <link href="./css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <form class="form-signin" method="get" action="login">
        <h2 class="form-signin-heading">登录页面</h2>
        <input type="text" class="input-block-level" placeholder="请输入账号" name="useraccount">
        <input type="password" class="input-block-level" placeholder="请输入密码" name="password">
        <label class="checkbox">
            <input type="checkbox" value="remember-me">
        </label>
        <button class="btn btn-block btn-primary" type="submit">登录</button>
    </form>

</div>
<script src="./js/jquery.js"></script>
<script src="./js/bootstrap.js"></script>
</body>
</html>
