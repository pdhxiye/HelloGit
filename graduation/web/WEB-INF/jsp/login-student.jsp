<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL                                                                                                        
  Date: 2021/2/8
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生界面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login-student.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
</head>
<body>
<div class="search-box">
    <form action="${pageContext.request.contextPath}/competition/query" method="post">
        <input type="hidden" name="studentId" value="${student.studentId}">
        <input type="text" name="queryCompetitionName" placeholder="请输入要查询的竞赛" class="search-txt">
        <input type="submit" value="查询">
    </form>
</div>
</body>
</html>
