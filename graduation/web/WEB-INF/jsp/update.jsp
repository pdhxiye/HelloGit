<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/17
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>修改比赛</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改竞赛</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/competition/update" method="post">
        <input type="hidden" name="competitionId" value="${competitions.competitionId}">
        <div class="form-group">
            <label>比赛名称</label>
            <input type="text" name="competitionName" class="form-control" value="${competitions.competitionName}" required>
        </div>
        <div class="form-group">
            <label>比赛地点</label>
            <input type="text" name="competitionPlace" class="form-control" value="${competitions.competitionPlace}"  required>
        </div>
        <div class="form-group">
            <label>比赛要求</label>
            <input style="height: 200px" type="text" name="competitionText" class="form-control" value="${competitions.competitionText}"  required>
        </div>
        <div class="form-group">
            <input type="submit" value="确认修改">
        </div>
    </form>
</div>
</body>
</html>
