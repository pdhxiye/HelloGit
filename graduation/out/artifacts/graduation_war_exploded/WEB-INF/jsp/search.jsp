<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/14
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>竞赛界面</title>
    <link href="${pageContext.request.contextPath}/static/css/search.css" rel="stylesheet">
</head>
<body>
<div class="left">
    <div style="font-size: 30px;color: red" align="center">${error}</div>
    <div class="left-mini">
        <table class="table">
            <thead>
               <tr>
                   <th>竞赛名称</th>
                   <th>相关操作</th>
               </tr>
            </thead>
            <tbody>
            <c:forEach var="competition" items="${competitions}">

                    <tr>
                        <td>${competition.competitionName}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/competition/toSee?id=${competition.competitionId}">查看</a>
                            &nbsp;&nbsp;
                            <a href="${pageContext.request.contextPath}/contestant/apply?id=${competition.competitionId}&UserId=${PStudent.studentId}">报名</a>
                        </td>
                    </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
