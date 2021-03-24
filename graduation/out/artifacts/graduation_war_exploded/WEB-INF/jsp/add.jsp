<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/17
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发布竞赛</title>
</head>
<body>
<div align="center" style="top: 10%">
    <form action="${pageContext.request.contextPath}/competition/addCompetition" method="post">
        <table>
            <tr>
                <td>竞赛名称:</td>
                <td><input type="text" name="competitionName" required></td>
            </tr>
            <tr>
                <td>竞赛地点:</td>
                <td><input type="text" name="competitionPlace" required></td>
            </tr>
            <tr>
                <td>竞赛要求:</td>
                <td><input type="text" name="competitionText" required></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="确认发布"></td>
                    <span style="color: red">${error}</span>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
