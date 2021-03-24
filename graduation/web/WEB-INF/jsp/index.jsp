<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/7
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学科竞赛管理系统</title><!--    表示标题-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/index.css"/>
</head>
<body>
<div class="left">
    <div class="welcome">
        <h1>学科竞赛管理系统</h1>
        <p>欢迎各位学子进入学科竞赛管理系统</p>
    </div>
</div>
<div class="right">
    <form action="${pageContext.request.contextPath}/register/login" method="post">
        <table>
            <caption>登录系统</caption>
            <tr>
                <td><label for="userId"/>用户名&nbsp;&nbsp;<input type="text" id="userId" name="userId" required></td>
            </tr>
            <tr>
                <td><label for="password"/>密&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" id="password" name="password" required></td>
            </tr>
            <tr>
                <td>登录权限<input type="radio" name="boy" value="teacher"  class="input-mini">管理员
                           <input type="radio" name="boy" value="student"  class="input-mini" checked="checked">学生
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="登录" class="resgit"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
