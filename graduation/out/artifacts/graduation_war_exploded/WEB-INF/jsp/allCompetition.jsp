<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/17
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<html>
<head>
    <title>全部竞赛</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>全部竞赛</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
              <tr>
                <th>竞赛名称</th>
                <th>相关操作</th>
              </tr>
            </thead>
            <tbody>
              <c:forEach var="competition" items="${QCompetition}">
                  <tr>
                      <td>${competition.competitionName}</td>
                      <td>
                          <a href="${pageContext.request.contextPath}/competition/toUpdate?id=${competition.competitionId}">修改比赛</a>
                          &nbsp; | &nbsp;
                          <a href="${pageContext.request.contextPath}/competition/delete/${competition.competitionId}">结束比赛</a>
                          &nbsp; | &nbsp;
                          <a href="${pageContext.request.contextPath}/contestant/query?id=${competition.competitionId}">报名情况</a>
                      </td>
                  </tr>
              </c:forEach>
            </tbody>
        </table>
    </div>
</div>
    </div>
</body>
</html>
