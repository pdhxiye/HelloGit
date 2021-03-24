<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/2/16
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>报名界面</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/contestant/addApply" method="post">
        <input type="hidden" name="competitionId" value="${PCompetition.competitionId}">

            <table>
              <tr>
                  <td>姓名<input type="text" name="studentName" required></td>
              </tr>
                <tr>
                    <td>年级<input type="text" name="studentGrade" required></td>
                </tr>
                <tr>
                    <td>学号<input type="text" name="studentId" required></td>
                </tr>
                <tr>
                    <td><input type="submit" value="确认报名">
                    </td>

                </tr>
            </table>
    </form>
</div>
</body>
</html>
