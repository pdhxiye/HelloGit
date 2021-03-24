<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/15
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>竞赛详情</title>

</head>
<body>
<div>
    <div>
        <label>竞赛地点</label>
        <input type="text" name="competition" value="${QCompetition.competitionPlace}">
    </div>
    <div>
        <label>竞赛要求</label>
        <input type="text" name="competition" value="${QCompetition.competitionText}">
    </div>
</div>
</body>
</html>
